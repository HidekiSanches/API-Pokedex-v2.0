CREATE TABLE pokemon_move (
    pokemon_id VARCHAR(36),
    move_id VARCHAR(36),
    PRIMARY KEY (pokemon_id, move_id),
    FOREIGN KEY (pokemon_id) REFERENCES pokemon(pokemon_id),
    FOREIGN KEY (move_id) REFERENCES move(move_id)
);