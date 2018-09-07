

------------------------------------------------
-- Database creation script---------------------
------------------------------------------------
CREATE USER OneAppDemo identified by javateam;
GRANT CONNECT To OneAppDemo;
GRANT CONNECT, RESOURCE, DBA TO books_admin;
COMMIT;


CREATE TABLE "CUSTOMER"
   (	"CUSTOMERID" NUMBER(10,0),
	"TITLE" VARCHAR2(5 BYTE),
	"FIRSTNAME" VARCHAR2(50 BYTE),
	"MIDDLENAME" VARCHAR2(50 BYTE),
	"LASTNAME" VARCHAR2(50 BYTE),
	"PREVIOUSNAME" VARCHAR2(50 BYTE),
	"DATEOFBIRTH" DATE,
	"NATIONALITY" VARCHAR2(50 BYTE),
	"ADDRESSID" VARCHAR2(50 BYTE),
	"PASSCODE" NUMBER(6,0),
	"TNC" CHAR(1 BYTE),
	"STATE" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION DEFERRED
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;


CREATE TABLE "ADDRESS"
   (	"ADDRESSID" VARCHAR2(50 BYTE),
	"CUSTOMERID" NUMBER(10,0),
	"FROMDATE" VARCHAR2(50 BYTE),
	"TODATE" VARCHAR2(50 BYTE),
	"COUNTRY" VARCHAR2(20 BYTE),
	"ADDRESS1" VARCHAR2(100 BYTE),
	"POSTCODE" VARCHAR2(8 BYTE)
   ) SEGMENT CREATION DEFERRED
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;


 CREATE TABLE "DEVICE"
   (	"DEVICEID" VARCHAR2(100 BYTE),
	"CUSTOMERID" NUMBER(10,0),
	"APPVERSION" NUMBER(2,1),
	"LASTMODIFIED" TIMESTAMP (6)
   ) SEGMENT CREATION DEFERRED
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;

  COMMIT;

