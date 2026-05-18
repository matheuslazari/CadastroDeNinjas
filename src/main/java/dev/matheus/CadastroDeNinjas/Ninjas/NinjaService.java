package dev.matheus.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
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
    public NinjaDTO addNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
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
