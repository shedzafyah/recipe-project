package zw.co.fyah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * created by Shelton 03/08/21
 */

@Controller
@RequestMapping
public class IndexController {

    @GetMapping({"","/","index"})
    public String home(){
        System.out.println("printing.....123");
        return "index";
    }
}
