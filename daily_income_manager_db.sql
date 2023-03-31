--CREATE TABLE
CREATE TABLE DAILY_INCOME_MANAGER(
INCOME_MANAGER_ID INT PRIMARY KEY NOT NULL,
INCOME_TYPE VARCHAR(30),
TOTAL_AMOUNT INT,
PAYMENT_TYPE VARCHAR(30),
PARTY_CONTACT_NUMBER LONG,
PARTY_NAME VARCHAR(30),
CREATED_DATE DATE
);


--INSERT DATA INTO TABLE
INSERT INTO DAILY_INCOME_MANAGER VALUES (102,'Application Form',50,'Paytm',9874563210,'HIMANSHU', SYSDATE );
commit;
--SELECT DATA FROM TABLE
SELECT * FROM DAILY_INCOME_MANAGER;

--UPDATE EXISTING DATA
UPDATE DAILY_INCOME_MANAGER SET PARTY_NAME ='RAJ',PARTY_CONTACT_NUMBER='9874563210'
WHERE INCOME_MANAGER_ID = 101;

--DELETE DATA FROM TABLE
DELETE FROM DAILY_INCOME_MANAGER
WHERE INCOME_MANAGER_ID = 101;
