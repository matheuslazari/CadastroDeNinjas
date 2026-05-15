package dev.matheus.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // List all ninjas
    public List<NinjaModel> ninjaList() {
        return ninjaRepository.findAll();
    }

    //List ninjas by id
    public NinjaModel ninjaListById(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.orElse(null);
    }

    // Add a new ninja
    public NinjaModel addNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Delete ninja - Must be a VOID method
    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Modify ninja
    public NinjaModel modifyNinjaById(Long id, NinjaModel modifiedNinja) {
        if (ninjaRepository.existsById(id)) {
            modifiedNinja.setId(id);
            return ninjaRepository.save(modifiedNinja);
        }
        return null;
    }

}
