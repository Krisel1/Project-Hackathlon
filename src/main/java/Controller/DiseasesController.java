package Controller;

import Models.Diseases;
import Services.DiseasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class DiseasesController {
    @Autowired
    DiseasesServices diseasesServices;

    @GetMapping(path = "/diseases")
    public ArrayList<Diseases> getAllDiseases() {
        return diseasesServices.getAllDiseases();
    }


}
