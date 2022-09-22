INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES ('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES ('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Duvida', 'Erro ao criar o projeto', '2022-09-21 20:00', 'NAO_RESPONDIDO', 1, 2);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Duvida 2', 'Ssamerda não compila', '2022-09-21 20:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES ('Duvida 3', 'Tag HTML', '2022-09-21 20:00', 'NAO_RESPONDIDO', 1, 1);
