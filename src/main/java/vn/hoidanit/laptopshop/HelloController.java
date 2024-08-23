package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("User")
    public String UserPage() {
        return "Only AUser access";
    }

    @GetMapping("Admin")
    public String AdminPage() {
        return "Only Page";
    }

    @GetMapping("/")
    public String index() {
        return "Hello Boot!";
    }
}
