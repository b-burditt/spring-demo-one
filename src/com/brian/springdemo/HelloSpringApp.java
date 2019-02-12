package com.brian.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp 
{
	public static void main(String[] args) 
	{
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		/*
		 *********   Coach with fortune constructor ******
		 */
		//retrieve a bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//output to track where we are
		System.out.println("Creating theCoach with fortune constructor.");
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		/*
		 *********   Coach with fortune setter ******
		 */
		System.out.println("\nCreating theNoArgCoach with default constructor and injected setter.");
		
		//retrieve bean from spring container
		CricketCoach noArgCoach = context.getBean("myNoArgCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(noArgCoach.getDailyWorkout());
		System.out.println(noArgCoach.getDailyFortune());
		System.out.println("Team name: " + noArgCoach.getTeam());
		System.out.println("Email Address: " + noArgCoach.getEmailAddress());
		
		//close the context
		context.close();
	}
}
