package com.greatLearning.iitr.dsa.labsession2;

//importing Scanner for taking user input
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception {

		// Scanner object
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array ");
		int size = sc.nextInt();
		int arr[] = new int[size];// array of total size

		System.out.println("Enter the Values of  array ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetNo = sc.nextInt();

		while (targetNo-- != 0) {
			int flag = 0;
			long target;

			System.out.println("Enter the value of target : ");
			target = sc.nextInt();

			// Code for finding if target is achievable or not
			long sum = 0;

			for (int i = 0; i < size; i++) {
				sum += arr[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");

					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved! ");
			}
			
		}
		sc.close();
	}
	
}
