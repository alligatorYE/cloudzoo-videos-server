#基于微信小程序的动物云短视频平台 小程序后台服务端
动物云(个人项目-短视频发布系统)：获学院毕业设计大赛第一名
项目核心技术栈：
核心框架:Spring Framework，SpringBoot	持久层：MyBatis	中间件: zookeeper，redis
数据库: MySQL/MariaDB	数据源：Druid		前端框架: Bootstrap + Jquery	
视频处理: FFmpeg	前端分页组件: jqGrid
云服务器平台:腾讯云、阿里云
项目描述：
本项目是基于微信小程序的短视频平台，用户注册后可以发布和实时观看视频，对发布的视频进行评论、点赞、转发、下载，对违规视频可以进行举报。管理员可以通过后台管理程序处理违规视频，上传和管理背景音乐。小程序后天管理程序核心框架使用Spring boot持久层使用MyBatis，为用户操作提供后台支撑。后台管理程序核心框架使用Spring Framework持久层使用MyBatis前端框架使用Bootstrap + Jquery为管理员管理数据提供服务。项目使用zookeeper和redis作为中间件，redis技术高缓存提升用户体验，以缓存换取度，zookeeper技术对数据节点监听，实现数据分发与订阅，负载均衡：部署于阿里云和腾讯云的两台服务器构成简单的分布式系统。
项目地址:	
https://github.com/alligatorYE/cloudzoo-videos-server.git



CloudZoo (Personal Project - Short Video Release System): First place in the College Graduation Design Competition
Project core technology stack:
Core Framework: Spring Framework, SpringBoot Persistence Layer: MyBatis Middleware: zookeeper, redis
Database: MySQL/MariaDB Data Source: Druid Front End Framework: Bootstrap + Jquery
Video Processing: FFmpeg front-end paging component: jqGrid
Cloud server platform: Tencent Cloud, Alibaba Cloud
project description:
This project is a short video platform based on WeChat applet. After the user registers, the user can post and watch the video in real time, comment, like, forward, download the posted video, and report the illegal video. Administrators can handle offending videos, upload and manage background music through the background manager. The applet management kernel framework uses the Spring boot persistence layer to use MyBatis to provide background support for user operations. The daemon core framework uses the Spring Framework persistence layer to use the MyBatis front-end framework to use Bootstrap + Jquery to manage data for administrators. The project uses zookeeper and redis as middleware, redis technology high cache to enhance user experience, cache exchange, zookeeper technology for data node monitoring, data distribution and subscription, load balancing: two servers deployed in Alibaba Cloud and Tencent Cloud Simple distributed system.
Project address: 
https://github.com/alligatorYE/cloudzoo-videos-server.git
