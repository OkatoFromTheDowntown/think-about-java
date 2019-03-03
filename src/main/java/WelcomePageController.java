package main.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomePageController {

    @RequestMapping(value="welcome")
    public String WelcomePage() {
        return "welcome";
    }
}
