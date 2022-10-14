package springintro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context= new 	ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCoach=context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//theCoach.setEmailAddress("gookk@sdawk.com");
		//theCoach.setTeam("slşexawle");
		
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		context.close();
	}

}
