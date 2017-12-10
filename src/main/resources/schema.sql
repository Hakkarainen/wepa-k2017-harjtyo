CREATE TABLE DiscussionUser
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    password VARCHAR(20) NOT NULL UNIQUE,
    userName VARCHAR(30) NOT NULL UNIQUE,

    FOREIGN KEY(discussionTopics) REFERENCES DiscussionTopic(id),
    FOREIGN KEY(discussions) REFERENCES Discussion(id),
    FOREIGN KEY(discussionMessages) REFERENCES DiscussionMessage(id)
  );

CREATE TABLE DiscussionTopic
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    topic INTEGER NOT NULL,
    writer VARCHAR(30) NOT NULL UNIQUE,
    header VARCHAR(100) NOT NULL UNIQUE,

    FOREIGN KEY(discussions) REFERENCES Discussion(id)
  );

CREATE TABLE Discussion
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    initiatedBy INT NOT NULL,
    topic INT NOT NULL,
    header VARCHAR(100) NOT NULL UNIQUE,
    numberOfMessages INT NOT NULL,
    started TIMESTAMP NOT NULL,

    FOREIGN KEY(initiatedBy) REFERENCES DiscussionUser(id),
    FOREIGN KEY(topic) REFERENCES DiscussionTopic(id),
    FOREIGN KEY(discussionMessages) REFERENCES DiscussionMessage(id),
    FOREIGN KEY(discussionParticipants) REFERENCES DiscussionUser(id)
  );

CREATE TABLE DiscussionMessage
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    writerID INT NOT NULL,
    discussion INT NOT NULL,
    writer VARCHAR(30) NOT NULL,
    content VARCHAR(500) NOT NULL,
    sendTime TIMESTAMP NOT NULL,

    FOREIGN KEY(writerID) REFERENCES DiscussionUser(id),
    FOREIGN KEY(discussion) REFERENCES Discussion(id)
  );

CREATE VIEW DiscussionTopicList AS
SELECT t.id, t.header, COUNT(m.id) as amount, MAX(m.sendTime) AS latest
FROM DiscussionTopic t
LEFT JOIN Discussion d ON (t.id = d.topic)
LEFT JOIN DiscussionMessage m ON (d.id = m.discussion)
GROUP by t.id, t.header;

CREATE VIEW DiscussionList AS
SELECT d.id, d.initiatedBy, d.topic, d.header,
COUNT(*) AS amount, MIN(m.sendTime) AS started,
MAX(m.sendTime) AS latest
FROM Discussion d
LEFT JOIN DiscussionMessage m ON (d.id = m.discussion)
GROUP BY d.id, d.header, d.initiatedBy, d.topic
ORDER BY MAX(m.sendTime) DESC;


