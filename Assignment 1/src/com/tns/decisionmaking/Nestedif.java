package com.tns.decisionmaking;

public class Nestedif {

	public static void main(String[] args) {
		   int age=15, weight=55;
		   if(weight>=12)
		   {
			   if(weight>=40) 
			   {
			   if(weight<=110) 
			   {
				   System.out.println("Eligible for bungee jumping");
			   }
		   
			   else
			   {
				   System.out.println("Eligible for bungee jumping");
			   }
		   }
			   else 
			   {
				   System.out.println("Extra ropes will be added");
			   }
			}
			   else
			   {
				   System.out.println("Not eligible for bungee jumping");
			   }
	}
		
	}


