

CREATE TABLE CUSTOMER (
   CUSTOMERID integer not null,
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
   	CUSTOMERID integer not null ,
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
      	CUSTOMERID integer,
      	APPVERSION integer,
      	LASTMODIFIED TIMESTAMP(6)
         );

CREATE TABLE STATUS(
      RETURN_CODE varchar2(10),
      RETURN_STATUS varchar2(50),
      RETURN_DESC varchar2(200)
);




