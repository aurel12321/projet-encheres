USE Projet_ENI_enchere;

INSERT INTO Utilisateurs (pseudo, nom, prenom, email, telephone, rue, codePostal, ville, motDePasse)
VALUES 
('jdupuis', 'Dupuis', 'Jean', 'j.dupuis@example.com', '0600000001', '1 rue des Fleurs', '75001', 'Paris', 'pass123'),
('mleroy', 'Leroy', 'Marie', 'm.leroy@example.com', '0600000002', '2 avenue Victor Hugo', '69001', 'Lyon', 'pass123'),
('pbernard', 'Bernard', 'Paul', 'p.bernard@example.com', '0600000003', '3 boulevard Haussmann', '13001', 'Marseille', 'pass123'),
('aclement', 'Cl�ment', 'Alice', 'a.clement@example.com', '0600000004', '4 rue Nationale', '33000', 'Bordeaux', 'pass123'),
('lmoreau', 'Moreau', 'Luc', 'l.moreau@example.com', '0600000005', '5 place Bellecour', '69002', 'Lyon', 'pass123'),
('fmartin', 'Martin', 'Fran�oise', 'f.martin@example.com', '0600000006', '6 rue de la R�publique', '59000', 'Lille', 'pass123'),
('tgarcia', 'Garcia', 'Thomas', 't.garcia@example.com', '0600000007', '7 rue des Lilas', '31000', 'Toulouse', 'pass123'),
('elambert', 'Lambert', 'Emma', 'e.lambert@example.com', '0600000008', '8 rue des Vignes', '67000', 'Strasbourg', 'pass123'),
('hrobert', 'Robert', 'Hugo', 'h.robert@example.com', '0600000009', '9 rue du Ch�teau', '06000', 'Nice', 'pass123'),
('cfaure', 'Faure', 'Chlo�', 'c.faure@example.com', '0600000010', '10 rue du Lac', '74000', 'Annecy', 'pass123');

INSERT INTO Categories (libelle)
VALUES 
('Informatique'),
('Mobilier'),
('V�tements'),
('Jeux vid�o'),
('�lectrom�nager');

INSERT INTO Articles (nomArticle, description, dateDebutEncheres, dateFinEncheres, miseAPrix, prixVente, idUtilisateur, idCategorie)
VALUES 
('Ordinateur portable', 'Laptop Dell 15 pouces', '2025-07-01', '2025-07-07', 300, NULL, 1, 1),
('Canap�', 'Canap� en cuir 3 places', '2025-07-01', '2025-07-05', 150, NULL, 2, 2),
('Robe �t�', 'Robe l�g�re taille M', '2025-07-02', '2025-07-06', 30, NULL, 3, 3),
('PS5', 'Console Sony avec 2 manettes', '2025-07-03', '2025-07-08', 400, NULL, 4, 4),
('Micro-ondes', 'Micro-ondes Samsung 25L', '2025-07-01', '2025-07-05', 70, NULL, 5, 5);

INSERT INTO Retraits (idArticle, rue, codePostal, ville)
VALUES 
(1, '1 rue du Retrait', '75001', 'Paris'),
(2, '2 avenue du Meuble', '69002', 'Lyon'),
(3, '3 rue de la Mode', '33000', 'Bordeaux'),
(4, '4 all�e des Gamers', '31000', 'Toulouse'),
(5, '5 place de la Cuisine', '59000', 'Lille');

INSERT INTO Encheres (idUtilisateur, idArticle, dateEnchere, montantEnchere)
VALUES 
(2, 1, '2025-07-02', 320),
(3, 1, '2025-07-03', 350),
(4, 2, '2025-07-02', 180),
(5, 3, '2025-07-03', 40),
(1, 4, '2025-07-04', 450),
(3, 5, '2025-07-02', 90);
