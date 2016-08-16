package com.BowlingPackage;

import java.util.Scanner;

public class Bowling {

	public static void main(String[] args) {
		int frame;
		int pinsKnockedDown;
		int score = 0;
		int pinsRemaining;
		int pins = 10;
		
		int[] frameNum = new int[11];
		
		String playerName = null;
		
		System.out.println("Welcome to Bowling!");
		System.out.println("Please enter your name.");
		Scanner sc = new Scanner(System.in);
		playerName = sc.nextLine();
				

		for (frame = 1; frame <= 10; frame++) {
			pinsKnockedDown = (int) (Math.random() * 11);
			score += pinsKnockedDown;
			pinsRemaining = pins - pinsKnockedDown;
			pinsKnockedDown = (int) (Math.random() * (pinsRemaining + 1));
			score += pinsKnockedDown;

			frameNum[frame - 1] = score;
			
			System.out.print("|" + frameNum[frame - 1]);
			
		}
		
		System.out.println("|\nFinal Score: " + playerName + " " + score);
		
	}}
