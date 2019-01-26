package pl.sdacademy.tdd.filmservice;

import java.util.ArrayList;
import java.util.List;

public class FilmRatingService {

	private ExternalFilmwebService externalFilmwebService;

	public FilmRatingService(ExternalFilmwebService externalFilmwebService) {
		this.externalFilmwebService = externalFilmwebService;
	}

	public double getRatingForFilmType(String type) {
		List<Film> filmsForGivenType = externalFilmwebService.getFilmsOfType(type);
		return getRatingForFilms(filmsForGivenType);
	}

	public double getRatingForDirector(String director) {
		List<Film> filmsForGivenDirector = externalFilmwebService.getFilmsForDirector(director);
		return getRatingForFilms(filmsForGivenDirector);
	}

	private double getRatingForFilms(List<Film> films) {
		List<Double> ratings = new ArrayList<>();
		for (Film film : films) {
			ratings.add(film.getRating());
		}
		double average = 0.0d;
		for (Double rating : ratings) {
			average += rating;
		}
		return average / ratings.size();
	}

}
