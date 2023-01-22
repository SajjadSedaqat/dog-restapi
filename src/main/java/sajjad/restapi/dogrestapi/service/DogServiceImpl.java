package sajjad.restapi.dogrestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sajjad.restapi.dogrestapi.entity.Dog;
import sajjad.restapi.dogrestapi.repository.DogRepository;

import java.util.List;

@Service
public class DogServiceImpl implements DogService{


    private final DogRepository dogRepository;

    @Autowired
    public DogServiceImpl(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public List<String> retrieveDogBreed() {
        return dogRepository.findAllBreed();
    }

    @Override
    public String retrieveDogBreedById(Long id) {
        return dogRepository.findDogBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return dogRepository.findAllNames();
    }
}
