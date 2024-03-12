# P 搜索 -- 一款聚合搜索平台
基于 Spring Boot + Elastic Stack（+ Vue 3）的一站式信息聚合搜索平台。用户可在同一页面集中搜索出不同来源、不同类型的内容（比如文章、图片、用户等），提升搜索体验。

## 项目介绍
企业级一站式聚合搜索平台，基于Vue 3前端+ Spring Boot后端+ Elastic Stack的**全栈项目**。
对用户来说，使用该平台，可以在同一个页面集中搜索出不同来源、不同类型的内容，提升用户的检索效率和搜索体验。
对企业来说，当企业内部有多个项目的数据都存在搜索需求时，无需针对每个项目单独开发搜索功能，可以直接将各项目的数据源接入搜索中台，从而提升开发效率、降低系统维护成本。

P 搜索 -- 搜文章：

![image](https://github.com/Seven11111/pengso-backend/assets/101923429/64c459ea-df92-45c6-8a81-c0854388cfda)

P 搜索 -- 搜图片

![image](https://github.com/Seven11111/pengso-backend/assets/101923429/7f26feb1-35b5-4673-904f-5627f271ffaa)

P 搜索 -- 搜用户

![image](https://github.com/Seven11111/pengso-backend/assets/101923429/8f7f25ec-4a7f-401f-8bbf-e5e7f2d616d0)

## 项目组成
本项目为前后端分离项目，
前端：https://github.com/Seven11111/pengso-frontend
后端：https://github.com/Seven11111/pengso-backend

## 技术选型

**前端**

- ​Vue 3​
- Ant Design Vue 组件库
​- 页面状态同步机制​​

**后端**

- ​Spring Boot 2.7 框架
- MySQL 数据库
- Elastic Stack ​Elasticsearch 搜索引擎
- Logstash 数据管道
- Kibana 数据可视化
- 数据抓取​离线和实时抓取​Jsoup 和 HttpClient 库​

**设计模式** ​
- 门面模式​
- 适配器模式​
- 注册器模式

​**数据同步（4 种方式）** 
​- 定时​双写
​- Logstash​
- Canal​
- JMeter 压力测试


