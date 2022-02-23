package com.javamultiplex.second;
import com.javamultiplex.first.*;
public class Second{
	public static void main(String[] args){
		System.out.println("Starting ....");
		First first=new First();
		System.out.println(first.getInfo());
		System.out.println(Second.class.getModule());
	}
}