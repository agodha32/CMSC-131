package switchExamples;

import java.util.Scanner;

public class CarWash {

	/* Car wash types (symbolic constants) */
	public static final int XTREME = 3;
	public static final int PREMIUM = 2;
	public static final int STANDARD = 1;
	
	public static void carWash(int washType) {
		switch(washType) {
		case XTREME:
			System.out.println("Rain-X protectant");
			System.out.println("Tire shine");
		case PREMIUM:
			System.out.println("Hub Scrub");
			System.out.println("Xtreme presoak");
			System.out.println("Tri-foam conditioner");
			System.out.println("Rocker panel blaster");
		case STANDARD:
			System.out.println("Underbody flush");
			System.out.println("Clear coat protectant");
			System.out.println("Spot free rinse");
			System.out.println("Hot presoak bath");
			System.out.println("Turbo wash and rinse");
			System.out.println("Dryer");
			break;
		default:
			throw new IllegalArgumentException("Unknown Wash Type");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What kind of wash do you want?");
		System.out.println("1 -- Standard");
		System.out.println("2 -- Premium");
		System.out.println("3 -- Extreme");
		System.out.print("Your choice: ");
		int choice = scanner.nextInt();
		System.out.println();
		carWash(choice);
		scanner.close();
	}

}
