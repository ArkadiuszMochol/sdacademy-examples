package pl.sdacademy.tdd.filmservice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class FilmRatingServiceTest {

	@Test
	void getRatingForFilmType() {
		//given
		List<Film> fakeFilms = Arrays.asList(
			new Film("Titanic", "Cameron", "romantic", 4.5d),
			new Film("LaLaLand", null, "romantic", 5.0d),
			new Film("Jurrasic Park", "Cameron", "romantic", 4.0d)
		);
		ExternalFilmwebService mockFilmwebService = mock(ExternalFilmwebService.class);
		when(mockFilmwebService.getFilmsOfType("romantic")).thenReturn(fakeFilms);
		FilmRatingService filmRatingService = new FilmRatingService(mockFilmwebService);

		//when
		Double averageRating = filmRatingService.getRatingForFilmType("romantic");

		//then
		verify(mockFilmwebService).getFilmsOfType("romantic");
		assertThat(averageRating).isBetween(4.4d, 4.6);
	}

	@Test
	void getRatingForDirector() {
		//given
		List<Film> fakeFilms = Arrays.asList(
			new Film("Titanic", "Cameron", "romantic", 4.5d),
			new Film("LaLaLand", "Cameron", "romantic", 5.0d),
			new Film("Jurrasic Park", "Cameron", "romantic", 4.0d)
		);
		ExternalFilmwebService mockFilmwebService = mock(ExternalFilmwebService.class);
		when(mockFilmwebService.getFilmsForDirector("Cameron")).thenReturn(fakeFilms);
		FilmRatingService filmRatingService = new FilmRatingService(mockFilmwebService);

		//when
		Double averageRating = filmRatingService.getRatingForDirector("Cameron");

		//then
		verify(mockFilmwebService).getFilmsForDirector("Cameron");
		assertThat(averageRating).isBetween(4.4d, 4.6);
	}
}