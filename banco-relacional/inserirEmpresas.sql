ALTER TABLE empresas MODIFY cnpj VARCHAR(14);
INSERT INTO
 empresas (nome,cnpj)

VALUES
('Itau', 82365735000183),
('Bradesco', 37836573700001),
('Cielo', 56365735000205),
('Santander', 6754573500010),
('Caixa', 82389735000003);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

INSERT INTO empresas_unidades
(empresa_id, cidade_id, sede)

VALUES (1,1,0),
       (2,4,1);