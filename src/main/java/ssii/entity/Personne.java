package ssii.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor // lombok, pour générer un constructeur avec les champs @NonNull
@ToString
public class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricule;

    @NotBlank
    @NonNull // lombok
    private String nom;

    @NonNull
    private String prenom;

    @NonNull
    private String poste;

    @OneToMany(mappedBy = "personne")
    @NonNull
    private List<Participation> participations;

    @ManyToOne
    private Personne superieur;

    @OneToMany(mappedBy = "superieur")
    private List<Personne> subordonnee;

}
