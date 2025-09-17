-- UPDATE
SELECT * FROM Cliente;
UPDATE Cliente SET nombre = 'Manolo' WHERE (nombre = 'Oliver');
UPDATE Cliente SET nombre = 'Oliver' WHERE (nombre = 'Manolo');
UPDATE Cliente SET id = 2 WHERE (id = 4);