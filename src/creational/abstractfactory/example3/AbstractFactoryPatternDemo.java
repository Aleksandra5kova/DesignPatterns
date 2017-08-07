package creational.abstractfactory.example3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the OS (Windows or MAC):");
		String os = br.readLine();

		if (os.equalsIgnoreCase("windows")) {
			AbstractFactory msFactory = new MSWindowFactory();
			GUIBuilder.buildWindow(msFactory);
		}
		if (os.equalsIgnoreCase("MAC")) {
			AbstractFactory macFactory = new MacOSXFactory();
			GUIBuilder.buildWindow(macFactory);
		}

	}

}
