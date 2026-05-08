package dev.matheus.CadastroDeNinjas.Missions;

import dev.matheus.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private char difficulty;

    // @OneToMany one mission can have several ninjas
    @OneToMany(mappedBy = "missions")
    private List<NinjaModel> ninjas;

    public MissionsModel() {
    }

    public MissionsModel(long id, String name, char difficulty) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(char difficulty) {
        this.difficulty = difficulty;
    }
}
