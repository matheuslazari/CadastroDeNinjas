package dev.matheus.CadastroDeNinjas.Ninjas;
import dev.matheus.CadastroDeNinjas.Missions.MissionsModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String name;
    private String email;
    private String imgUrl;
    private int age;
    private MissionsModel missions;
    private String rank;

}
