package com.brian.springdemo;

public class TrackCoach implements Coach 
{
	private FortuneService fortuneService;
	private String team;
	private String emailAddress;
	
	//default constructor, right now it's just a temporary fix
	public TrackCoach()
	{
		System.out.println("TrackCoach: inside no-arg constructor.");
	}
	
	public TrackCoach(FortuneService fortuneService) 
	{
		this.fortuneService = fortuneService;
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
	
	public void setFortuneService(FortuneService service)
	{
		System.out.println("TrackCoach: inside setter method - setFortuneService");
		fortuneService = service;
	}
	public void setEmailAddress(String address)
	{
		System.out.println("TrackCoach: inside setter method - setEmailAddress");
		emailAddress = address;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setTeam(String teamName)
	{
		System.out.println("TrackCoach: inside setter method - setTeam");
		team = teamName;
	}
	public String getTeam()
	{
		return team;
	}
}
