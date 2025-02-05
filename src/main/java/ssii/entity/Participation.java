package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Participation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    @NonNull
    private String role;

    @NonNull
    private Float pourcentage;

    @ManyToOne
    @NonNull
    private Projet projet;

    @ManyToOne
    @NonNull
    private Personne personne;
}
