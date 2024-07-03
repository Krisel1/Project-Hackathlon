package Services;

import Models.Diseases;
import Repositories.IDiseasesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class DiseasesServices {
    @Autowired
    IDiseasesRepository iDiseasesRepository;

    public ArrayList<Diseases> getAllDiseases() {
        return (ArrayList<Diseases>) iDiseasesRepository.findAll();
    }
}
