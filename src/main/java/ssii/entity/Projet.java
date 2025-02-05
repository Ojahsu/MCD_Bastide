package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @NotBlank
    @NonNull
    private String nom;

    private LocalDate debut;

    private LocalDate fin;

    @OneToMany(mappedBy = "projet")
    @NonNull
    private List<Participation> participations;
}
