package module3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Account acc = context.getBean("account",Account.class);
		
		System.out.println("Account No:" + acc.getAccNO());
		System.out.println("Account Holder Name : " + acc.getAccName() );
		
	}

}
