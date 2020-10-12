package services.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import services.models.Pass;


@Repository

public interface PassRepository extends CrudRepository<Pass, String> {

}
