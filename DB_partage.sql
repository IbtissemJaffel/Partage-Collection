-- Création de la base de données
CREATE DATABASE IF NOT EXISTS Collections;
USE Collections;


-- Table des collections
CREATE TABLE IF NOT EXISTS collections (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    description TEXT,
    idUser INT,
    FOREIGN KEY (idUser) REFERENCES users(id) ON DELETE CASCADE
);

-- Table pour le partage des collections
CREATE TABLE IF NOT EXISTS partage_collections (
    id INT AUTO_INCREMENT PRIMARY KEY,
    idCollection INT,
    idUser INT,
    droit ENUM('lecture', 'modification') NOT NULL,
    FOREIGN KEY (idCollection) REFERENCES collections(id) ON DELETE CASCADE,
    FOREIGN KEY (idUser) REFERENCES users(id) ON DELETE CASCADE
);
SELECT * FROM users;
SELECT * FROM collections;
SELECT * FROM partage_collections;
