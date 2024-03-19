CREATE TABLE move (
    move_id VARCHAR(36) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    category VARCHAR(50) NOT NULL,
    power INT NOT NULL,
    accuracy INT NOT NULL,
    pp INT NOT NULL,
    effect VARCHAR(50) NOT NULL,
    type_fk VARCHAR(36) NOT NULL
)