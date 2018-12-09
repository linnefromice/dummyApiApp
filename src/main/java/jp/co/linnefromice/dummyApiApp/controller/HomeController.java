package jp.co.linnefromice.dummyApiApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home/th")
    public String homeTh() {
        return "return/home";
    }

    @RequestMapping("/home/react")
    public String homeReact() {
        return "return/react";
    }

    @RequestMapping("/home/vue")
    public String homeVue() {
        return "return/vue";
    }
}
