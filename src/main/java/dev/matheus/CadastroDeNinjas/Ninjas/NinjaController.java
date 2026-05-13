package dev.matheus.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping


public class NinjaController {

    @GetMapping("/welcome")
    public String boasVindas() {
        return "WELCOME";
    }

     // Add ninja (CREATE)
    @PostMapping("/add")
    public String addNinja() {
        return "Ninja added";
    }

    // Show all ninjas (READ)
    @GetMapping("/all")
    public String showAllNinjas() {
        return "Show Ninja";
    }

    // Show ninja by ID (READ)
    @GetMapping("/allID")
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
