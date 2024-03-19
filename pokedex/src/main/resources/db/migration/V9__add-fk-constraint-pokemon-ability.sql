ALTER TABLE pokemon
ADD CONSTRAINT pokemon_constraint_fk_ability
FOREIGN KEY (ability_fk) REFERENCES ability(ability_id);