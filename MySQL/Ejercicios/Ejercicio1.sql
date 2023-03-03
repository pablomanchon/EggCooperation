SELECT 
    *
FROM
    empleados;

SELECT 
    *
FROM
    departamentos;

SELECT 
    nombre_depto
FROM
    departamentos;

SELECT 
    nombre, sal_emp
FROM
    empleados;

SELECT 
    comision_emp
FROM
    empleados;

SELECT 
    *
FROM
    empleados
WHERE
    cargo_emp = 'Secretaria';

SELECT 
    *
FROM
    empleados
WHERE
    cargo_emp = 'vendedor'
ORDER BY nombre;

SELECT 
    nombre, cargo_emp
FROM
    empleados
ORDER BY sal_emp;



SELECT 
    nombre_jefe_depto
FROM
    departamentos
WHERE
    ciudad = 'Ciudad Real';

SELECT 
    CONCAT(nombre, ', ', cargo_emp) AS 'Nombre y cargo'
FROM
    empleados;

SELECT 
    sal_emp, comision_emp
FROM
    empleados
WHERE
    id_depto = 2000;

SELECT 
    nombre, sal_emp + comision_emp + 500 AS 'Total a pagar'
FROM
    empleados
ORDER BY nombre ASC;

SELECT 
    *
FROM
    empleados
WHERE
    nombre LIKE 'J%';

SELECT 
    nombre,
    sal_emp,
    comision_emp,
    sal_emp + comision_emp AS 'salario total'
FROM
    empleados
WHERE
    comision_emp > 1000;

SELECT 
    nombre,
    sal_emp,
    comision_emp,
    sal_emp + comision_emp AS 'salario total'
FROM
    empleados
WHERE
    comision_emp = 0;

SELECT 
    *
FROM
    empleados
WHERE
    sal_emp < comision_emp;

SELECT 
    *
FROM
    empleados
WHERE
    sal_emp * 0.3 >= comision_emp;

SELECT 
    *
FROM
    empleados
WHERE
    nombre NOT LIKE '%ma%';

SELECT 
    *
FROM
    departamentos
WHERE
    nombre_depto IN ('mantenimiento' , 'ventas', 'investigacion');

SELECT 
    *
FROM
    departamentos
WHERE
    nombre_depto NOT IN ('mantenimiento' , 'ventas', 'investigacion');

SELECT 
    MAX(sal_emp)
FROM
    empleados;

SELECT 
    MAX(nombre)
FROM
    empleados
ORDER BY nombre;

SELECT 
    MAX(sal_emp) AS maximo,
    MIN(sal_emp) AS minimo,
    MAX(sal_emp) - MIN(sal_emp) AS diferencia
FROM
    empleados;

SELECT 
    AVG(sal_emp)
FROM
    empleados
GROUP BY id_depto;

SELECT 
    COUNT(nombre) AS 'Cantidad empleados', id_depto
FROM
    empleados
GROUP BY id_depto
HAVING COUNT(nombre) > 3;

SELECT 
    id_depto
FROM
    empleados
GROUP BY id_depto
HAVING COUNT(nombre) = 1;

SELECT 
    nombre, nombre_depto, nombre_jefe_depto
FROM
    empleados
        INNER JOIN
    departamentos ON empleados.id_depto = departamentos.id_depto
WHERE
    cargo_emp NOT LIKE 'Jefe%';
 
SELECT 
    *
FROM
    empleados
WHERE
    sal_emp > (SELECT 
            AVG(sal_emp)
        FROM
            empleados)
ORDER BY id_depto;
 
 