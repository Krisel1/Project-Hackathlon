package repositories;

import models.Diseases;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface IDiseasesRepository extends CrudRepository<Diseases, Long> {
    ArrayList<Diseases> findByName(String name);
}
