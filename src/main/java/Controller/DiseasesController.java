package Controller;

import Models.Diseases;
import Services.DiseasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

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

@PutMapping(path = "diseases/{id}")
    public Optional<Diseases> updateDiseases(@PathVariable Long id, @RequestBody Diseases diseasesDetail){
        return diseasesServices.upadateDiseases(id, diseasesDetail);
}

}
