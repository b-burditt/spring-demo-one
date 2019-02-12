package com.brian.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService 
{
	String[] fortunes = {"Riches are in your future.", "You will find love soon.", "The reaper comes for you."};
	Random rand;
	
	public RandomFortuneService()
	{
		rand = new Random();
	}
	
	@Override
	public String getFortune()
	{
		int randNum = rand.nextInt(3);
		return fortunes[randNum];
	}

}
