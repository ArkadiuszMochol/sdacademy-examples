package pl.sdacademy.tdd.learning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.naming.NoPermissionException;

import static org.assertj.core.api.Assertions.*;


class ExternalLibraryTest {

	@Test
	@DisplayName("should retrieve usefull data if requested permissions are for admin")
	void getDataForAdmin() throws Exception {

		//given
		ExternalLibrary instance = new ExternalLibrary();

		//when
		String data = instance.getData(ExternalPermission.ADMIN);

		//then
		assertThat(data).isNotBlank();
	}

	@Test
	@DisplayName("should retrieve null if requested permissions are for author")
	void getDataForAuthor() throws Exception {

		//given
		ExternalLibrary instance = new ExternalLibrary();

		//when
		String data = instance.getData(ExternalPermission.AUTHOR);

		//then
		assertThat(data).isNull();
	}

	@Test
	@DisplayName("should throw exception if user asks for data")
	void getData() {

		//given
		ExternalLibrary instance = new ExternalLibrary();

		//when
		Throwable thrown = catchThrowable(() -> instance.getData(ExternalPermission.USER));

		//then
		assertThat(thrown).isInstanceOf(NoPermissionException.class)
			.hasNoCause()
		    .hasMessageContaining("User is not permitted");
	}
}