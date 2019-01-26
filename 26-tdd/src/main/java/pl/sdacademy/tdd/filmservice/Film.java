package pl.sdacademy.tdd.filmservice;

public class Film {

	private String title;
	private String director;
	private String type;
	private double rating;

	public Film(String title, String director, String type, double rating) {
		this.title = title;
		this.director = director;
		this.type = type;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	public String getType() {
		return type;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Film{" + "title='" + title + '\'' + ", director='" + director + '\'' + ", type='" + type + '\'' + ", rating=" + rating + '}';
	}
}
