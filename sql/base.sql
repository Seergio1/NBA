drop table joueur_stat_match;
drop table match;
drop table joueur;
drop table equipe;

drop sequence joueur_stat_match_sequence;
drop sequence match_sequence;
drop sequence joueur_sequence;
drop sequence equipe_sequence;


INSERT INTO equipe (id,abreviation,nom,path_photo) VALUES(1,'GS','Golden State','path');
INSERT INTO equipe (id,abreviation,nom,path_photo) VALUES(2,'L','Lakers','path');

INSERT INTO joueur (id,nom,path_photo,prenom,id_equipe) VALUES(1,'Stephen','path','Curry',1);
INSERT INTO joueur (id,nom,path_photo,prenom,id_equipe) VALUES(2,'Michael','path','Jordan',2);


INSERT INTO match (id,id_equipe_domicile,id_equipe_exterieur) VALUES(1,1,2);


