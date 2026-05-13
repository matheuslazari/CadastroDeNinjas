-- Migrations to add RANK column on register table

ALTER TABLE tb_register
ADD COLUMN rank VARCHAR (255);