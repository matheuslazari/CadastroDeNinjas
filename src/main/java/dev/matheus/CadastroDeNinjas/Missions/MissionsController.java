package dev.matheus.CadastroDeNinjas.Missions;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missions")
public class MissionsController {

    // GET -- Send a request to show missions
    @GetMapping("/list")
    public String missionList() {
        return "mission list";
    }

    // POST -- Send a request to create missions
    @PostMapping("/create")
    public String missionCreate() {
        return "Mission Created with success";
    }

    // PUT -- Send a request to change missions
    @PutMapping("/change")
    public String missionChange() {
        return "Mission Changed with success";
    }

    // DELETE -- Send a request to delete missions
    @DeleteMapping("/delete")
    public String missionDelete() {
        return "Mission Deleted with success";
    }

}
