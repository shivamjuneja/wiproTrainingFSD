package com.trainingapps.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DemoController {

    private Map<Long, User> store = new HashMap<>();

    private long generatedId;

    public long generateId() {
        return ++generatedId;
    }

    @GetMapping("/greet")
    public ModelAndView greeting() {
        String message = "welcome to spring webmvc";
        ModelAndView mv = new ModelAndView("welcome", "msg", message);
        return mv;
    }

    @GetMapping("/getuser")
    public ModelAndView getUser() {
        return new ModelAndView("getuser");
    }

    @GetMapping("/userdetails")
    public ModelAndView userDetails(@RequestParam long id) {
        User user = store.get(id);
        ModelAndView mv = new ModelAndView("userprofile", "user", user);
        return mv;
    }

    @GetMapping("/processadduser")
    public RedirectView addUser(@RequestParam String name, @RequestParam int age) {
        long id = generateId();
        User user = new User(id,name,age);
        store.put(id,user);
        String url="/userdetails?id="+id;
        RedirectView redirect = new RedirectView(url);
        return redirect;
    }

    @GetMapping("/adduser")
    public ModelAndView getAddUserPage(){
        return new ModelAndView("adduser");
    }

    @GetMapping("/listusers")
    public ModelAndView getUserList(){
        Collection<User> users=store.values();
        ModelAndView modelAndView=new ModelAndView("listusers","users",users);
        return modelAndView;
    }


}
