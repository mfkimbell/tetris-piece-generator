package Homework02;

import javax.swing.JFrame;

import java.awt.Color;
import java.util.Random;

public class TetrisViewer {
	public static void main(String[] args) {
		
		//initiating the random class
		Random random = new Random();
		
		//shape
		int randomShape = random.nextInt(7);
		System.out.println("Shape: "+randomShape);
		
		//color
		int ranR = random.nextInt(256);
		int ranG = random.nextInt(256);
		int ranB = random.nextInt(256);
		System.out.println("Color:"+ranR+" " + ranG + " " + ranB);
		
		//coordinates
		int ranX4 = random.nextInt(400);
		int ranX3 = random.nextInt(500);
		int ranX2 = random.nextInt(600);
		int ranX1 = random.nextInt(700);
		
		int ranY4 = random.nextInt(300);
		int ranY3 = random.nextInt(400);
		int ranY2 = random.nextInt(500);
		int ranY1 = random.nextInt(600);
		
		//orientation
		int randomOrientation = random.nextInt(4);
		System.out.println("Orientation: "+randomOrientation);
	
		

		JFrame frame = new JFrame();

		frame.setSize(800, 800); 

		frame.setTitle("CS 203 Lab 5"); 

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TetrisComponent s = new TetrisComponent();
		
		//this is a built in java method within this TetrisComponent Class
		Color randomC = new Color(ranR,ranG,ranB);
		
		s.randomXY(ranX4, ranX3, ranX2, ranX1, ranY4, ranY3, ranY2, ranY1);
		s.setTetromino(randomShape, randomC);
		s.pickRotation(randomOrientation);
		
		frame.add(s);

		frame.setVisible(true);
	}
}
