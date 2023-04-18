SELECT 
    *
FROM
    fabricante;
SELECT 
    *
FROM
    producto;

SELECT 
    nombre
FROM
    producto;

SELECT 
    nombre, precio
FROM
    producto;

show columns from producto;

SELECT 
    nombre, ROUND(precio)
FROM
    producto;

SELECT 
    f.nombre
FROM
    fabricante f,
    producto p
WHERE
    f.codigo = codigo_fabricante;

SELECT DISTINCT
    f.nombre
FROM
    fabricante f,
    producto p
WHERE
    f.codigo = codigo_fabricante;

SELECT DISTINCT
    f.nombre
FROM
    fabricante f,
    producto p
WHERE
    f.codigo = codigo_fabricante
ORDER BY f.nombre;

SELECT 
    *
FROM
    producto
ORDER BY nombre , precio DESC;

SELECT 
    *
FROM
    fabricante
LIMIT 5;

SELECT 
    nombre, precio
FROM
    producto
ORDER BY precio
LIMIT 1;

SELECT 
    nombre, precio
FROM
    producto
ORDER BY precio DESC
LIMIT 1;

SELECT 
    nombre
FROM
    producto
WHERE
    precio <= 120;

SELECT 
    *
FROM
    producto
WHERE
    precio BETWEEN 70 AND 200;

SELECT 
    *
FROM
    producto
WHERE
    codigo_fabricante IN (1 , 3, 5);

SELECT 
    nombre
FROM
    producto
WHERE
    nombre LIKE '%Portatil%';

SELECT 
    p.codigo, p.nombre, f.codigo, f.nombre
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo;

SELECT 
    p.nombre, precio, f.nombre AS nombre_fabricante
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
ORDER BY f.nombre;

SELECT 
    p.nombre, precio, f.nombre
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
        AND precio = (SELECT 
            MIN(precio)
        FROM
            producto);

SELECT 
    p.nombre, precio
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
        AND f.nombre = 'Lenovo';

SELECT 
    p.nombre, precio
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
        AND f.nombre = 'Crucial'
        AND precio > 200;

SELECT 
    p.nombre, precio
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
        AND f.nombre IN ('Asus' , 'Hewlett-Packard');

SELECT 
    p.nombre, precio, f.nombre
FROM
    fabricante f,
    producto p
WHERE
    codigo_fabricante = f.codigo
        AND precio >= 180
ORDER BY precio DESC , p.nombre;

SELECT 
    *
FROM
    fabricante f
        LEFT JOIN
    producto p ON f.codigo = codigo_fabricante;

SELECT 
    f.*
FROM
    fabricante f
        LEFT JOIN
    producto p ON f.codigo = codigo_fabricante
WHERE
    p.codigo IS NULL;

SELECT 
    *
FROM
    producto p
WHERE
    codigo_fabricante = (SELECT 
            codigo
        FROM
            fabricante
        WHERE
            nombre = 'Lenovo');

SELECT 
    *
FROM
    producto
WHERE
    precio = (SELECT 
            MAX(precio)
        FROM
            producto
        WHERE
            codigo_fabricante = (SELECT 
                    codigo
                FROM
                    fabricante
                WHERE
                    nombre = 'Lenovo'));

SELECT 
    MAX(precio)
FROM
    producto
WHERE
    codigo_fabricante = (SELECT 
            codigo
        FROM
            fabricante
        WHERE
            nombre = 'Lenovo');

SELECT 
    precio
FROM
    producto
WHERE
    codigo_fabricante = (SELECT 
            codigo
        FROM
            fabricante
        WHERE
            nombre = 'Asus')
        AND precio > (SELECT 
            AVG(precio)
        FROM
            producto
        WHERE
            codigo_fabricante = (SELECT 
                    codigo
                FROM
                    fabricante
                WHERE
                    nombre = 'Asus'));

SELECT 
    nombre
FROM
    fabricante
WHERE
    codigo IN (SELECT 
            codigo_fabricante
        FROM
            producto);

SELECT 
    nombre
FROM
    fabricante
WHERE
    codigo NOT IN (SELECT 
            codigo_fabricante
        FROM
            producto);

SELECT 
    f.nombre, COUNT(*)
FROM
    producto p
        INNER JOIN
    fabricante f ON p.codigo_fabricante = f.codigo
WHERE
    f.nombre <> 'Lenovo'
GROUP BY codigo_fabricante
HAVING (COUNT(codigo_fabricante) = (SELECT 
        COUNT(codigo_fabricante)
    FROM
        producto p
    WHERE
        codigo_fabricante = (SELECT 
                codigo
            FROM
                fabricante
            WHERE
                nombre = 'Lenovo')));

