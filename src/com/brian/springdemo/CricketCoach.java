package com.brian.springdemo;

public class CricketCoach extends Coach
{
	//no arg constructor
	public CricketCoach()
	{
		System.out.println("Coach: inside no-arg constructor.");
	}
	//constructor with fortuneService
	public CricketCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() 
	{
		return "Practice fast bowling for 15 minutes";
	}
	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}	
}
