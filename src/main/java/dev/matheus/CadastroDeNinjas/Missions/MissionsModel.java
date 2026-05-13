package dev.matheus.CadastroDeNinjas.Missions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.matheus.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private char difficulty;

    // @OneToMany one mission can have several ninjas
    @OneToMany(mappedBy = "missions")
    @JsonIgnore
    private List<NinjaModel> ninjas;
}
