INSERT INTO Discussion_User (password, user_Name) VALUES ('p1','Kayttaja_a');
INSERT INTO Discussion_User (password, user_Name) VALUES ('p1','Kayttaja_b');
INSERT INTO Discussion_User (password, user_Name) VALUES ('p2','Kayttaja_c');

INSERT INTO Discussion_User (password, user_Name) VALUES ('p3','Admin_a');
INSERT INTO Discussion_User (password, user_Name) VALUES ('p4','Admin_b');
INSERT INTO Discussion_User (password, user_Name) VALUES ('p5','Admin_c');

INSERT INTO Discussion_Topic (topic, writer, header) VALUES (1, 'Kayttaja_a', 'Keskustelualue_a');
INSERT INTO Discussion_Topic (topic, writer, header) VALUES (2, 'Kayttaja_b', 'Keskustelualue_b');
INSERT INTO Discussion_Topic (topic, writer, header) VALUES (3, 'Kayttaja_c', 'Keskustelualue_c');

INSERT INTO Discussion (header, initiated_By, number_Of_Messages, started, topic) VALUES ( 'Otsikko_a',1, 2, '2017-07-08 22:00:00.000',1);
INSERT INTO Discussion (header, initiated_By, number_Of_Messages, started, topic) VALUES ( 'Otsikko_b',2, 2, '2017-07-08 22:00:00.000',2);
INSERT INTO Discussion (header, initiated_By, number_Of_Messages, started, topic) VALUES ( 'Otsikko_c',3, 2, '2017-07-08 22:00:00.000',3);

INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (2, 1, 'Kayttaja_a', 'Testiviesti 1', '2017-07-05 20:00:00.000');
INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (3, 2, 'Kayttaja_b', 'Testiviesti 2', '2017-07-06 20:00:00.000');
INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (1, 3, 'Kayttaja_c', 'Testiviesti 3', '2017-07-07 20:00:00.000');

INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (2, 1, 'Kayttaja_c', 'Keskustelualueiden listaus', '2017-07-05 21:00:00.000');
INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (3, 1, 'Kayttaja_c', 'Keskustelujen listaus tietyllä keskustelualueella', '2017-07-06 21:00:00.000');
INSERT INTO Discussion_Message (writerID, discussion, writer , content, send_Time) VALUES (1, 1, 'Kayttaja_c', 'Viestien listaus tietyssä keskustelussa', '2017-07-07 21:00:00.000');


