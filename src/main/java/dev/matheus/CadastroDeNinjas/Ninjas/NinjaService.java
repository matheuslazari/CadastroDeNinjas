package dev.matheus.CadastroDeNinjas.Ninjas;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaDTO> ninjaList() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    public NinjaDTO ninjaListById(Long id) {
        Optional<NinjaModel> ninjaById = ninjaRepository.findById(id);
        return ninjaById.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO addNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
    }

    public void deleteNinjaById(Long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaDTO modifyNinjaById(Long id, NinjaDTO NinjaDTO) {
      Optional<NinjaModel> existingNinja = ninjaRepository.findById(id);
      if (existingNinja.isPresent()) {
          NinjaModel updatedNinja = ninjaMapper.map(NinjaDTO);
          updatedNinja.setId(id);
          NinjaModel savedNinja = ninjaRepository.save(updatedNinja);
          return ninjaMapper.map(savedNinja);
      }
      return null;
    }


}
