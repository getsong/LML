CREATE TABLE lml.user (
  id BIGINT(20) NOT NULL,
  first_name VARCHAR(30) DEFAULT NULL,
  last_name VARCHAR(30) DEFAULT NULL,
  national_id VARCHAR(30) DEFAULT NULL,
  PRIMARY KEY (id)
)