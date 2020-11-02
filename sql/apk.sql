-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理', '2000', '1', 'apk', 'update/apk/index', 1, 0, 'C', '0', '0', 'update:apk:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', 'apk管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'update:apk:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'update:apk:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'update:apk:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'update:apk:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('apk管理导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'update:apk:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


