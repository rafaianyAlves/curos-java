select
       regiao as 'Regiao',
       sum(populacao) as Total
 from estados
 group by regiao 
 order by Total desc

select 
 sum(populacao) as Total
 from estados -- soma da populacao sem separar por regiao

 SELECT 
  avg(populacao)
  from estados --é a media da populacao no geral