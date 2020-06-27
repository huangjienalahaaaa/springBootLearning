# v1.0 
## 1. 第七阶段课程大纲：
 ```
1. Nginx:HTTP服务器，反向代理服务器
2. Spring Session :互联网应用中集群/分布式模式下的Session共享解决方案：
3. Spring Boot :Spring家族中的一个全新微服务开发框架：
4. FastDFS:分布式文件系统，大容量文件存储解决方案；
5. AdtiveMQ:消息队列服务器，消息中间件；
6. MYSQL:主从复制，一主多从，双主双从，多数据源；
7. SecKill :开发一个高并发秒杀项目（综合实战）
8. Mycat:Mysql数据库中间件，实现读写分离与分库分表；
9. HighCurrency:互联网中常见大流量高并发解决方案：（面试常问）
10. P2P-Admin:开发一个P2P后台管理系统（开发几个核心功能）
```

## 2. Spring boot简介：
![](images/1.jpg)

## 3. Spring boot特性:
![](images/2.jpg)

## 4. Spring boot四大核心：
![](images/3.jpg)

***Groovy:***
![](images/4.jpg)


## 5. Spring boot开发环境：
![](images/5.jpg)

## 6. 第一个Spring boot程序：
![](images/6.jpg)

### 第一步：创建一个Spring boot项目：
![](images/7.jpg)
***打包方式：springboot程序默认是打jar包***


### 第二步：加入Spring boot的父级和起步依赖：
![](images/8.jpg)

### 第三步：创建Spring boot的入口main方法：
![](images/9.jpg)


### 第四步：创建Spring mvc的Controller：
![](images/10.jpg)

### 第五步：运行Spring boot的入口main方法：
![](images/11.jpg)

## spirng boot 程序分析：
![](images/12.jpg)



## spirng boot 的核心配置文件：
![](images/12.jpg)

![](images/13.jpg)

![](images/14.jpg)

***默认是读application.properties，当application.properties和application.yml都存在的时候也是默认读application.properties文件中的配置。所以要想读yml文件，需要将application.properties文件删除或者改名***
