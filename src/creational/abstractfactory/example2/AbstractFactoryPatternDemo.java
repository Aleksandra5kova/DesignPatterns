package creational.abstractfactory.example2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Which OS do you use, Windows or Mac?");
		String os = br.readLine();

		if (os.equalsIgnoreCase("windows")) {
			GUIFactory winFactory = new WinFactory();
			GUIRender.renderComponents(winFactory);
		}
		if (os.equalsIgnoreCase("mac")) {
			GUIFactory macFactory = new MacFactory();
			GUIRender.renderComponents(macFactory);
		}

	}

}
