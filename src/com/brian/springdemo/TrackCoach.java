package com.brian.springdemo;

public class TrackCoach extends Coach
{
	//no arg constructor
	public TrackCoach()
	{
		System.out.println("Coach: inside no-arg constructor.");
	}
	//constructor with fortuneService
	public TrackCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() 
	{
		return "Run forever!";
	}

	@Override
	public String getDailyFortune() 
	{
		return "Just do it: " + fortuneService.getFortune();
	}
}
