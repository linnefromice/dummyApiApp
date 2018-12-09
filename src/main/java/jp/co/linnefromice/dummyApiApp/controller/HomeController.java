package jp.co.linnefromice.dummyApiApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home/th")
    public String homeTh(Model model) {
    	model.addAttribute("message", "Hello Thymeleaf!!");
        return "thymeleaf/home";
    }

    @RequestMapping("/home/react")
    public String homeReact(Model model) {
    	model.addAttribute("message", "Hello React!!");
        return "react/home";
    }

    @RequestMapping("/home/vue")
    public String homeVue(Model model) {
    	model.addAttribute("message", "Hello Vue!!");
        return "vue/home";
    }
}
