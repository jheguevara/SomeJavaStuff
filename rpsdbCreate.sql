DROP TABLE Inventory;
DROP TABLE Item_BandMembers;
DROP TABLE DownloadableItem;
DROP TABLE Item;
DROP TABLE PurchaseItem;
DROP TABLE PurchaseOrder;
DROP TABLE SCORE;
DROP TABLE GAMESUMMARY;


CREATE TABLE SCORE
(
   ID     	BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
   WINS         VARCHAR(3),
   LOSSES 	VARCHAR(3),
   TIES		VARCHAR(3)
);

CREATE TABLE GAMESUMMARY
(
   ID     	BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
   CLIENT	VARCHAR(10),
   SERVER	VARCHAR(10),
   RESULT	VARCHAR(10),
   DATE		TIMESTAMP
);


INSERT INTO SCORE VALUES (DEFAULT, '3', '2', '1');

INSERT INTO GAMESUMMARY VALUES (DEFAULT, 'ROCK', 'ROCK', 'TIE', '2017-07-24 00:01:00.0');
INSERT INTO GAMESUMMARY VALUES (DEFAULT, 'PAPER', 'ROCK', 'TIE', '2017-07-25 00:02:00.0');
INSERT INTO GAMESUMMARY VALUES (DEFAULT, 'ROCK', 'ROCK', 'TIE', '2017-07-26 00:03:00.0');




COMMIT;