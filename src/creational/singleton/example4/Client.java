package creational.singleton.example4;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Client {

	public static void main(String[] args) {

		System.out.println("Enter your selection (detailed or mini): ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String selection = null;

		try {
			selection = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		StatementFactory statementFactory = StatementFactory.getStatementFactory();
		StatementType statementType = statementFactory.createStatements(selection);
		System.out.println(statementType.print() + " Returned");
		
	}

}
