DROP TABLE IF EXISTS empleado;

CREATE TABLE empleado(
    id int auto_increment PRIMARY KEY,
    nombre varchar(250),
    trabajo enum('Programador', 'Ventas', 'Administracion'),
    salario float
);

INSERT INTO empleado (nombre, trabajo, salario) VALUES
('Daniel', 'Programador', '2000.0'),
('Marta', 'Administracion', '1700.0'),
('Laura', 'Programador', '2000.0'),
('Marc', 'Administracion', '1700.0'),
('Marta', 'Ventas', '2200.0');