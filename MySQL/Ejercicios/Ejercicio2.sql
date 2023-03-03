select * from fabricante;
select * from producto;

select nombre from producto;

select nombre, precio from producto;

show columns from producto;

select nombre, round(precio) from producto;

select f.nombre from fabricante f , producto p
where f.codigo = codigo_fabricante;

select distinct f.nombre from fabricante f , producto p
where f.codigo = codigo_fabricante;

select distinct f.nombre from fabricante f , producto p
where f.codigo = codigo_fabricante
order by f.nombre;

select * from producto
order by nombre, precio desc;

select  * from fabricante
limit 5;

select nombre, precio from producto
order by precio
limit 1;

select nombre, precio from producto
order by precio desc
limit 1;

select nombre from producto
where precio <= 120;

select * from producto
where precio between 70 and 200;

select * from producto 
where codigo_fabricante in (1,3,5);

select nombre from producto
where nombre like "%Portatil%";

select p.codigo, p.nombre, f.codigo, f.nombre
from fabricante f, producto p
where codigo_fabricante = f.codigo;

select p.nombre, precio, f.nombre as nombre_fabricante
from fabricante f, producto p
where codigo_fabricante = f.codigo
order by f.nombre;

select p.nombre, precio, f.nombre
from fabricante f, producto p
where codigo_fabricante = f.codigo
and precio = (select min(precio) from producto);

select p.nombre, precio
from fabricante f, producto p
where codigo_fabricante = f.codigo
and f.nombre = "Lenovo";

select p.nombre, precio
from fabricante f, producto p
where codigo_fabricante = f.codigo
and f.nombre = "Crucial"
and precio > 200;

select p.nombre, precio
from fabricante f, producto p
where codigo_fabricante = f.codigo
and f.nombre in("Asus","Hewlett-Packard");

select p.nombre, precio, f.nombre
from fabricante f, producto p
where codigo_fabricante = f.codigo
and precio >= 180
order by precio desc, p.nombre;

select * from fabricante f
left join producto p
on f.codigo = codigo_fabricante;

select f.* from fabricante f
left join producto p
on f.codigo = codigo_fabricante
where p.codigo is null;

select * from producto p
where codigo_fabricante = (
select codigo from fabricante
where nombre = "Lenovo");

select * from producto
where precio = (select max(precio) from producto
where codigo_fabricante = (
select codigo from fabricante where nombre = "Lenovo"));

select max(precio) from producto
where codigo_fabricante = (
select codigo from fabricante where nombre = "Lenovo");

select precio from producto
where codigo_fabricante = (
select codigo from fabricante where nombre = "Asus")
and precio > (select avg(precio) from producto
where codigo_fabricante = (
select codigo from fabricante where nombre = "Asus"));

select nombre from fabricante
where codigo in (select codigo_fabricante from producto);

select nombre from fabricante
where codigo not in (select codigo_fabricante from producto);

select f.nombre, count(*) from producto p 
inner join fabricante f on p.codigo_fabricante = f.codigo
where f.nombre <> "Lenovo"
group by codigo_fabricante
having (count(codigo_fabricante) = (select count(codigo_fabricante) from producto p 
where codigo_fabricante = (select codigo from fabricante where nombre = "Lenovo")));
