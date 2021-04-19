DROP TABLE IF EXISTS personas;

CREATE TABLE personas (
  id INT NOT NULL PRIMARY KEY,
  nom_completo VARCHAR(256) NOT NULL,
  edad int NOT NULL
);


insert into personas (id, nom_completo, edad) values (0, 'Esther Anaya C', 32)
insert into personas (id, nom_completo, edad) values (1, 'Reodrigo Quintana', 37)
insert into personas (id, nom_completo, edad) values (2, 'Aldo Villalba Rodriguez', 38)
insert into personas (id, nom_completo, edad) values (3, 'Citlalli del Campo Anaya', 18)
