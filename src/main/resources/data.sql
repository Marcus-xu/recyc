-- Positions表测试数据
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information) VALUES("0000000001","2018-01-02 00:00:00",0.0,0.0,'on',"1000000001","一号先生 18756929625");
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information) VALUES("0000000002","2018-01-02 00:00:00",0.0,0.0,'on',"1000000001","二号先生 18756929625");
INSERT INTO Positions(employee_id,time,longitude,latitude,work_status,boss_id,information) VALUES("0000000003","2018-01-02 00:00:00",0.0,0.0,'off',"1000000001","三号先生 18756929625");


-- Bosses表测试数据
INSERT INTO Bosses(boss_id,`name`,phone) VALUES("1000000001","李小二","12233334444")