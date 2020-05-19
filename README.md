# com.ppx.web_service

## 基于 Spring Boot 的安卓应用程序后台系统

### 更新内容
- 2020年5月19日：
  - 热门标签API(/paramTest?test=hotTag) 
    - 返回List\<String>
  - 推荐图书API(/paramTest?test=getBook) 
    - 返回List\<Book>
  - 登录API(/loginTest?name=XXX&password=XXX) 
    - 返回"Your ID is: XXX"
  - 注册API(/reg?name=XXX&password=XXX) 
    - 返回true/false
  - 获得所有标签API(/test) 
    - 返回List\<Tag>

### 目录功能

1. [dao](src/main/java/com/ppx/web_service/dao)包:

    **囊括了Hibernate映射到MySQL各个表的持久化操作接口**

    若新引入一个新的Entity要为其编写持久化方法，可以通过声明EntityDAO类来引入：

```java
public class EntityDAO extends BasicDAO<Entity> implements IBasicDAO<Entity> {}
```

继承BasicDAO后即可使该类获得Hibernate提供的基本增删改查功能

2. [entity](src/main/java/com/ppx/web_service/entity)包:

    **囊括了Hibernate映射到MySQL各个表（ORM模型）**

    要到 [hibernate.cfg.xml](src/main/resources/hibernate.cfg.xml) 配置文件中配置需要映射的类，加入：
```xml
<mapping class="com.ppx.web_service.entity.Entity"/>
```

    Entity类中要配置好Hibernate提供的注解，如：

```java
@Entity
@Table(name = "TableName")
public class Entity implements Serializable {

    //主键注解方法
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entity_id")
    private String id;

    //非主键注解方法
    @Columu(name = "entity_value")
    private String value;

    /*
        Getter and Setter here
    */

}
```

3. [servlet](src/main/java/com/ppx/web_service/servlet)包:

    **囊括了项目编写的各种接口，类似于Spring MVC中的Controller**

    编写的Servlet类都将继承java原生的HttpServlet类，重写doGet方法，并用注解标记@WebServlet。如：

```java
@WebServlet(name = "MyServlet", loadOnStartup = 1, urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {
    @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //用utf-8编码
        resp.setContentType("text/html;charset=UTF-8");
        //从请求中获得参数
        String param = req.getParameter("param");
        //获得响应的PrintWriter
        PrintWriter pw = resp.getWriter();
        //转为JSON格式写入
        pw.write(JSONArray.toJSONString(param));
        //冲厕所
        pw.flush();
        //设置Session
        req.setAttribute("param", param);
    }
}
```
