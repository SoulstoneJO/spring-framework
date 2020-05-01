package SpringCoreTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.jorakuten.SimpleBean;

public class ContextTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();
		context.close();
	}

}
