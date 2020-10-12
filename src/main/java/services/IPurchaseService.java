package services;


import javassist.NotFoundException;
import services.models.Pass;


import java.util.List;


public interface IPurchaseService {

    List<Pass> findAll();


    Pass save(Pass passForSave);


    Pass getById(String id) throws NotFoundException;


    void deleteById(String id) throws NotFoundException;

}