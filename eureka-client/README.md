### pom.xml
```
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
		</dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
	</dependencies>

	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>Dalston.SR1</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>
```

### 启动类
通过```@EnableEurekaClient```表明自己是一个eurekaclient

### 配置
```
spring.application.name=eureka-client
server.port=2001

eureka.client.serviceUrl.defaultZone=http://localhost:1001/eureka/
```
通过spring.application.name属性，我们可以指定微服务的名称后续在调用的时候只需要使用该名称就可以进行服务的访问。
eureka.client.serviceUrl.defaultZone属性对应服务注册中心的配置内容，指定服务注册中心的位置。
为了在本机上测试区分服务提供方和服务注册中心，使用server.port属性设置不同的端口。

### 测试
启动前需要先启动eureka-server。

启动该工程后，再次访问：http://localhost:1001/。可以看到Instances currently registered with Eureka下多出了一个EUREKA-CLIENT，如此表示注册成功。