package controller;

import models.Diseases;
import view.DiseasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DiseasesController {

    @Autowired
    DiseasesServices diseasesServices;

    @GetMapping(path = "/diseases")
    public ArrayList<Diseases> getAllDiseases() {
        return diseasesServices.getAllDiseases();
    }

    @GetMapping(path = "/diseases/search")
    public ArrayList<Diseases> findByName(@RequestParam String name) {
        return diseasesServices.findByName(name);
    }

    @DeleteMapping(path = "/diseases/{id}")
    public void deleteDiseases(@PathVariable Long id) {
        diseasesServices.deleteDiseases(id);
    }

    @PostMapping(path = "/diseases")
    public Diseases createDiseases(@RequestBody Diseases newDiseases){
        return diseasesServices.createDiseases(newDiseases);
    }

    @PutMapping(path = "diseases/{id}")
    public Optional<Diseases> updateDiseases(@PathVariable Long id, @RequestBody Diseases diseasesDetail) {
        return diseasesServices.upadateDiseases(id, diseasesDetail);
    }
}
