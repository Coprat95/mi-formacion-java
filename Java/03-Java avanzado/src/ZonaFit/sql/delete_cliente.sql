DELETE FROM Cliente WHERE (id = 2);
SELECT * FROM Cliente;
INSERT  INTO Cliente VALUES (
400,'Trave',300
);
UPDATE Cliente SET id = 2 WHERE (id=400);
INSERT INTO Cliente VALUES (
2,'Oliver','Trave', 300
)
INSERT INTO Cliente VALUES ( 
'Alicia','Baldan',400);

DELETE  FROM Cliente WHERE ( id != 0 );

INSERT INTO Cliente (nombre, apellido, membresia) VALUES (
'Oliver','Trave',100
)
INSERT INTO Cliente (nombre, apellido, membresia) VALUES(
'Alicia','Baldan',200
)
INSERT INTO Cliente ( nombre, apellido, membresia) VALUES (
'Paola','Juarez',400
)
INSERT INTO Cliente (nombre , apellido, membresia) VALUES ( 'Carlos','Moreno',500)