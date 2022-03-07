INSERT INTO marcas(nombre) VALUES ('VW');
INSERT INTO marcas(nombre) VALUES ('Mercedes');
INSERT INTO marcas(nombre) VALUES ('LADA');
INSERT INTO marcas(nombre) VALUES ('Fiat');

INSERT INTO modelos(nombre) VALUES ('Leon');
INSERT INTO modelos(nombre) VALUES ('Touran');
INSERT INTO modelos(nombre) VALUES ('Trocolo');
INSERT INTO modelos(nombre) VALUES ('GOLF');
INSERT INTO modelos(nombre) VALUES ('Micra');

INSERT INTO coches (idmarca,idmodelo,color,matricula,cilindrada,velocidad) VALUES (1,4,'Negro','112333J',5,200);
INSERT INTO coches (idmarca,idmodelo,color,matricula,cilindrada,velocidad) VALUES (2,1,'Verde','12333Ñ',6 ,250);
INSERT INTO coches (idmarca,idmodelo,color,matricula,cilindrada,velocidad) VALUES (3,5,'Blanco','12333C',4,130);


INSERT INTO usuarios (username,password,enabled) VALUES ('admin','',1);
INSERT INTO usuarios (username,password,enabled) VALUES ('rolando','',1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,2);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES (2,1);
