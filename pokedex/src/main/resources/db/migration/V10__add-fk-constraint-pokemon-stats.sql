ALTER TABLE pokemon
ADD CONSTRAINT pokemon_constraint_fk_stats
FOREIGN KEY (stats_fk) REFERENCES stats(stats_id);