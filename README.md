# SoftUni Java Web
![spring-logo](spring.png)

Main components:
- `Spring Boot Starters`
- `Spring Boot Auto-Configuration`
- `Spring Boot Actuator`
- `Spring Data`

## Projects
[Online Dog Store - Puppies Passion](https://github.com/DenisBuserski/db-puppies-passion) <br>
[SoftUni Java Web - Mobilebg](https://github.com/DenisBuserski/sjw-mobilebg) <br>
[SoftUni Java Web - Pathfinder](https://github.com/DenisBuserski/sjw-pathfinder) <br>
[SoftUni Java Web - Supermarket](https://github.com/DenisBuserski/sjw-supermarket) <br>

<details> 
<summary><h2>Notes</h2></summary>

`Spring IoC container` - Responsible for managing all the beans?
`Spring bean` - An instance of a class managed by the Spring container. <br>

### Spring Annotations
`@Bean` - Applies on Method level. <br>
`@Autowired` - 
- `@Qualifier` - <br>
- `@Primary` - <br>

`@Component` - Applies on Class level.
- `@Controller` - 
- `@RestController` - 
- `@Service` - 
- `@Repository` - <br>

- `@SpringBootApplication` - Combines `@Configuration`, `@EnableAutoConfiguration` and `@ComponentScan`
- `@Configuration` -
- `EnableAutoConfiguration` -
- `@ComponentScan` - Detect and register Spring-managed components(`@Component`, `@Repository`, `@Controller`, `@Service`, `@Configuration`, `@RestController`)
with application context. `@ComponentScan` without arguments tells Spring to scan the current package and all of its sub-packages.

@ResponseBody
@PathVariable
@RequestParam
@CrossOrigin
@Value
@ConfigurationProperties
@PropertySource
@Profile
@Conditional
@Schedules
@SpringBootTest
@DataJpaTest
@WebMvsTest
@JsonTest
@WebFluxTest

</details> 


<details>
<summary><h2>Learning materials</h2></summary>

### SoftUni course
[Java Web - май 2022](https://softuni.bg/modules/120/java-web/1343) <br>

### Blogs
- [Spring Boot Folder Structure (Best Practices)](https://malshani-wijekoon.medium.com/spring-boot-folder-structure-best-practices-18ef78a81819)
- [Setup Spring Boot 5.x.x Application Using Java 11.0](https://malshani-wijekoon.medium.com/setup-spring-boot-5-x-x-application-using-java-11-0-bb1ebc836996)


### Videos 

#### Spring
- [What Is Spring?](https://www.youtube.com/watch?v=Spzug_SjJnM)
- [What is Spring Framework?](https://www.youtube.com/watch?v=Zxwq3aW9ctU&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=4)
- [What is the Spring framework really all about?](https://www.youtube.com/watch?v=gq4S-ovWVlM&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3)
- [What is Spring-Boot Framework? (explained from scratch)](https://www.youtube.com/watch?v=LSEYdU8Dp9Y&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3)
- [Spring Framework Tutorial | Full Course](https://www.youtube.com/watch?v=If1Lw4pLLEo&list=WL)
- [Spring ultimate basics: What are Spring Beans and what is the Spring Container?](https://www.youtube.com/watch?v=aS9SQITRocc)
- [Spring Beans Showdown: Unraveling the Mystery of @Component vs @Bean!](https://www.youtube.com/watch?v=CWEQ-1vff1o&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=9)
- [Difference between @component & @bean annotations in Spring boot | Interview Question](https://www.youtube.com/watch?v=iE5oQ-FKiJA&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=9)
- [@Component vs @Bean Annotations](https://www.youtube.com/watch?v=iCaNXPi4tKw&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=10)
- [Difference between @Component vs @Bean in Spring Boot | Interview Questions ‪@JavaExpress‬](https://www.youtube.com/watch?v=QNP3fS6PJZY&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=11)
- [Difference between @component & @bean annotations in Spring boot | Interview Question | Code Decode](https://www.youtube.com/watch?v=6X_Xx0CyCqE&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=9)
- [Difference between @Bean and @Component annotation in Spring | @Component vs @ Bean Annotations](https://www.youtube.com/watch?v=sHpaT8O_-Ls&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=10&t=5s)
- [Java Bean vs POJO vs Spring Bean | Are you confused too ?](https://www.youtube.com/watch?v=lQ3svlKjs70&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=11&t=313s)
- [Spring Boot Roadmap - How To Master Spring Boot](https://www.youtube.com/watch?v=cehTm_oSrqA&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3)
- [How Spring Boot works internally.](https://www.youtube.com/watch?v=2K9ZtPL5r6A)
- [Spring Boot Tutorial | Full Course [2023] [NEW]](https://www.youtube.com/watch?v=9SGDpanrc8U&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=4)
- [How to load initial database data in Spring Boot](https://www.youtube.com/watch?v=VFaed0-Eww8&t=29s)
- [Java Spring Boot - JPA - Hibernate - H2 - Database Initialization using data.sql and schema.sql](https://www.youtube.com/watch?v=9Yj2TCvrvaE&t=197s)
- [Spring Boot Tutorial 28 - Using data sql to Initialize the Database](https://www.youtube.com/watch?v=VHIHPIwIsg8&t=196s)
- [Spring Boot Validation](https://www.youtube.com/watch?v=LItERTUC9y4)
- [JDBC vs JPA: Pros and Cons](https://www.youtube.com/watch?v=XuLUnTlAWmw)
- [JAVA DTO Pattern Tutorial | Simplify Your Code](https://www.youtube.com/watch?v=5yquJa2x3Ko&list=PLN_xGGp_EzELR4R8-O6Bcub4Qss9yT1Cj&index=13&t=679s)
- [Demystifying Spring Session: A Comprehensive Introduction for Java Developers!](https://www.youtube.com/watch?v=k62bO-W6Sb0)

#### Session & Cookies
- [What cookies are and how they work!](https://www.youtube.com/watch?v=s04Vjlcgwco)
- [Session vs Token Authentication in 100 Seconds](https://www.youtube.com/watch?v=UBUNrFtufWo)
- [Difference between cookies, session and tokens](https://www.youtube.com/watch?v=GhrvZ5nUWNg&t=326s)
- [#10 Servlet and JSP Tutorial | HttpSession | Cookie](https://www.youtube.com/watch?v=5tLGwdyPGRY)
- [What You Need to Know About HTTP Protocol [Dev Concepts #39]](https://www.youtube.com/watch?v=TR_PjHKlXnE&list=WL&index=56)

#### MongoDB
- [Which Is Better? SQL vs NoSQL](https://www.youtube.com/watch?v=t0GlGbtMTio&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=2&t=3s)
- [MongoDB in 100 Seconds](https://www.youtube.com/watch?v=-bt_y4Loofg&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=4)
- [MySQL vs MongoDB](https://www.youtube.com/watch?v=OdgZ0jr4jpM&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3&t=27s)
- [MySql vs MongoDB, What's the Best Database Solution?](https://www.youtube.com/watch?v=0FNHbbuwKP0&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=4)
- [MongoDB vs MySQL | Difference Between MongoDB And MySQL | MySQL vs MongoDB Performance | Simplilearn](https://www.youtube.com/watch?v=CJy0_iUdr3g&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=5)

#### Liquibase
- [Why Liquibase](https://www.youtube.com/watch?v=FJ2a-WkuWRA&list=PLN_xGGp_EzEKD3ZqrxckWcxJV3tg5oNiA&index=2)
- [How Liquibase Works](https://www.youtube.com/watch?v=U9nVo9MS12o&list=PLN_xGGp_EzEKD3ZqrxckWcxJV3tg5oNiA&index=3)
- [Liquibase with SpringBoot | Step by step tutorial for Beginners - Full course](https://www.youtube.com/watch?v=xjXHecGOy84&list=PLN_xGGp_EzEKD3ZqrxckWcxJV3tg5oNiA&index=4)
- [Liquibase for the Really Impatient](https://www.youtube.com/watch?v=WXsQbeBYRN0&list=PLN_xGGp_EzEKD3ZqrxckWcxJV3tg5oNiA&index=5)

#### Others
- [You DON'T Need Lombok](https://www.youtube.com/watch?v=ldw5TwoPlXI&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3)
- [Spring boot & WebSockets: Build a Real-Time Chat App From Scratch](https://www.youtube.com/watch?v=TywlS9iAZCM&list=PLN_xGGp_EzEItK8yAKOP9qIetdu7CGxoP&index=3)

</details>