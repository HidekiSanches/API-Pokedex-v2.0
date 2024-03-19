CREATE TABLE pokemon (
    pokemon_id VARCHAR(36) PRIMARY KEY,
    no_pokedex INT NOT NULL,
    name VARCHAR(100) NOT NULL,
    description VARCHAR(200) NOT NULL,
    type_fk VARCHAR(36) NOT NULL,
    nature_fk VARCHAR(36) NOT NULL,
    ability_fk VARCHAR(36) NOT NULL,
    stats_fk VARCHAR(36) NOT NULL
);