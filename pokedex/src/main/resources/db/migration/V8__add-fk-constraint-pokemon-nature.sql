ALTER TABLE pokemon
ADD CONSTRAINT pokemon_constraint_fk_nature
FOREIGN KEY (nature_fk) REFERENCES nature(nature_id);