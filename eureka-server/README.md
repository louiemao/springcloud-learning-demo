### pom.xml
```
	<dependencies>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
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
通过```@EnableEurekaServer```注解启动一个服务注册中心提供给其他应用进行对话。

### 配置
在默认设置下，该服务注册中心也会将自己作为客户端来尝试注册它自己，所以我们需要禁用它的客户端注册行为，只需要在application.properties配置文件中增加如下信息：
```
spring.application.name=eureka-server
server.port=1001

eureka.instance.hostname=localhost
eureka.client.registerWithEureka=false
eureka.client.fetchRegistry=false
```
为了与后续要进行注册的服务区分，这里将服务注册中心的端口通过server.port属性设置为1001。启动工程后，访问：http://localhost:1001/，可以看到下面的页面，其中还没有发现任何服务。