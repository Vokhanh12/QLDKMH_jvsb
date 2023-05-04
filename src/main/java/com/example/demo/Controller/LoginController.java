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
        return "dashboard";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        accounts user = userService.login(username, password);
        if (user != null) {

            if(user.get_matk().contains("msv")){
                return "pageSV";
            } else if (user.get_matk().contains("mgv")) {
                return "pageGV";
            } else if(user.get_matk().contains("mpdt")){
                return "pageADMIN";
            } else{return null;}

        } else {
            // đăng nhập thất bại
            model.addAttribute("message", "Invalid username or password");
            return "login";
        }
    }
}