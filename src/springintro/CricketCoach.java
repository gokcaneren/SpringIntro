package springintro;

public class CricketCoach implements Coach {

	private FortuneService _fortuneService;
	
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor!");
	}
	
	
	
	public void set_fortuneService(FortuneService _fortuneService) {
		System.out.println("CricketCoach: inside setter method - set_fortuneService");
		this._fortuneService = _fortuneService;
	}


	
	

	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return _fortuneService.getFortune();
	}

}
