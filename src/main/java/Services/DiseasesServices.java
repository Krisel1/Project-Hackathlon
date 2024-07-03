package Services;

import Models.Diseases;
import Repositories.IDiseasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
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

   public Diseases createDiseases (Diseases newDiseases){
        return iDiseasesRepository.save(newDiseases);
   }
public Optional<Diseases> upadateDiseases(Long id, Diseases diseasesDetail){
        return iDiseasesRepository.findById(id)
                .map(diseases -> {
                   diseases.setName(diseasesDetail.getName());
                   diseases.setDescription(diseasesDetail.getDescription());
                   return iDiseasesRepository.save(diseases);
                });
}

}
