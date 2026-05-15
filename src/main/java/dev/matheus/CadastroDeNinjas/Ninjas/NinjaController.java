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

     // Add a new ninja (CREATE)
    @PostMapping("/add")
    public NinjaModel addNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.addNinja(ninja);
    }

    // Show all ninjas (READ)
    @GetMapping("/list")
    public List<NinjaModel> ninjaList() {
        return ninjaService.ninjaList();
    }

    // Show ninja by ID (READ)
    @GetMapping("/list/{id}")
    public NinjaModel listNinjaById(@PathVariable Long id) {
        return ninjaService.ninjaListById(id);
    }

    // Modify ninja data (UPDATE)
    @PutMapping("modify/{id}")
    public NinjaModel modifyNinjaByID(@PathVariable Long id, @RequestBody NinjaModel ninja) {
        return ninjaService.modifyNinjaById(id, ninja);
    }

    // Delete ninja (DELETE)
    @DeleteMapping("/delete/{ID}")
    public void deleteNinjaByID(@PathVariable Long id) {
        ninjaService.deleteNinjaById(id);
    }

}
