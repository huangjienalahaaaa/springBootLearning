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


# v2.0
## 多环境配置文件（主要用于 你有多套环境的时候）：
![](images/15.jpg)

## Spring Boot 自定义配置：
![](images/16.jpg)
![](images/17.jpg)
![](images/18.jpg)
***这个方式，使用于配置项比较多的时候***


# v3.0 Spring Boot使用JSP：
***步骤：***

1. 在pom.xml文件中配置依赖项：

```java
<dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
```

除了上面这个包之外，还有下面这几个包，但是这几个包是可选的（因为运行时候，servlet,jsp啊，这些tomcat中都有，所以你可以加也可以不加）：
```java
<!--        servlet依赖的jar包-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
        </dependency>
        <!--        jsp依赖的jar包-->
        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>javax.servlet.jsp-api</artifactId>
            <version>2.3.1</version>
        </dependency>

        <!--        jstl标签依赖的jar包-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>

```


2. 在application.properties配置文件中，配置spring mvc的视图展示位jsp:
```java
spring.mvc.view.prefix=/
spring.mvc.view.suffix=.jsp
```

3. 在src/main下创建一个webapp目录，然后在该目录下新建jsp页面
4. 要在pom.xml中的build种，要配置备注中的配置信息：
```java
 <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.*</include>
                </includes>
            </resource>
            <!--  打包时将jsp文件拷贝到META-INF目录下 -->
            <resource>
                <!-- 源文件位置 -->
                <directory>src/main/webapp</directory>
                <!--编译到META-INF/resources目录下 -->
                <targetPath>META-INF/resources</targetPath>
                <includes>
<!--                    要把哪些文件编译过去，**表示多层目录，*.*表示所有文件-->
                    <include>**/*.*</include>
                </includes>
            </resource>
        </resources>
```

5. 新建jspConrtoller写代码测试一下。

# v4.0springBoot整合mybatis:

***步骤：***

1. 在pom.xml中配置相关jar依赖：
![](images/19.jpg)


2. 在springboot的核心配置文件application.properties中配置数据源：
![](images/20.jpg)

3. 在MyBatis的Mapper接口中添加@Mapper注解；
或者在运动的主类上添加 @MapperScan("com.bjpowernode.springboot.mapper")注解包扫描

4.在pom.xml中配置[myBatis代码自动生成]插件：
![](images/21.jpg)

等maven下载号之后，双击对应的插件：
![](images/22.jpg)


没写完，写不下去了，看视频



# v5.0 Spring Boot下的Spring MVC:

![](images/23.jpg)
![](images/24.jpg)
![](images/25.jpg)
![](images/26.jpg)
![](images/27.jpg)
![](images/28.jpg)
![](images/29.jpg)
![](images/30.jpg)


# v6.0 Spring Boot下的Restfull:
![](images/31.jpg)
![](images/32.jpg)
![](images/33.jpg)
![](images/34.jpg)

```java
Restfull原则：
1. 增post请求，删delete请求，改put请求，查get请求
2. 请求路径不要出现动词，查询订单：/boot/order/1/1021(正确), /boot/queryOrder/1/1021 (query是动词，不建议使用)
3. 分页，排序等操作，不需要采用斜杆传参数：比如说订单列表接口： /boot/orders?p=1&sort=desc
    所以：当传的参数不是数据库里的字段的时候，可以不用斜杆，可以用？的形式。
```

# v6.0 Spring Boot集成redis:
# v7.0 Spring Boot集成Dubbo:
# v8.0 Spring Boot热部署插件:
> 在实际开发中，我们修改某些代码逻辑功能或页面都需要重启应用，这无形中降低了开发效率；
> 热部署是指我们修改代码后，服务能自动重启加载新修改的内容，这样大大提高了我们的改法效率；
> spring boot热部署通过添加一个插件实现：<font color="red">spring-boot-devtools</font>
![](images/35.jpg)

# v9.0 Spring Boot非web应用程序方式（也就是开发纯java程序）:
![](images/36.jpg)
![](images/37.jpg)
![](images/38.jpg)
![](images/39.jpg)

