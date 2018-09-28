insert into CUSTOMER
values(10001,'MS', 'abs','abs','abs','abs','2004-12-31','abs','','123456','y','Active');

insert into ADDRESS
      values(10002,'10001', 'abs','abs','abs','abs','A23456');

 insert into DEVICE
               values(10003,'10001', '1','2004-12-31 11:11:11');

 insert into STATUS
               values('0000','Success','Your request have been successfully submitted');

 insert into STATUS
               values('999','Error','An error occurred. Please try again later.');


-----------------Terms and Condition data-----------------------------
insert into app_tnc
       values (1,'These are the Terms of your Virgin Essential Current Account. These Terms, along with our Welcome guide, make up our agreement with you.We give you a copy of both of these documents when you open your account. You can also get copies on our website or by calling us. We will give you a copy of any additional Terms that apply when you take out the account or service. If there is any inconsistency between any additional Terms and these Terms, the additional Term apply. 1 Who provide the account? We are Virgin money pic.',sysdate);

insert into CONFIGINFO
               values(1,'2.02','2.0');

insert into SYSTEM_CONFIG values('App.version','1.0');
