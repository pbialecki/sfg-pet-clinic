package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Paweł on 20.11.2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index.html"})
    public String index(){
        return "index";
    }

}
