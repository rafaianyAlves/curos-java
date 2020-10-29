select e.nome Empresa, c.nome Cidade
from empresas e, empresas_unidades ee, cidades c 
where e.id = ee.empresa_id
and c.id = ee.cidade_id
and sede