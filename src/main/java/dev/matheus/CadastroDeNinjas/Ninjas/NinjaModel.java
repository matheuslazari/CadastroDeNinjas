package dev.matheus.CadastroDeNinjas.Ninjas;

import dev.matheus.CadastroDeNinjas.Missions.MissionsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_register")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private int age;

    // @ManyToOne a ninja have only one mission
    @ManyToOne
    @JoinColumn(name = "missions_id") // Foreign Key
    private MissionsModel missions;
}
