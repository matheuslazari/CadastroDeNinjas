package dev.matheus.CadastroDeNinjas.Ninjas;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/welcome")
    public String boasVindas() {
        return "Welcome";
    }

     @PostMapping("/add")
     public NinjaDTO addNinja(@RequestBody NinjaDTO ninja) {
         return ninjaService.addNinja(ninja);
     }

    @GetMapping("/list")
    public List<NinjaDTO> ninjaList() {
        return ninjaService.ninjaList();
    }

    @GetMapping("/list/{id}")
    public NinjaDTO listNinjaById(@PathVariable Long id) {
        return ninjaService.ninjaListById(id);
    }

    @PutMapping("modify/{id}")
    public NinjaDTO modifyNinjaByID(@PathVariable Long id, @RequestBody NinjaDTO ninja) {
        return ninjaService.modifyNinjaById(id, ninja);
    }

    @DeleteMapping("/delete/{ID}")
    public void deleteNinjaByID(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }

}
