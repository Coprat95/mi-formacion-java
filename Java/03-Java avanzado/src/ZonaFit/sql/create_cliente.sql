CREATE TABLE cliente (
  id SERIAL PRIMARY KEY,              -- Auto-incrementado, NOT NULL, PK
  nombre VARCHAR(45),                 -- Permite NULL por defecto
  apellido VARCHAR(45),               -- Permite NULL por defecto
  membresia INT UNIQUE                -- Debe ser único, permite NULL por defecto
);

