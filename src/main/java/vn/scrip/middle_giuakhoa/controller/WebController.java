package vn.scrip.middle_giuakhoa.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController
{
    @GetMapping("/error")
    public String handleError() {
        return "error";
    }
}







