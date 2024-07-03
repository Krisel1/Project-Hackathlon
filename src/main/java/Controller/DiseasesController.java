package Controller;

import Models.Diseases;
import Services.DiseasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

@PostMapping(path = "/diseases")
    public Diseases createDiseases(@RequestBody Diseases newDiseases){
        return diseasesServices.createDiseases(newDiseases);
}

}
