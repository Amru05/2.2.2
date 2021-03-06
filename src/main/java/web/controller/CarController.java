package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    List<Car> cars;

    @GetMapping("/cars")
    public String getCars(@RequestParam(name = "count", required = false, defaultValue = "5") Integer count,
                          ModelMap model) {
        model.addAttribute("cars", cars);
        return "cars";
    }
}
