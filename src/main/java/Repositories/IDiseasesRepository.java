package Repositories;

import Models.Diseases;
import org.springframework.data.repository.CrudRepository;

public interface IDiseasesRepository extends CrudRepository<Diseases, Long> {
}
