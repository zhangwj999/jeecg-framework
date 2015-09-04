delete from jform_cgreport_head where code='chanelreport';
delete from jform_cgreport_item where CGRHEAD_ID=(select id from jform_cgreport_head where code='chanelreport');


INSERT INTO lhmh_td.jform_cgreport_head
(ID, CGR_SQL, CODE, CONTENT, NAME)
VALUES('402880ea4e9c2863014e9c339c3c0001', 'select
	a.channel_id,a.channel_name,a.status,a.is_work,b.officee_name,c.terminal_name,d.departname
from
	channel a
	left join office b on a.bank_id=b.bank_id
	left join terminal c on b.terminal_id=c.terminal_id
	left join t_s_depart d on a.bank_id=d.id', 'chanelreport', '通道查询', '通道查询');



INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c339ee80004', 'Y', 'single', '402880ea4e9c2863014e9c339c3c0001', 'status', '', 'status', '是否启用', 'String', 'Y', 6, '启用_01,未启用_02');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c339ef70007', 'N', 'single', '402880ea4e9c2863014e9c339c3c0001', '', '', 'TERMINAL_NAME', '终端', 'String', 'Y', 5, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c339ee50003', 'Y', 'single', '402880ea4e9c2863014e9c339c3c0001', '', '', 'channel_name', '通道名称', 'String', 'Y', 2, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c339ef10005', 'Y', 'single', '402880ea4e9c2863014e9c339c3c0001', 'isWork', '', 'is_work', '是否在线', 'String', 'Y', 7, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c3cd2c6000e', 'N', 'single', '402880ea4e9c2863014e9c339c3c0001', '', '', 'departname', '银行网点', 'String', 'Y', 3, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880ea4e9c2863014e9c339c490002', 'Y', 'single', '402880ea4e9c2863014e9c339c3c0001', '', '', 'channel_id', '通道编号', 'String', 'Y', 1, '');


delete from jform_cgreport_head where code='storagereport';
delete from jform_cgreport_item where CGRHEAD_ID=(select id from jform_cgreport_head where code='storagereport');


INSERT INTO lhmh_td.jform_cgreport_head
(ID, CGR_SQL, CODE, CONTENT, NAME)
VALUES('402880e74ea46b1d014ea47223a60001', 'select
	STORAGE_ID,
	STORAGE_NAME,
	STORAGE_IP,
	STORAGE_PORT,
	DATA_PORT,
	SPACE,
	SPACE_MIN,
	STATUS,
	SPACE_USED,
	SPACE_UN,
	EMP_ID,
	EMP_NAME,
	TEL,
	departname,
	warnflag
from
(
select 
	a.STORAGE_ID,
	a.STORAGE_NAME,
	a.STORAGE_IP,
	a.STORAGE_PORT,
	a.DATA_PORT,
	a.SPACE,
	a.SPACE_MIN,
	a.STATUS,
	a.SPACE_USED,
	a.SPACE_UN,
	a.EMP_ID,
	b.EMP_NAME,
	b.TEL,
	c.departname,
	case when a.space_un is null then "02"
	else 
		case when a.space_min>a.space_un then "01" else "02" end 
	end warnflag
from 
storage a left join employee b on a.EMP_ID=b.EMP_ID 
left join t_s_depart c on a.BANK_ID=c.ID
)b
', 'storagereport', '存储设备查询', '存储设备查询');


INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223cf0004', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'storage_ip', 'IP', 'String', 'Y', 2, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea53c86014ea553b6f70001', 'Y', 'single', '402880e74ea46b1d014ea47223a60001', 'status', '', 'warnflag', '是否预警', 'String', 'Y', 14, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223d60006', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'DATA_PORT', '数据端口', 'String', 'Y', 4, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223e3000b', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'SPACE_UN', '未使用空间(G)', 'String', 'Y', 9, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223e1000a', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'SPACE_USED', '已使用空间(G)', 'String', 'Y', 8, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223ec000e', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'TEL', '联系电话', 'String', 'Y', 12, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223dc0008', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'SPACE_MIN', '预警空间(G)', 'Long', 'Y', 6, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223cd0003', 'Y', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'storage_name', '名称', 'String', 'Y', 1, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223d10005', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'STORAGE_PORT', '存储端口', 'String', 'Y', 3, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223e9000d', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'EMP_NAME', '员工名称', 'String', 'Y', 11, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223df0009', 'Y', 'single', '402880e74ea46b1d014ea47223a60001', 'status', '', 'status', '是否启用', 'String', 'Y', 7, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223f0000f', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'departname', '银行', 'String', 'Y', 13, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223da0007', 'N', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'SPACE', '存储空间(G)', 'Long', 'Y', 5, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea47223a90002', 'Y', 'single', '402880e74ea46b1d014ea47223a60001', '', '', 'storage_id', '编号', 'String', 'Y', 0, '');



