
select * from estados

select nome, regiao from estados
where populacao >=10
order by populacao desc

select sigla, nome as 'Nome do Estado' from estados
where regiao ='sul'

--fazer update sem where muda todo o arquivo 

--para verificar cada ação devo fechar o preview, após eu verificar

