DROP TABLE IF EXISTS person;
CREATE TABLE person
(
  ID        SERIAL PRIMARY KEY NOT NULL,
  NAME      VARCHAR(200)       NOT NULL
);

INSERT INTO person(ID, NAME)
VALUES
  (1, 'Jose'),
  (2, 'Yonay')
