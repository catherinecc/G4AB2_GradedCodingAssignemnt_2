package com.g4ab2.drivers;

import java.util.Scanner;

import com.g4ab2.service.ConstructionManager;

public class ConstructionDriver {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the total no of floors in the building");
	int size = in.nextInt();
	in.close();
	ConstructionManager manager = new ConstructionManager();
	manager.setDays(size);
	manager.addFloor();
	manager.printSchedule();
}
}
