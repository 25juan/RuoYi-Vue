-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息', '2000', '1', 'application', 'update/application/index', 1, 0, 'C', '0', '0', 'update:application:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '应用信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'update:application:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'update:application:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'update:application:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'update:application:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('应用信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'update:application:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');