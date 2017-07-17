INSERT INTO DiscussionUser (userName) VALUES ('Kayttaja_a');
INSERT INTO DiscussionUser (userName) VALUES ('Kayttaja_b');
INSERT INTO DiscussionUser (userName) VALUES ('Kayttaja_c');

INSERT INTO DiscussionTopic (topic, writer, header) VALUES (1, 'Kayttaja_a', 'Keskustelualue_a');
INSERT INTO DiscussionTopic (topic, writer, header) VALUES (2, 'Kayttaja_b', 'Keskustelualue_b');
INSERT INTO DiscussionTopic (topic, writer, header) VALUES (3, 'Kayttaja_c', 'Keskustelualue_c');

INSERT INTO Discussion (initiatedBy, topic, header, numberOfMessages, started) VALUES (2, 1, 'Otsikko_a',0, '2017-07-08 22:00:00.000');
INSERT INTO Discussion  (initiatedBy, topic, header, numberOfMessages, started) VALUES (3, 3, 'Otsikko_b',0, '2017-07-08 22:00:00.000');
INSERT INTO Discussion  (initiatedBy, topic, header, numberOfMessages, started) VALUES (1, 2, 'Otsikko_c',0, '2017-07-08 22:00:00.000');

INSERT INTO DiscussionAdmin (initiatedBy, topic, header, numberOfMessages, started) VALUES (1, 1, 'Otsikko_d',0, '2017-07-09 23:00:00.000');
INSERT INTO DiscussionAdmin   (initiatedBy, topic, header, numberOfMessages, started) VALUES (2, 2, 'Otsikko_e',0, '2017-07-09 23:00:00.000');
INSERT INTO DiscussionAdmin   (initiatedBy, topic, header, numberOfMessages, started) VALUES (3, 3, 'Otsikko_f',0, '2017-07-09 23:00:00.000');

INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (2, 1, 'Kayttaja_a', 'Testiviesti 1', '2017-07-05 20:00:00.000');
INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (3, 2, 'Kayttaja_b', 'Testiviesti 2', '2017-07-06 20:00:00.000');
INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (1, 3, 'Kayttaja_c', 'Testiviesti 3', '2017-07-07 20:00:00.000');

INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (2, 1, 'Kayttaja_c', 'Keskustelualueiden listaus', '2017-07-05 21:00:00.000');
INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (3, 1, 'Kayttaja_c', 'Keskustelujen listaus tietyllä keskustelualueella', '2017-07-06 21:00:00.000');
INSERT INTO DiscussionMessage (writerID, discussion, writer , content, sendTime) VALUES (1, 1, 'Kayttaja_c', 'Viestien listaus tietyssä keskustelussa', '2017-07-07 21:00:00.000');
