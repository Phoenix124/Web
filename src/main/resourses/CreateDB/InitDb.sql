CREATE TABLE IF NOT EXISTS management.product (
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(100) NOT NULL ,
  PRICE DECIMAL(18,2) NOT NULL ,
  MANUFACTER VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS management.manufacter (
  ID INT NOT NULL ,
  NAME VARCHAR(100) NOT NULL ,
  PRIMARY KEY (ID)
);

CREATE TABLE IF NOT EXISTS management.manufacter_products(
  manufacter_id INT NOT NULL,
  product_id     INT NOT NULL,
  CONSTRAINT uq_manufacter_products UNIQUE (product_id, manufacter_id),
  FOREIGN KEY (manufacter_id) REFERENCES manufacter(id),
  FOREIGN KEY (product_id) REFERENCES product(id));