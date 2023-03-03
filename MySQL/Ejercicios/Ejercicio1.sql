select * from empleados;

select * from departamentos;

select nombre_depto from departamentos;

select nombre, sal_emp from empleados;

select comision_emp from empleados;

select * from empleados 
where cargo_emp = "Secretaria";

select * from empleados 
where cargo_emp = "vendedor"
order by nombre;

select nombre, cargo_emp from empleados 
order by sal_emp;



select nombre_jefe_depto from departamentos
where ciudad = "Ciudad Real";

select CONCAT(nombre, ", ", cargo_emp) as "Nombre y cargo" from empleados;

select sal_emp, comision_emp from empleados
where id_depto=2000;

select nombre, sal_emp + comision_emp + 500 as "Total a pagar" from empleados
order by nombre asc;

select * from empleados where nombre like "J%";

select nombre, sal_emp, comision_emp, sal_emp + comision_emp as "salario total" from empleados
where comision_emp > 1000;

select nombre, sal_emp, comision_emp, sal_emp + comision_emp as "salario total" from empleados
where comision_emp = 0;

select * from empleados
where sal_emp < comision_emp;

select * from empleados
where sal_emp*0.3 >= comision_emp;

select * from empleados where nombre not like"%ma%";

select * from departamentos
where nombre_depto in ("mantenimiento","ventas","investigacion");

select * from departamentos
where nombre_depto not in ("mantenimiento","ventas","investigacion");

select MAX(sal_emp) from empleados;

select max(nombre) from empleados 
order by nombre;

select max(sal_emp) as maximo, 
min(sal_emp) as minimo,
max(sal_emp)-min(sal_emp) as diferencia 
from empleados;

select avg(sal_emp) from empleados group by id_depto;

select count(nombre) as "Cantidad empleados", id_depto from empleados group by id_depto having count(nombre) > 3;

select id_depto from empleados group by id_depto having count(nombre) = 1;

select nombre, nombre_depto, nombre_jefe_depto from empleados 
inner join departamentos on empleados.id_depto = departamentos.id_depto
 where cargo_emp not like "Jefe%";
 
 select * from empleados 
 where sal_emp > (select avg(sal_emp) from empleados)
 order by id_depto;
 
 