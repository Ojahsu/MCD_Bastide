-- Initialisation des tables
INSERT INTO PERSONNE(nom, prenom, poste) VALUES
      ('Bastide', 'Rémi', null),
      ('Lamine', 'Elyes', null),
      ('Pécatte', 'Jean-Marie', null),
      ('Barreau', 'Sylvain', null);

INSERT INTO PROJET(nom) VALUES
    ('Projet BDD'),
    ('Projet Reseau'),
    ('Projet Java');

INSERT INTO PARTICIPATION(role, pourcentage, personne_matricule, projet_code) VALUES
    ('Chef de projet', 50.0, 1, 3),
    ('Développeur', 25.0, 2, 1),
    ('Testeur', 10.0, 3, 2);

