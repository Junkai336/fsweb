package hello.hellospring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
    public String home() {
    return "home";
}
// root으로 들어오면 home.html로 연결해라.
}
