INSERT INTO user(id,name,password,authority) VALUES
('admin','admin','profile123!','ADMIN')
ON CONFLICT (id) DO NOTHING;;