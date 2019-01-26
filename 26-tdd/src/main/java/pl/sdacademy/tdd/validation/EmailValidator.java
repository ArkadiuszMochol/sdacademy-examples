package pl.sdacademy.tdd.validation;

public class EmailValidator {

	private static final String AT_CHARACTER = "@";

	public boolean isValidEmailAddress(String email) {

		boolean containsAt = email.contains(AT_CHARACTER);

		if (!containsAt) {
			return false;
		}

		String[] splitted = email.split("\\.");

		boolean hasDomain = splitted.length >= 2;

		if (!hasDomain) {
			return false;
		}

		String domain = splitted[splitted.length - 1];
		boolean isProperDomain = domain.length() >= 2 && domain.length() <= 3;
		if (!isProperDomain) {
			return false;
		}

		return true;
	}

}
