import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.TUserAppInfo;
import com.service.UserServiceI;

public class TestHibernate {
	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				new String[] { "classpath:spring.xml",
						"classpath:spring-hibernate.xml",
						"classpath:applicationContext-mvc.xml" });
		UserServiceI userService = (UserServiceI) ac.getBean("userService");
		TUserAppInfo u = new TUserAppInfo();
		u.setAppName("sdff");
		u.setMac("nihao ");
		userService.addUser(u);
	}
}
