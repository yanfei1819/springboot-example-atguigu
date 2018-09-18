### 一、springboot配置文件值的注入

- @ConfigurationProperties(prefix = "xxx")

  实例代码：

  ```java
  @Component
  @ConfigurationProperties(prefix = "person")
  @Validated
  public class Person {
      @Email(message = "邮箱格式错误")
      private String email;
      private String name;
      private Integer age;
      private Date birthday;
  	// get/set/toString省略
  }
  
  ```

  ```yaml
  person:
    name: xxx
    age: 27
    birthday: 1991/09/01
    email: yanfei@163.com
  
  ```

  ```java
  @RunWith(SpringRunner.class)
  @SpringBootTest
  public class ExampleApplicationTests {
      @Autowired
      private Person person;
      @Test
      public void testConfigurationProperties() {
          System.out.println(person);
      }
  }
  
  ```

- @Value

  ```java
  @Component
  public class Person {
      private String email;
   	@Value("${person.name}")
      private String name;
      private Integer age;
      private Date birthday;
  	// get/set/toString省略
  }
  ```


- @Value获取值和@ConfigurationProperties获取值比较

  |                      | @ConfigurationProperties | @Value     |
  | -------------------- | ------------------------ | :--------- |
  | 功能                 | 批量注入配置文件中的属性 | 一个个指定 |
  | 松散绑定（松散语法） | 支持                     | 不支持     |
  | SpEL                 | 不支持                   | 支持       |
  | JSR303数据校验       | 支持                     | 不支持     |
  | 复杂类型封装         | 支持                     | 不支持     |


### 二、yaml配置文件中各类型值得写法

```yaml
person:
  name: xxx
  age: 27
  birthday: 1991/09/01
  email: xxx@163.com
  # list写法
  books:
    - math
    - english
  #map
  map: {v1: k1,v2: k2}
  #object1
  friends: {name: Tom,age: 12}
  #object2
#  friends:
#    name: Job
#    age: 12

```



###三、从自定义配置文件中读取配置信息

- @PropertySource

  ```java
  @PropertySource(value = "classpath:common/application-dev.properties")
  ```

  > 注意：默认从全局配置文件中获取值


-  @ImportResource(locations = {"classpath:beans.xml"})：导入Spring的配置文件，让配置文件里面的内容生效

  但是这种方式不常用，推荐使用全注解的方式。



### 四、配置文件占位符

如果没有，可以指定默认值































