package org.utils;

import java.util.Random;

public class RandomNumberGeneration {
	
	static Random rand;
	static int number;
	
	public static int generateRandomNumber() {
	
	rand = new Random();
	number = rand.nextInt(50000);
	return number;

}
}