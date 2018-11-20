package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Paweł on 20.11.2018.
 */
@Controller
public class OwnerController {

    @RequestMapping({"/owners", "/owners/", "/owners/index.html"})
    public String listOwners(){
        return "owners/index";
    }

}
