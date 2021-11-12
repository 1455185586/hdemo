# hdemo
Spring基础以及模板文件使用的练习；
Spring架构的工作流程：
（1）	客户端（用户）发出请求由Tomcat（服务器）接收，然后tomcat请求转交给DispatcherServlet（前端控制器）进行处理
（2）	DispatcherServlet匹配控制器中配置的映射路径，进行下一步处理
（3）	ViewResolver（视图解析器）将ModelAndView或者Exception解析成View。然后view会调用render（）方法，并根据ModelAndView中的数据渲染出页面

spring boot的自动配置通过@Enable Autoconfiguration来实现，具有非入侵性
@Deprecated  //用于修饰方法,表示此方法已经过时。
@RestController=@Response Body+@Controller
@Controller标记在类上，表示该类是Spring MVC的Controller对象

@Auto wired //表示被修饰的类需要注入对象。spring会扫描所有被@Auto wired标注的类，然后根据类型在Ion容器中找到匹配的类进行注入。

Get和POST的区别：
（1）	GET在浏览器中可以回退，而 POST 访问同一个地址时也是再次提交请求。GET请求会被浏览器主动缓存，而POST则不会。
（2）	GET中的参数会被完整地保留在浏览器历史记录里，而 POST中的参数则不会被保留。
（3）	GET只能进行URL编码，而 POST支持多种编码方式。
（4）	GET只接收ASCII字符,而POST没有限制。
（5）	·GET的安全性相比 POST低，因为参数直接暴露在URL上，所以不能用它传递敏感信息
（6）	·GET的参数是通过URL传递的，而POST 的参数是放在request body中的。但是，以上这些都不是绝对的，比如POST也可以通过URL路径提交参数。
MVC模式在请求达到最大的时候对新来的请求会拒绝服务，WebFlux会将新来的请求放到等待队列里面


在spring boot里面，配置文件Properties的优先级要高于yml文件
