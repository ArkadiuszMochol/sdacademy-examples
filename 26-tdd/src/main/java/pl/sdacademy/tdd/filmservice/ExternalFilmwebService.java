package pl.sdacademy.tdd.filmservice;

import java.util.List;

public interface ExternalFilmwebService {
	List<Film> getFilmsOfType(String type);
	List<Film> getFilmsForDirector(String director);
}
