package com.g4ab2.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ConstructionManager {
	private int days;
	Map<Integer, String> dayFloorsMap = new HashMap<Integer, String>();
	
	public void addFloor() {
		Scanner in = new Scanner(System.in);
		int size = days;
		int day =1;
		PriorityQueue<Integer> floors = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		while(day<=days) {
		System.out.println("enter the floor size given on day : "+ day);
		int floor = in.nextInt();
		floors.add(floor);
		if(floor==size) {
			
			List<Integer> floorsToBeAdded = new ArrayList<>();
			for(int i=floor;i>0; i--) {
				if(!floors.isEmpty() &&floors.peek()==i) {
					floorsToBeAdded.add(	floors.poll());
					size--;	}
				else {break;}
				}
			dayFloorsMap.put(day, floorsToBeAdded.stream().
					map(s -> String.valueOf(s)).collect(Collectors.joining(" ")));
			    
			}else {
				dayFloorsMap.put(day, "");}
		day++;
		
			
		}in.close();
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	public void printSchedule() {
		System.out.println("The order of construction is as follows");
		for(Entry<Integer, String> e : dayFloorsMap.entrySet()) {
			System.out.println("Day: "+ e.getKey());
			System.out.println(e.getValue());
			
		}
	}

}
