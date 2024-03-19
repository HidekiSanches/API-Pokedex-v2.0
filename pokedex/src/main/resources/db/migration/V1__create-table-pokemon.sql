CREATE TABLE pokemon (
    pokemon_id binary(16) PRIMARY KEY,
    no_pokedex INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(200) NOT NULL,
    type_fk binary(16) NOT NULL,
    nature_fk binary(16) NOT NULL,
    ability_fk binary(16) NOT NULL,
    stats_fk binary(16) NOT NULL
);