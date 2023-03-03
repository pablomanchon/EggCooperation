SELECT 
    *
FROM
    jugadores
ORDER BY nombre;

SELECT 
    nombre
FROM
    jugadores
WHERE
    peso > 200 AND posicion = 'C'
ORDER BY nombre;

SELECT 
    nombre
FROM
    equipos
ORDER BY nombre;

SELECT 
    *
FROM
    equipos
WHERE
    conferencia = 'east';

SELECT 
    *
FROM
    equipos
WHERE
    ciudad LIKE 'c%';

SELECT 
    nombre, nombre_equipo
FROM
    jugadores
ORDER BY nombre_equipo;


SELECT 
    *
FROM
    jugadores
WHERE
    nombre_equipo = 'Raptors'
ORDER BY nombre;
    
    
SELECT 
    e.Puntos_por_partido
FROM
    estadisticas e
        INNER JOIN
    jugadores j ON jugador = codigo
WHERE
    nombre = 'Pau Gasol';


SELECT 
    e.Puntos_por_partido
FROM
    estadisticas e
        INNER JOIN
    jugadores j ON jugador = codigo
WHERE
    nombre = 'Pau Gasol'
        AND temporada = '04/05';
        

        
SELECT 
    nombre, COUNT(puntos_por_partido) AS puntos_carrera
FROM
    estadisticas e
        INNER JOIN
    jugadores j ON jugador = codigo
GROUP BY nombre;


SELECT 
    nombre_equipo, COUNT(nombre_equipo) AS cantidad_jugadores
FROM
    jugadores
GROUP BY nombre_equipo;


SELECT 
    nombre, COUNT(puntos_por_partido) AS puntos_carrera
FROM
    estadisticas e
        INNER JOIN
    jugadores j ON jugador = codigo
GROUP BY nombre
ORDER BY puntos_carrera DESC
LIMIT 1;


SELECT 
    e.nombre, conferencia, division
FROM
    equipos e
        INNER JOIN
    jugadores j ON nombre_equipo = e.nombre
WHERE
    j.altura = (SELECT 
            MAX(altura)
        FROM
            jugadores);


SELECT 
    AVG(puntos_por_partido)
FROM
    estadisticas
        INNER JOIN
    jugadores j ON codigo = jugador
        INNER JOIN
    equipos e ON nombre_equipo = e.nombre
WHERE
    division = 'Pacific';



SELECT 
    puntos_local loca,
    puntos_visitante vis,
    (puntos_local - puntos_visitante) diferencia
FROM
    partidos
ORDER BY diferencia DESC
LIMIT 1;


SELECT 
    codigo, equipo_local, equipo_visitante
FROM
    partidos
        INNER JOIN
    equipos ON nombre = equipo_local
        OR nombre = equipo_visitante
LIMIT 99999;


SELECT 
    codigo,
    equipo_local,
    equipo_visitante,
    CASE
        WHEN p.puntos_local < p.puntos_visitante THEN equipo_local
        WHEN p.puntos_local > p.puntos_visitante THEN equipo_visitante
        ELSE NULL
    END AS equipo_ganador
FROM
    partidos p;