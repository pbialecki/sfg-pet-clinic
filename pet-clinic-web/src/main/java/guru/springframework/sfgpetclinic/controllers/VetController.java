package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Paweł on 20.11.2018.
 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }

}
