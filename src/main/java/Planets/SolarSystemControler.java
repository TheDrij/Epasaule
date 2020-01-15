package Planets;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SolarSystemControler {
    private List<String> planets=new ArrayList<String>();
    @RequestMapping("/")
    public String SolarSystem(Model model){
        planets.add("hey pluto");
        planets.add("hey pluto");
        planets.add("hey pluto");

        model.addAttribute("planets",planets);
        return"SolarSystem";
    }
    @RequestMapping("/saveplanet")
    public String saveplanet(@RequestParam("planet") String planet, Model model){
        planets.add(planet);
        model.addAttribute("planets",planets);
        return "SolarSystems";
    }
}
