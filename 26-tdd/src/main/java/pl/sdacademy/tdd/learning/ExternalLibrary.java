package pl.sdacademy.tdd.learning;

import javax.naming.NoPermissionException;

public class ExternalLibrary {

	private static final String SOME_USEFUL_DATA = "This is very important data";

	public String getData(ExternalPermission permission) throws NoPermissionException {
		String data = null;
		if (permission == ExternalPermission.ADMIN) {
			data = SOME_USEFUL_DATA;
		} else if (permission == ExternalPermission.USER) {
			throw new NoPermissionException("User is not permitted to get the data");
		}

		return data;
	}
}
