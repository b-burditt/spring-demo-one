package com.brian.springdemo;

public class Coach 
{
	protected FortuneService fortuneService;
	protected String emailAddress;
	protected String team;
	
	//no arg constructor
	public Coach()
	{
		System.out.println("Coach: inside no-arg constructor.");
	}
	//constructor with fortuneService
	public Coach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
	}
	public String getDailyWorkout()
	{
		return "Generic Workout.";
	}
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside startup method");
	}
	
	//destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("TrackCoach: inside destroy method.");
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
