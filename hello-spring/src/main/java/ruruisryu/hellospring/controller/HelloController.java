package ruruisryu.hellospring.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        // resources/templates 산하에 있는 hello.html파일을 찾아 렌더링을 한다.
        return "hello";
    }
}
