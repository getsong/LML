CREATE TABLE lml.book (
  id BIGINT(20) NOT NULL,
  author VARCHAR(30) DEFAULT NULL,
  published_date DATE DEFAULT NULL,
  title VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
)