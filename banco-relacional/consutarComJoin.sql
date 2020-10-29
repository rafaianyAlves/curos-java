select 
 e.nome as Estado,
 c.nome as Cidade,
 regiao as Regiao
 from estados e, cidades c
where e.id = c.estado_id;
-- aqui o select fala o que é, e a from qual coluna associar juntamente com where por isso o sinal de "="

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select *from cidades c left join prefeitos p on c.id = p.cidade_id;
select *from cidades c right join prefeitos p on c.id = p.cidade_id;
select *from cidades c left  outer join prefeitos p on c.id = p.cidade_id;
select * from cidades;
select * from estados;



