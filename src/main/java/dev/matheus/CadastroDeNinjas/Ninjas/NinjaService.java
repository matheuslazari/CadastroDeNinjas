package dev.matheus.CadastroDeNinjas.Ninjas;

import java.util.List;
import java.util.Optional;

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


}
