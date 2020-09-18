-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类', '2000', '1', 'category', 'commodity/category/index', 1, 'C', '0', '0', 'commodity:category:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '商品分类菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'commodity:category:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'commodity:category:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'commodity:category:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'commodity:category:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品分类导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'commodity:category:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');


-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品列表', '2000', '1', 'commodity', 'commodity/commodity/index', 1, 'C', '0', '0', 'commodity:commodity:list', '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '商品菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品查询', @parentId, '1',  '#', '', 1,  'F', '0',  '0', 'commodity:commodity:query',        '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品新增', @parentId, '2',  '#', '', 1,  'F', '0',  '0', 'commodity:commodity:add',          '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品修改', @parentId, '3',  '#', '', 1,  'F', '0',  '0', 'commodity:commodity:edit',         '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品删除', @parentId, '4',  '#', '', 1,  'F', '0',  '0', 'commodity:commodity:remove',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('商品导出', @parentId, '5',  '#', '', 1,  'F', '0',  '0', 'commodity:commodity:export',       '#', 'admin', '2018-03-01', 'ry', '2018-03-01', '');