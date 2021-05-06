-- Schema: public

-- DROP SCHEMA public;

CREATE SCHEMA public
  AUTHORIZATION postgres;

GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO public;
COMMENT ON SCHEMA public
  IS 'standard public schema';

  CREATE TABLE Users(
id SERIAL NOT NULL PRIMARY KEY,
username VARCHAR UNIQUE NOT NULL
);

INSERT INTO Users (id, username) VALUES (1, 'John');

INSERT INTO Users (id, username) VALUES (2, 'Jack');

SELECT * FROM Users;

