-- Initialisation des tables
INSERT INTO PERSONNE(NOM, PRENOM, POSTE, SUPERIEUR_MATRICULE) VALUES
      ('Lamine', 'Elyes', 'Directeur', null),
      ('Barreau', 'Sylvain', 'Chef de pôle', 1),
      ('Bastide', 'Rémi', 'Prof', 2),
      ('Pécatte', 'Jean-Marie', 'Prof', 2);

INSERT INTO PROJET(debut, fin, nom) VALUES
    ('2025-02-01', '2025-03-01', 'Projet BDD'),
    ('2025-01-13', '2025-02-05', 'Projet Reseau'),
    ('2025-02-26', '2025-08-25', 'Projet Java');

INSERT INTO PARTICIPATION(ROLE, POURCENTAGE, PERSONNE_MATRICULE, PROJET_CODE) VALUES
    ('Chef de projet', 50.0, 1, 3),
    ('Développeur', 25.0, 2, 1),
    ('Testeur', 10.0, 3, 2),
    ('Testeur', 10.0, 2, 1);

