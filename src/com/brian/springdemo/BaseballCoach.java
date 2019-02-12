package com.brian.springdemo;

public class BaseballCoach implements Coach
{
	//define a private field for the dependency
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public BaseballCoach()
	{
		System.out.println("BaseballCoach: inside no-arg constructor.");
	}
	//define a constructor for dependency injection
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
	
	/*
	 * SETTERS AND GETTERS *
	 */
	public void setFortuneService(FortuneService service)
	{
		System.out.println("BaseballCoach: inside setter method - setFortuneService");
		fortuneService = service;
	}
	public void setEmailAddress(String address)
	{
		System.out.println("BaseballCoach: inside setter method - setEmailAddress");
		emailAddress = address;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setTeam(String teamName)
	{
		System.out.println("BaseballCoach: inside setter method - setTeam");
		team = teamName;
	}
	public String getTeam()
	{
		return team;
	}
}
