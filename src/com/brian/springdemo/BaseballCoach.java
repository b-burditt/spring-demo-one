package com.brian.springdemo;

public class BaseballCoach extends Coach
{
	//no arg constructor
	public BaseballCoach()
	{
		System.out.println("Coach: inside no-arg constructor.");
	}
	//constructor with fortuneService
	public BaseballCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on batting practice.";
	}

	@Override
	public String getDailyFortune() 
	{
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
