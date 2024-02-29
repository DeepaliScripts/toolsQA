package interview;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import edureka.formyapp;
import edureka.interview;
//fizzbuzz challenge
public class demo {

	public static void main(String[] args) {
		
		
		for (int num = 1; num <= 10; num++) {
		    if (num % 5 == 0 && num % 3 == 0) {
		        System.out.println("FizzBuzz");
		    } else if (num % 5 == 0) {
		        System.out.println("Buzz");
		    } else if (num % 3 == 0) {
		        System.out.println("Fizz");
		    } else {
		        System.out.println(num);
		    }
		}


	}}
