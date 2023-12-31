package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller

public class HelloController {

    //    @GetMapping("/")
//    public String index() {
//        return "index";
//    }
    @GetMapping("hellohi")
    public String hello(Model model) {
        model.addAttribute("data", "강경신님");
        return "hello";
    }

    @GetMapping("/fruit")
    public String getFruit(Model model) {
        // Model 객체를 통해 view(타임리프 html)로 전달
        Map<String, String> fruitmap = new HashMap<String, String>();
        fruitmap.put("fruit1", "apple");
        fruitmap.put("fruit2", "banana");
        fruitmap.put("fruit3", "orange");
        model.addAttribute("fruit", fruitmap);

        return "fruit/fruit";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name", required = false) String name,Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody // http 헤더부와 바디부가 있는데 바디부에 이 데이터를 직접 넣어줌
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }
}
