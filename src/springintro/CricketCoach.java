package springintro;

public class CricketCoach implements Coach {

	private FortuneService _fortuneService;
	
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor!");
	}
	
	
	
	public void set_fortuneService(FortuneService _fortuneService) {
		System.out.println("CricketCoach: inside setter method - set_fortuneService");
		this._fortuneService = _fortuneService;
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
