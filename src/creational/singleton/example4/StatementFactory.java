package creational.singleton.example4;

public class StatementFactory {

	private static StatementFactory statementFactory;

	private StatementFactory() {

	}

	public static StatementFactory getStatementFactory() {

		if (statementFactory == null) {
			statementFactory = new StatementFactory();
		}

		return statementFactory;

	}

	public static StatementType createStatements(String name) {

		if (name.equalsIgnoreCase("detailed")) {
			return new DetailedStatement();
		} else if (name.equalsIgnoreCase("mini")) {
			return new MiniStatement();
		}

		throw new IllegalArgumentException("There is no such statement type.");

	}

}
