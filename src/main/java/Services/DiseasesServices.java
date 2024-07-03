package Services;

import Models.Diseases;
import Repositories.IDiseasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DiseasesServices {
    @Autowired
    IDiseasesRepository iDiseasesRepository;

    public ArrayList<Diseases> getAllDiseases() {
        return (ArrayList<Diseases>) iDiseasesRepository.findAll();
    }

   public Diseases createDiseases (Diseases newDiseases){
        return iDiseasesRepository.save(newDiseases);
   }


}
