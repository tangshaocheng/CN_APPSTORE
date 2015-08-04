import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.TUserAppInfo;
import com.service.UserServiceI;

public class TestCache {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml",
						"classpath:applicationContext-mvc.xml",
						"classpath:spring-cache.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		System.out.println("first query...");
		userService.findByName("somebody");
		System.out.print("second query...");
		userService.findByName("somebody");
		System.out.println();

	}

	@Test
	public void Test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml",
						"classpath:applicationContext-mvc.xml",
						"classpath:spring-cache.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		TUserAppInfo user1 = userService.findByName("somebody1");
		System.out.println(user1.toString());
		TUserAppInfo user2 = userService.findByName("somebody2");
		System.out.println(user2.toString());

		user2.setId(1);
		userService.updateUser(user2);

		user1 = userService.findByName("somebody1");
		System.out.println(user1.toString());
		user2 = userService.findByName("somebody2");
		System.out.println(user2.toString());
	}

	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml",
						"classpath:applicationContext-mvc.xml",
						"classpath:spring-cache.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		userService.reload();
		System.out.println("first query...");
		userService.findByName("somebody1");
		userService.findByName("somebody2");
		System.out.println("second query...");
		userService.findByName("somebody1");
		userService.findByName("somebody2");
	}
}
