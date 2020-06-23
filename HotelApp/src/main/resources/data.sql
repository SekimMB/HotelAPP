DROP TABLE IF EXISTS clients;
CREATE table clients (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    surname VARCHAR(20),
    email VARCHAR(30),
    account_number INTEGER,
    phone INTEGER
);

INSERT INTO clients VALUES (1, 'Marcin', 'Kowalski', 'markow23@gmail.com', 12345, 546754678);
INSERT INTO clients VALUES (2, 'Marek', 'Nowak', 'marnow56@outlook.com', 54321, 987654321);
INSERT INTO clients VALUES (3, 'Laura', 'Kowalska', 'laurkow76@onet.pl', 65432, 546789234);
INSERT INTO clients VALUES (4, 'Izabela', 'Skowronska', 'izaskow9@wp.pl', 56789, 876345678);

DROP TABLE IF EXISTS loggedClient;
CREATE TABLE loggedClient (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    login VARCHAR(20),
    password VARCHAR(20),
    name VARCHAR(20),
    surname VARCHAR(20),
    email VARCHAR(30),
    bank_acc_number INTEGER,
    phone INTEGER
);

INSERT INTO loggedClient VALUES (1, 'devil666', 'qwerty123','Daniel', 'Danielowski', 'dandan97@wp.pl', 87456, 456789123);
INSERT INTO loggedClient VALUES (2, 'angel333', 'asdfg321', 'Andrzej', 'Andrzejewski', 'andand21@interia.pl', 65783, 123876045);
INSERT INTO loggedClient VALUES (3, 'trol123', 'zxcvb987', 'Maciej', 'Maciejewski', 'macmac654@gmail.com', 65734, 987654765);

DROP TABLE IF EXISTS receptionist;
CREATE TABLE receptionist (
    id_employee INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    surname VARCHAR(20)
);

INSERT INTO receptionist VALUES (1, 'Bogdan', 'Bogdanwoski');
INSERT INTO receptionist VALUES (2, 'Zbigniew', 'Zbigniewowski');
INSERT INTO receptionist VALUES (3, 'Karolina', 'Karolinowska');
INSERT INTO receptionist VALUES (4, 'Marcin', 'Marciniewski');

DROP TABLE IF EXISTS admin;
CREATE TABLE admin (
    id_admin INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    surname VARCHAR(20)
);

INSERT INTO admin VALUES (1, 'Roman', 'Romanowski');
INSERT INTO admin VALUES (2, 'Krystian', 'Krystianowski');

DROP TABLE IF EXISTS room;
CREATE TABLE room (
    id_room INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    state VARCHAR(20),
    price VARCHAR(10),
    size VARCHAR(10),
    occupant VARCHAR(20)
);

INSERT INTO room VALUES (1, 'wolny', '100', 'big', '2');
INSERT INTO room VALUES (2, 'wolny', '200', 'big', '4');
INSERT INTO room VALUES (3, 'zajety', '300', 'medium', '2');
INSERT INTO room VALUES (4, 'zajety', '50', 'small', '1');
INSERT INTO room VALUES (5, 'wolny', '250', 'big', '4');
INSERT INTO room VALUES (6, 'wolny', '145', 'medium', '2');

DROP TABLE IF EXISTS reservation;
CREATE TABLE reservation (
    id_reservation INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    id_client INT(6) UNSIGNED,
    id_room INT(6) UNSIGNED,
    start DATE,
    end DATE
);

INSERT INTO reservation VALUES (1, 2, 3, '10-10-2020', '13-10-2020');
INSERT INTO reservation VALUES (2, 3, 4, '15-10-2020', '19-10-2020');


