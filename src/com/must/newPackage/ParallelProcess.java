package com.must.newPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ParallelProcess {

	public void variableCannotInitialized() {

		int x;
		int y;
		final int initializationcompulsory = 0;

		System.out.println("hello");
		System.out.println("hello");

	}

	public static void main(String args[]) {

		long beforeUsedMem4 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		byte[] bytes = "Hello".getBytes();
		Path path = Paths.get("/Users/arjundas/Desktop/myfile1.bytes");
		try {
			Files.write(path, bytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + i);
			System.out.println("Hello" + i);

		}

	}
}