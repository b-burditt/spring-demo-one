package com.brian.springdemo;

public class DodgeballCoach implements Coach 
{
	@Override
	public String getDailyWorkout() 
	{
		return "Hit everyone in the face with balls.";
	}

	@Override
	public String getDailyFortune() 
	{
		return null;
	}

}
