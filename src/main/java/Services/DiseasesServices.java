package Services;

import Models.Diseases;
import Repositories.IDiseasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DiseasesServices {
    @Autowired
    IDiseasesRepository iDiseasesRepository;

    public ArrayList<Diseases> getAllDiseases() {
        return (ArrayList<Diseases>) iDiseasesRepository.findAll();
    }

    public boolean deleteDiseases(Long id) {
        Optional<Diseases> optionalDiseases = iDiseasesRepository.findById(id);
        if (optionalDiseases.isPresent()) {
            iDiseasesRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
