INSERT INTO tb_regra_acesso ( criado, criado_por, nome ) VALUES ( '2017-02-15 16:21:53', 'assinc', 'ADMIN' );
INSERT INTO tb_perfil ( criado, criado_por, nome ) VALUES ( '2017-02-15 16:21:53', 'assinc', 'System Administrator' );
INSERT INTO tb_perfil_regra_acesso ( perfil_id, regra_acesso_id ) VALUES (1, 1);

INSERT INTO tb_usuario ( criado, criado_por, nome, email, enabled, perfil_id, status ) VALUES ( '2017-02-15 16:21:53', 'assinc', 'System Administrator', 'administrador@makersweb.com.br', 1, 1, 1 );
INSERT INTO tb_autenticacao ( criado, criado_por, password, usuario_id ) VALUES ('2017-02-15 16:21:53', 'assinc', SHA2('salmos89', 256), 1 );
     