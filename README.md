# amenity-reservation-system

An amenity reservation system where users/residents can log in and reserve a time to use a service such as fitness center, pool, or club house in an apartment complex. Each amenity will have a certain capacity (number of people that can use the service at the same time) so that people can make use of the amenities safely during the Covid-19 pandemic. 



Application path:http://localhost:8080/
login: user name : abhilashgd 
       password:12345
DB: h2DB path: http://localhost:8080/h2-console/
JDBC URL: jdbc:h2:mem:amenity-reservation-system
Application Testing : http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/user-controller/createUser


Application Sample Log:

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.4.4)

2021-11-30 12:06:51.920  INFO 21620 --- [  restartedMain] c.a.AmenityReservationSystemApplication  : Starting AmenityReservationSystemApplication using Java 17.0.1 on abhilashs-Air with PID 21620 (/Users/abhilashgd/Documents/workspace-spring-tool-suite-4-4.12.1.RELEASE/amenity-reservation-system/target/classes started by abhilashgd in /Users/abhilashgd/Documents/workspace-spring-tool-suite-4-4.12.1.RELEASE/amenity-reservation-system)
2021-11-30 12:06:51.924  INFO 21620 --- [  restartedMain] c.a.AmenityReservationSystemApplication  : No active profile set, falling back to default profiles: default
2021-11-30 12:06:52.017  INFO 21620 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2021-11-30 12:06:52.017  INFO 21620 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2021-11-30 12:06:53.706  INFO 21620 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2021-11-30 12:06:53.827  INFO 21620 --- [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 104 ms. Found 3 JPA repository interfaces.
2021-11-30 12:06:54.924  INFO 21620 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2021-11-30 12:06:54.944  INFO 21620 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2021-11-30 12:06:54.944  INFO 21620 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.44]
2021-11-30 12:06:55.142  INFO 21620 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2021-11-30 12:06:55.142  INFO 21620 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3124 ms
2021-11-30 12:06:55.212  INFO 21620 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2021-11-30 12:06:55.609  INFO 21620 --- [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2021-11-30 12:06:55.621  INFO 21620 --- [  restartedMain] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:amenity-reservation-system'
2021-11-30 12:06:55.891  INFO 21620 --- [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2021-11-30 12:06:56.068  INFO 21620 --- [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.29.Final
2021-11-30 12:06:56.415  INFO 21620 --- [  restartedMain] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2021-11-30 12:06:56.764  INFO 21620 --- [  restartedMain] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2021-11-30 12:06:58.347  INFO 21620 --- [  restartedMain] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2021-11-30 12:06:58.366  INFO 21620 --- [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2021-11-30 12:06:58.434  INFO 21620 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2021-11-30 12:06:59.623  INFO 21620 --- [  restartedMain] o.s.s.web.DefaultSecurityFilterChain     : Will secure Ant [pattern='/h2-console/**'] with []
2021-11-30 12:06:59.624  INFO 21620 --- [  restartedMain] o.s.s.web.DefaultSecurityFilterChain     : Will secure Ant [pattern='/h2/**'] with []
2021-11-30 12:06:59.624  INFO 21620 --- [  restartedMain] o.s.s.web.DefaultSecurityFilterChain     : Will secure Ant [pattern='/webjars/**'] with []
2021-11-30 12:06:59.679  INFO 21620 --- [  restartedMain] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@6e8ca81f, org.springframework.security.web.context.SecurityContextPersistenceFilter@5d47538a, org.springframework.security.web.header.HeaderWriterFilter@4b843f8a, org.springframework.security.web.csrf.CsrfFilter@44b00822, org.springframework.security.web.authentication.logout.LogoutFilter@4ad4c399, org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter@e15fa20, org.springframework.security.web.authentication.ui.DefaultLoginPageGeneratingFilter@611df947, org.springframework.security.web.authentication.ui.DefaultLogoutPageGeneratingFilter@7bf31ba, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@45d62d37, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@34d3449c, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@24c98df7, org.springframework.security.web.session.SessionManagementFilter@1b1bb16, org.springframework.security.web.access.ExceptionTranslationFilter@1426d460, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@259d1418]
2021-11-30 12:06:59.825  INFO 21620 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2021-11-30 12:07:00.096  INFO 21620 --- [  restartedMain] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2021-11-30 12:07:01.079  INFO 21620 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2021-11-30 12:07:01.099  INFO 21620 --- [  restartedMain] c.a.AmenityReservationSystemApplication  : Started AmenityReservationSystemApplication in 9.913 seconds (JVM running for 11.527)
2021-11-30 12:07:39.399  INFO 21620 --- [nio-8080-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2021-11-30 12:07:39.402  INFO 21620 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2021-11-30 12:07:39.433  INFO 21620 --- [nio-8080-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 31 ms



app created from learning Spring boot app tut:  Yigit Kemal Erinc SWE visa inc
