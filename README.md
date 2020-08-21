# BootDo 面向学习型的开源框架

https://gitee.com/lcg0124/bootdo

## 平台简介

BootDo是高效率，低封装，面向学习型，面向微服的**开源**Java EE开发框架。

BootDo是在SpringBoot基础上搭建的一个Java基础开发平台，MyBatis为数据访问层，ApacheShiro为权限授权层，Ehcahe对常用数据进行缓存。

BootDo主要定位于后台管理系统学习交流，已内置后台管理系统的基础功能和高效的**代码生成**工具，
包括：系统权限组件、数据权限组件、数据字典组件、核心工具组件、视图操作组件、工作流组件、代码生成等。
前端界面风格采用了结构简单、性能优良、页面美观大气的Twitter Bootstrap页面展示框架。
采用分层设计、双重验证、提交数据安全编码、密码加密、访问验证、数据权限验证。
使用Maven做项目管理，提高项目的易开发性、扩展性。

BootDo目前包括以下四大模块，系统管理（SYS）模块、
内容管理（CMS）模块、在线办公（OA）模块、代码生成（GEN）模块。 **系统管理模块** ，包括企业组织架构（用户管理、机构管理、区域管理）、
菜单管理、角色权限管理、字典管理等功能； **内容管理模块** ，包括内容管理（文章、链接），栏目管理、站点管理、
公共留言、文件管理、前端网站展示等功能； **在线办公模块** ，提供简单的请假流程实例；**代码生成模块** ，完成重复的工作。

BootDo 提供了常用工具进行封装，包括日志工具、缓存工具、服务器端验证、数据字典、当前组织机构数据
（用户、机构、区域）以及其它常用小工具等。另外还提供一个强大的在线 **代码生成** 工具。

## 内置功能

1.	用户管理：用户是系统操作者，该功能主要完成系统用户配置。
2.	机构管理：配置系统组织机构（公司、部门、小组），树结构展现，可随意调整上下级。
3.	区域管理：系统城市区域模型，如：国家、省市、地市、区县的维护。
4.	菜单管理：配置系统菜单，操作权限，按钮权限标识等。
5.	角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
6.	字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。
7.	操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
8.	连接池监视：监视当期系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。
9.	工作流引擎：实现业务工单流转、在线流程设计器。


## 技术选型

1、后端

* 核心框架：Spring Boot
* 安全框架：Apache Shiro 
* 模板引擎：Thymeleaf
* 持久层框架：MyBatis
* 数据库连接池：Alibaba Druid 
* 缓存框架：Ehcache 、Redis
* 日志管理：SLF4J 
* 工具类：Apache Commons、Jackson 、Xstream 1.4、Dozer 5.3、POI 3.9

2、前端

* JS框架：jQuery
* 客户端验证：JQuery Validation 
* 富文本在线编辑：summernote
* 在线文件管理：CKFinder
* 数据表格：bootstrapTable
* 弹出层：layer
* 树结构控件：jsTree

4、平台

* 服务器中间件：SpringBoot内置
* 数据库支持：目前仅提供MySql数据库的支持，但不限于数据库，平台留有其它数据库支持接口，
你可以很方便的更改为其它数据库，如：SqlServer 2008、MySql 5.5、H2等
* 开发环境：Java、Eclipse Java EE 、Maven 、Git

## 安全考虑

1. 开发语言：系统采用Java 语言开发，具有卓越的通用性、高效性、平台移植性和安全性。
2. 分层设计：（数据库层，数据访问层，业务逻辑层，展示层）层次清楚，低耦合，各层必须通过接口才能接入并进行参数校验（如：在展示层不可直接操作数据库），保证数据操作的安全。
3. 双重验证：用户表单提交双验证：包括服务器端验证及客户端验证，防止用户通过浏览器恶意修改（如不可写文本域、隐藏变量篡改、上传非法文件等），跳过客户端验证操作数据库。
4. 安全编码：用户表单提交所有数据，在服务器端都进行安全编码，防止用户提交非法脚本及SQL注入获取敏感数据等，确保数据安全。
5. 密码加密：登录用户密码进行SHA1散列加密，此加密方法是不可逆的。保证密文泄露后的安全问题。
6. 强制访问：系统对所有管理端链接都进行用户身份权限验证，防止用户直接填写url进行访问。

## 演示地址



## 交流反馈

## QQ群 951449465

## 版权声明

本软件使用 [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0) 协议，请严格遵照协议内容

- [x] 注：已上内容为整体规化，部分功能还在实现中


商城模块 （店铺管理，商品管理，类别管理，地址管理，专题管理，文章管理，banner管理，优惠劵管理，品牌管理，
购物车管理，评论管理，我的收藏，楼层管理，分类管理，会员管理，订单管理 ，订单日志）
1.项目部署，将bootdo.sql导入mysql，修改application-dev.yml文件的数据库信息，
运行bootdo模块的 BootdoApplication类（直接点右键运行）

http://j2shop.tunnel.qydev.com/street/index
http://j2shop.tunnel.qydev.com/login

http://j2shop.tunnel.qydev.com/disShop/index
http://j2shop.tunnel.qydev.com/web/index

http://j2shop.tunnel.qydev.com/web/cms/index
http://j2shop.tunnel.qydev.com/blog/index

http://j2shop.tunnel.qydev.com/taobao/index
本地将 j2shop.tunnel.qydev.com  改为localhost
http://localhost/login 后台  账号 admin admin
http://localhost/taobao/login  wap项目   账号 456789  456789




git 分布式版本
https://gitee.com/catshen/zscat_sw

2.创建小程序的账号，下载开发工具，然后导入项目webchatapp
打开shell或cmd，进入ngrok目录，运行 `ngrok -config ngrok.cfg -subdomain zscat 80`
然后运行小程序
### 接口.md为 小程序的接口

### 后台商城演示

![输入图片说明](https://gitee.com/uploads/images/2017/1025/180334_51525b54_134431.png "QQ图片20171025174621.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180346_f53edd7c_134431.png "QQ图片20171025174635.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180355_eb20b1b5_134431.png "QQ图片20171025174645.png")

### h5演示

![输入图片说明](https://gitee.com/uploads/images/2017/1025/180412_b9755dfe_134431.png "QQ图片20171025174652.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180420_94e11148_134431.png "QQ图片20171025174658.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180432_b9f7b2b6_134431.png "QQ图片20171025174707.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180440_833cce1d_134431.png "QQ图片20171025174756.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180448_5c483b2a_134431.png "QQ图片20171025174801.png")

### 小程序演示 

![输入图片说明](https://gitee.com/uploads/images/2017/1025/180507_0a581be2_134431.png "QQ图片20171025175709.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180516_4d0e4ba6_134431.png "QQ图片20171025175447.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180524_8d557d35_134431.png "QQ图片20171025175453.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180532_961500d0_134431.png "QQ图片20171025175458.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180541_cd4ec06c_134431.png "QQ图片20171025175512.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180550_47dad79b_134431.png "QQ图片20171025175517.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180604_3e71fb1b_134431.png "QQ图片20171025175525.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180611_544d1da3_134431.png "QQ图片20171025175552.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180619_ba8b1747_134431.png "QQ图片20171025175559.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180626_5a8cad93_134431.png "QQ图片20171025175603.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180634_c2b59ea8_134431.png "QQ图片20171025175612.png")
![输入图片说明](https://gitee.com/uploads/images/2017/1025/180643_55227726_134431.png "QQ图片20171025175620.png")