INSERT INTO lhmh_td.jform_cgreport_head
(ID, CGR_SQL, CODE, CONTENT, NAME)
VALUES('402880e74ea46b1d014ea4900298001a', 'SELECT
	A.terminal_id,
	A.terminal_name,
	A.TERMINAL_IP,
	A.TERMINAL_PORT,
	d.STORAGE_NAME,
	A.status,
	A.UPLOAD_TIME,
	A.PRE_TIME,
	A.DELAY_TIME,
	A.TIME_END,
	A.is_normal,
	B.departname,
	C.EMP_NAME,
	C.TEL
FROM
	terminal A LEFT JOIN t_s_depart B ON A.BANK_ID=B.ID
	LEFT JOIN employee C ON A.EMP_ID=C.EMP_ID
	left join storage d on a.STORAGE_Id=d.STORAGE_ID', 'terminalreport', '终端报表', '终端报表');

	

INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afcc001f', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'TERMINAL_IP', '终端IP', 'String', 'Y', 2, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afe7002a', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'TEL', '联系电话', 'String', 'Y', 13, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afd10021', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'STORAGE_NAME', '存储设备', 'String', 'Y', 4, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afdf0026', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'TIME_END', '上传结束时间', 'String', 'Y', 9, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afd90025', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'DELAY_TIME', '录像延迟时间', 'String', 'Y', 8, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afe20028', 'Y', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'departname', '银行网点', 'String', 'Y', 11, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afd40023', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'UPLOAD_TIME', '上传开始时间', 'String', 'Y', 6, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afc8001e', 'Y', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'terminal_name', '终端名称', 'String', 'Y', 1, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afcf0020', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'TERMINAL_PORT', '终端端口', 'String', 'Y', 3, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afe00027', 'Y', 'single', '402880e74ea46b1d014ea4900298001a', 'isNormal', '', 'is_normal', '正常工作状态', 'String', 'Y', 10, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afd60024', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'PRE_TIME', '预录像时间', 'String', 'Y', 7, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afe40029', 'N', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'EMP_NAME', '员工姓名', 'String', 'Y', 12, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afd30022', 'Y', 'single', '402880e74ea46b1d014ea4900298001a', 'status', '', 'status', '是否启用', 'String', 'Y', 5, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea46b1d014ea495afc4001d', 'Y', 'single', '402880e74ea46b1d014ea4900298001a', '', '', 'terminal_id', '终端编号', 'String', 'Y', 0, '');

delete from jform_cgreport_head where code='filldetailreport';
delete from jform_cgreport_item where CGRHEAD_ID=(select id from jform_cgreport_head where code='filldetailreport');

INSERT INTO lhmh_td.jform_cgreport_head
(ID, CGR_SQL, CODE, CONTENT, NAME)
VALUES('402880e74ea62d70014ea6424f810004', 'select
	a.bill_id,a.channel_id,a.file_url,a.file_name,a.begin_time,a.end_time,a.status,a.file_rate,a.is_del,b.channel_name,c.crt_date,d.officee_name,c.user_name
from 
	bill_detail a 
	left join channel b on a.CHANNEL_ID=b.CHANNEL_ID
	left join bill c on a.bill_id=c.bill_id
	left join office d on c.office_id=d.office_id
', 'filldetailreport', '文件明细报表', '文件明细报表');

INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea642502b0007', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'file_url', '文件URL', 'String', 'Y', 6, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea642502e0009', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'begin_time', '开始时间', 'String', 'Y', 8, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea642503c000e', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'channel_name', '通道名称', 'String', 'Y', 5, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea642503a000d', 'Y', 'single', '402880e74ea62d70014ea6424f810004', 'isdel', '', 'is_del', '是否删除', 'String', 'Y', 12, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('4028ee814f2f3dac014f2f5082550002', 'Y', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'officee_name', '理财室', 'String', 'Y', 2, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea6425035000b', 'Y', 'single', '402880e74ea62d70014ea6424f810004', 'filestatus', '', 'status', '上传状态', 'String', 'Y', 10, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea64250290006', 'Y', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'channel_id', '通道编号', 'String', 'Y', 4, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea642502c0008', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'file_name', '文件名称', 'String', 'Y', 7, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('4028ee814f2f3dac014f2f5082550001', 'Y', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'crt_date', '理财日期', 'String', 'Y', 1, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea6425038000c', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'file_rate', '上传进度', 'String', 'Y', 11, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('4028ee814f2f3dac014f2f5082550003', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'user_name', '录入人', 'String', 'Y', 3, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea6425032000a', 'N', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'end_time', '结束时间', 'String', 'Y', 9, '');
INSERT INTO lhmh_td.jform_cgreport_item
(ID, S_FLAG, S_MODE, CGRHEAD_ID, DICT_CODE, FIELD_HREF, FIELD_NAME, FIELD_TXT, FIELD_TYPE, IS_SHOW, ORDER_NUM, REPLACE_VA)
VALUES('402880e74ea62d70014ea6424f8f0005', 'Y', 'single', '402880e74ea62d70014ea6424f810004', '', '', 'bill_id', '业务流水号', 'String', 'Y', 0, '');
