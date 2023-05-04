package com.example.demo.Controller;

import com.example.demo.Entity.accounts;
import com.example.demo.Service.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private accountService userService;


    @RequestMapping("/")
    public String index(){
        return "login";
    }





    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        accounts user = userService.login(username, password);
        if (user != null) {
            //đăng nhập thành công
            if(user.get_matk().contains("msv")){
                model.addAttribute("matk",user.get_matk());
                return "pageSV";
            } else if (user.get_matk().contains("mgv")) {
                model.addAttribute("matk",user.get_matk());
                return "pageGV";
            } else if(user.get_matk().contains("mpdt")){
                model.addAttribute("matk",user.get_matk());
                return "pageADMIN";
            } else{return null;}

        } else {
            // đăng nhập thất bại
            model.addAttribute("message", "Invalid username or password");
            return "login";
        }
    }
}