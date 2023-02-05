package com.example.fizzbuzzkata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FizzBuzzDisplayer implements CommandLineRunner {

	@Override
	public void run(String... args) {
		boolean currentNumberIsMultiple3 = false;
		boolean currentNumberIsMultiple5 = false;
		StringBuilder builder = new StringBuilder();


		for (int i = 1; i <= 100; i++) {
			currentNumberIsMultiple3 = i % 3 == 0;
			currentNumberIsMultiple5 = i % 5 == 0;

			if (!currentNumberIsMultiple3 && !currentNumberIsMultiple5) {
				builder.append(i);
				displayAndClean(builder);
				continue;
			}

			if (currentNumberIsMultiple3)
				builder.append("Fizz");
			if (currentNumberIsMultiple5)
				builder.append("Buzz");

			displayAndClean(builder);
		}
	}

	private void displayAndClean(StringBuilder builder) {
		System.out.println(builder + "\n");
		builder.setLength(0);
	}

}
