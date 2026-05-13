package dev.matheus.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/welcome")
    public String boasVindas() {
        return "Welcome";
    }

     // Add ninja (CREATE)
    @PostMapping("/create")
    public String addNinja() {
        return "Ninja created";
    }

    // Show all ninjas (READ)
    @GetMapping("/list")
    public String ninjaList() {
        return "Ninja list";
    }

    // Show ninja by ID (READ)
    @GetMapping("/listID")
    public String showAllNinjasByID() {
        return "Show Ninja by ID";
    }

    // Change ninja data (UPDATE)
    @PutMapping("changeID")
    public String changeByID() {
        return "Change Ninja by ID";
    }

    // Delete ninja (DELETE)
    @DeleteMapping("/deleteByID")
    public String deleteByID() {
        return "Ninja deleted by ID";
    }

}
