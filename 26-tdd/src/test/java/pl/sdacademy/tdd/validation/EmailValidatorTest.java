package pl.sdacademy.tdd.validation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

	@ParameterizedTest(name = "expecting email is valid: {1} when given email is {0}")
	@CsvSource(delimiter = ';', value = {
		"ala@example.com; true",
		"ala.ala.example.com; false",
		"ala@example; false",
		"ala@example.pl; true",
		"ala@example.s; false",
		"ala@example.it; true",
		"ala@example.itsf; false",
	})
	void emailContainsAtCharacter(String email, boolean isValid) {
		//given
		EmailValidator emailValidator = new EmailValidator();

		//when
		boolean isValidEmailValid = emailValidator.isValidEmailAddress(email);

		//then
		assertThat(isValidEmailValid).isEqualTo(isValid);
	}

}