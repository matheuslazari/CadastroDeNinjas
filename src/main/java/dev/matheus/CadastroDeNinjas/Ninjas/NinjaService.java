package dev.matheus.CadastroDeNinjas.Ninjas;

import java.util.List;

public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // List all ninjas
    public List<NinjaModel> ninjaList() {
        return ninjaRepository.findAll();
    }


}
