
--DROP TABLE Discussion_User;
--DROP TABLE Discussion_Topic;
--DROP TABLE Discussion;
--DROP TABLE Discussion_Message;

CREATE TABLE Discussion_User
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    password VARCHAR(20) DEFAULT NULL,
    user_Name VARCHAR(30) NOT NULL UNIQUE,
    --admin BOOLEAN DEFAULT 0);
  );

CREATE TABLE Discussion_Topic
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    topic INTEGER NOT NULL,
    writer VARCHAR(30) NOT NULL UNIQUE,
    header VARCHAR(100) NOT NULL UNIQUE
  );

CREATE TABLE Discussion
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    initiated_By INT NOT NULL,
    topic INT NOT NULL,
    header VARCHAR(100) NOT NULL UNIQUE,
    number_Of_Messages INT NOT NULL,
    started TIMESTAMP NOT NULL,

    FOREIGN KEY(initiated_By) REFERENCES Discussion_User(id),
    FOREIGN KEY(topic) REFERENCES Discussion_Topic(id)
  );

CREATE TABLE Discussion_Message
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    writerID INT NOT NULL,
    discussion INT NOT NULL,
    writer VARCHAR(30) NOT NULL,
    content VARCHAR(500) NOT NULL,
    send_Time TIMESTAMP NOT NULL,

    FOREIGN KEY(writerID) REFERENCES Discussion_User(id),
    FOREIGN KEY(discussion) REFERENCES Discussion(id)
  );

CREATE VIEW Discussion_Topic_List AS
SELECT t.id, t.header, COUNT(m.id) as amount, MAX(m.send_Time) AS latest
FROM Discussion_Topic t
LEFT JOIN Discussion d ON (t.id = d.topic)
LEFT JOIN Discussion_Message m ON (d.id = m.discussion)
GROUP by t.id, t.header;

CREATE VIEW Discussion_List AS
SELECT d.id, d.initiated_By, d.topic, d.header,
COUNT(*) AS amount, MIN(m.send_Time) AS started,
MAX(m.send_Time) AS latest
FROM Discussion d
LEFT JOIN Discussion_Message m ON (d.id = m.discussion)
GROUP BY d.id, d.header, d.initiated_By, d.topic
ORDER BY MAX(m.send_Time) DESC;


