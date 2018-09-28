

CREATE TABLE CUSTOMER (
   CUSTOMERID varchar2(50) not null,
	TITLE varchar(255) not null,
	FIRSTNAME varchar(255),
	MIDDLENAME varchar(50),
	LASTNAME varchar(50),
	PREVIOUSNAME varchar(50),
	DATEOFBIRTH DATE,
	NATIONALITY varchar(50),
	ADDRESSID varchar(50),
	PASSCODE int,
	TNC CHAR(1),
	STATE varchar(10),
	primary key(CUSTOMERID)
   );




   CREATE TABLE ADDRESS (
    ADDRESSID integer not null,
   	CUSTOMERID varchar2(50) not null,
   	FROMDATE varchar(50),
   	TODATE varchar(50),
   	COUNTRY varchar(20),
   	ADDRESS1 varchar(100),
   	POSTCODE varchar(8),
   	foreign key(CUSTOMERID)
   	REFERENCES customer(CUSTOMERID)
      );



      CREATE TABLE DEVICE (
         DEVICEID integer not null,
      	CUSTOMERID varchar2(50),
      	APPVERSION integer,
      	LASTMODIFIED TIMESTAMP(6)
         );

CREATE TABLE STATUS(
      RETURN_CODE varchar2(10),
      RETURN_STATUS varchar2(50),
      RETURN_DESC varchar2(200)
);

 -------------Alter table Device for indicating foreign key-------------
    alter table device add constraint FK3kcl3wpic0bcwu2x204mekviy foreign key (customerid) references customer ;

    -------------Terms and Conditions Table -------------------
     CREATE TABLE app_tnc
     ( term_id INT PRIMARY KEY,
       term_desc VARCHAR2(1000),
       last_modified_date timestamp(6) default sysdate
     );

CREATE TABLE "CONFIGINFO"
   (	"CONFIGID" integer not null,
	"VERRUN" FLOAT,
	"VERREQ" FLOAT

   ) ;

CREATE TABLE SYSTEM_CONFIG (
     SYSKEY varchar(255) not null,
     SYSVAL varchar(255)
     );
