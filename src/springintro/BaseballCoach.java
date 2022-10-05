package springintro;

public class BaseballCoach implements Coach {
	
	private FortuneService _fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		_fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return _fortuneService.getFortune();
	}
}
