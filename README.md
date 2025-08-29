bean defined in descendant @configuration seems not to be created

compile:
mvn clean install

run:
cd web/main-war
mvn spring-boot:run

result:
mvn spring-boot:run
540 [INFO] Scanning for projects...
596 [INFO] 
596 [INFO] ---------------------< hu.risko.project:main-war >----------------------
596 [INFO] Building main-war 1.0.0
596 [INFO] --------------------------------[ war ]---------------------------------
629 [INFO] 
629 [INFO] >>> spring-boot-maven-plugin:2.7.18:run (default-cli) > test-compile @ main-war >>>
704 [INFO] 
705 [INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ main-war ---
790 [INFO] Using 'UTF-8' encoding to copy filtered resources.
791 [INFO] Copying 0 resource
792 [INFO] 
792 [INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ main-war ---
883 [INFO] Nothing to compile - all classes are up to date
883 [INFO] 
883 [INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ main-war ---
884 [INFO] Using 'UTF-8' encoding to copy filtered resources.
884 [INFO] skip non existing resourceDirectory /home/riskop/IdeaProjects/confighiba2/web/main-war/src/test/resources
884 [INFO] 
884 [INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ main-war ---
886 [INFO] No sources to compile
886 [INFO] 
886 [INFO] <<< spring-boot-maven-plugin:2.7.18:run (default-cli) < test-compile @ main-war <<<
886 [INFO] 
886 [INFO] 
886 [INFO] --- spring-boot-maven-plugin:2.7.18:run (default-cli) @ main-war ---
1031 [INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::               (v2.7.18)

2025-08-29 17:16:38.875  INFO 2031910 --- [           main] hu.risko.project.web.Starter             : Starting Starter using Java 21.0.1 on riskop-ThinkStation-P340 with PID 2031910 (/home/riskop/IdeaProjects/confighiba2/web/main-war/target/classes started by riskop in /home/riskop/IdeaProjects/confighiba2/web/main-war)
2025-08-29 17:16:38.877  INFO 2031910 --- [           main] hu.risko.project.web.Starter             : No active profile set, falling back to 1 default profile: "default"
2025-08-29 17:16:39.236  INFO 2031910 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2025-08-29 17:16:39.241  INFO 2031910 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-29 17:16:39.241  INFO 2031910 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.83]
2025-08-29 17:16:39.280  INFO 2031910 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-29 17:16:39.280  INFO 2031910 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 382 ms
2025-08-29 17:16:39.305  WARN 2031910 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'someClass': Unsatisfied dependency expressed through field 'modelMapper'; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'org.modelmapper.ModelMapper' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Qualifier("commonMapper"), @org.springframework.beans.factory.annotation.Autowired(required=true)}
2025-08-29 17:16:39.306  INFO 2031910 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-08-29 17:16:39.311  INFO 2031910 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
getModelMapper AAAAAAAAAAAA
2025-08-29 17:16:39.333 ERROR 2031910 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Field modelMapper in hu.risko.util.SomeClass required a bean of type 'org.modelmapper.ModelMapper' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Qualifier("commonMapper")
	- @org.springframework.beans.factory.annotation.Autowired(required=true)

The following candidates were found but could not be injected:
	- User-defined bean method 'getModelMapper' in 'AaConfig'


Action:

Consider revisiting the entries above or defining a bean of type 'org.modelmapper.ModelMapper' in your configuration.

