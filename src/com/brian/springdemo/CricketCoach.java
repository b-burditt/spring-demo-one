package com.brian.springdemo;

public class CricketCoach implements Coach 
{
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	public CricketCoach()
	{
		System.out.println("CricketCoach: inside no-arg constructor.");
	}
	
	public CricketCoach(FortuneService myFortuneService)
	{
		fortuneService = myFortuneService;
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

	public void setFortuneService(FortuneService service)
	{
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		fortuneService = service;
	}
	public void setEmailAddress(String address)
	{
		System.out.println("CricketCoach: inside setter method - setEmailAddress");
		emailAddress = address;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setTeam(String teamName)
	{
		System.out.println("CricketCoach: inside setter method - setTeam");
		team = teamName;
	}
	public String getTeam()
	{
		return team;
	}
	
}
