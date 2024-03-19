ALTER TABLE pokemon
ADD CONSTRAINT pokemon_constraint_fk_type
FOREIGN KEY (type_fk) REFERENCES type(type_id);