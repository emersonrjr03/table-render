INSERT INTO TABLEMD(id, displayname, tablename)
VALUES(1999999, 'Parceiros', 'PARCEIRO');


INSERT INTO COLUMNMD(id, columnname, datatype, defaultdata, displayname, displayorder, nullable, size, relatedtable_id, table_id)
VALUES(1999999, 'RAZAOSOCIAL', 'T', '', 'Razão Social', 1, false, 200, null, 1999999);

INSERT INTO COLUMNMD(id,columnname, datatype, defaultdata, displayname, displayorder, nullable, size, relatedtable_id, table_id)
VALUES(2999999, 'CPFCNPJ', 'T', '', 'CPF/CNPJP', 2999999, false, 14, null, 1999999);



INSERT INTO TABLEMD(id, displayname, tablename)
VALUES(2999999, 'Usuários', 'USUARIO');

INSERT INTO COLUMNMD(id,columnname, datatype, defaultdata, displayname, displayorder, nullable, size, relatedtable_id, table_id)
VALUES(3999999, 'NOME', 'T', '', 'Nome', 1, false, 200, null, 2999999);

INSERT INTO COLUMNMD(id,columnname, datatype, defaultdata, displayname, displayorder, nullable, size, relatedtable_id, table_id)
VALUES(4999999, 'CPF', 'T', '', 'CPF', 2, false, 11, null, 2999999);

INSERT INTO COLUMNMD(id,columnname, datatype, defaultdata, displayname, displayorder, nullable, size, relatedtable_id, table_id)
VALUES(5999999, 'UNIDADE', 'T', '', 'Unidade', 2, false, 11, 1999999, 2999999);