package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ListController {

    @PostMapping("/listsv")
    public String getListSV(Model model) {
        // Do something
        return "listsv";
    }

    @PostMapping("/listgv")
    public String getListGV(Model model) {
        // Do something
        return "listgv";
    }


}