***关闭logo，日志输出：***
![](images/40.jpg)


# v10.0springBoot使用拦截器:
![](images/41.jpg)

# v11.0springBoot中使用servlet:
![](images/42.jpg)

![](images/43.jpg)
![](images/44.jpg)

# v12.0springBoot中使用Filter(过滤器):
***Filter过滤器和servlet在springboot中用的都不是很多，主要还是用拦截器。且过滤器的用法和servlet是一模一样的***
![](images/45.jpg)
![](images/46.jpg)
![](images/47.jpg)
![](images/48.jpg)


# v13.0 springBoot配置字符编码：
![](images/49.jpg)

***第一种方式：***


* 第一种方式，原来是在web.xml文件中进行配置的。但是springBoot没有这个文件，所以也是跟上面一样的方式去配置。
![](images/50.jpg)
![](images/51.jpg)



***第二种方式：***
![](images/52.jpg)

# v14.0 SpringBoot 程序打war包部署：
![](images/56.jpg)

 ```java
Tomcat有2种存在形式（jar包和.zip）：
    1. 发布成.zip的压缩包，解压之后可以使用。
    2. 发布成jar包，然后你可以在你的项目代码中加入这个jar包，然后调用这个jar包启动tomcat。springboot采用的是这个方式
```

步骤：

1. 新建一个项目：
![](images/53.jpg)
![](images/54.jpg)
因为是打印成war包，所以是个web程序：
![](images/55.jpg)


> 打包如果是使用maven package的方式的话，会打包在本地的target下面；如果用的是maven install打包的话，会在本地maven仓库装一个包：
>![](images/57.jpg)

注意：pom.xml文件中要加入以下resource:
```java
 <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource> 
            <resource>
                <directory>src/main/resource</directory>
                <includes>
                    <include>**/*.*</include>
                </includes>
            </resource>
```

2. 将打包完war包复制放在tomcat的webapp下:
![](images/58.jpg)
然后运行tomcat:
![](images/59.jpg)

3.运行之后，会发现Tomcat会自动把你war包给解压：
![](images/60.jpg)

***此时项目的根目录就是：***
![](images/61.jpg)

所以要访问页面的话，就得再浏览器中输入：
http://127.0.0.1:9090/demo-0.0.1-SNAPSHOT/boot/jsp



# v15.0 SpringBoot 程序打jar包与运行：
![](images/62.jpg)


***为了能访问到jsp，将插件的版本改成1.4.2：***
![](images/64.jpg)



***运行：***
* 打完jar包之后，这个jar包可以放在任何的地方。
* 然后再地址栏输入"cmd"，打开终端
* 然后再终端中输入"java -jar jar包名"
![](images/63.jpg)


***在mvn package的时候可能会报错 ：***

1. 配置信息没有读到： 
![](images/65.jpg)

* 是因为src/main/resources下的配置文件没有编译到 target/classes下去（因为这个版本比较老，没有编译过去）：
![](images/66.jpg)

* 解决方案：
> 添加resources添加配置信息，表示：resources下的所有资源都编译到classes中：
![](images/67.jpg)


# v16.0 springBoot项目运行与部署方式总结：
![](images/68.jpg)

# v17.0 springBoot集成Spring Session:

# v18.0 springBoot健康检查Actuator:

![](images/69.jpg)

> Actuator与我们实际开发角度关系不大，有点偏向运维的角度。
> 对我们开发来说，可以作为了解

![](images/70.jpg)
![](images/71.jpg)
![](images/72.jpg)
![](images/73.jpg)
![](images/74.jpg)

***/shutdown，配置文件写好之后，如何去访问：***
![](images/75.jpg)

> JMX：是java的一个管理扩展，是通过jdk的一个工具去访问：
![](images/76.jpg)
![](images/77.jpg)
![](images/78.jpg)
![](images/79.jpg)
![](images/80.jpg)
![](images/81.jpg)
此时，就可以看到这个应用程序就退出了（也就是远程关闭服务）：
![](images/82.jpg)



# v19.0 springBoot继承Thymeleaf模板:
![](images/83.jpg)
![](images/84.jpg)



