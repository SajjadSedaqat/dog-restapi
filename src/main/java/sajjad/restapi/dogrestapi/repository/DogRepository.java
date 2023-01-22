package sajjad.restapi.dogrestapi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import sajjad.restapi.dogrestapi.entity.Dog;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog,Long> {

    @Query("select d.id, d.breed from Dog d")
    List<String> findAllBreed();

    @Query("select d.id ,d.breed from Dog d where d.id=:id")
    String findDogBreedById(Long id);

    @Query("select d.id , d.name from Dog d")
    List<String> findAllNames();

}
