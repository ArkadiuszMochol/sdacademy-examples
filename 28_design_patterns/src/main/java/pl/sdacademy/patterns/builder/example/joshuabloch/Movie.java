package pl.sdacademy.patterns.builder.example.joshuabloch;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Movie {

	private String title;
	private String director;
	private LocalDate releaseDate;
	private List<String> actors;

	private Movie(String title, String director, LocalDate releaseDate, List<String> actors) {
		this.title = title;
		this.director = director;
		this.releaseDate = releaseDate;
		this.actors = actors;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String title;
		private String director;
		private LocalDate releaseDate;
		private List<String> actors;

		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder withDirector(String director) {
			this.director = director;
			return this;
		}

		public Builder withReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}

		public Builder withReleaseDate(String releaseDate) {
			this.releaseDate = LocalDate.parse(releaseDate);
			return this;
		}

		public Builder withActors(List<String> actors) {
			this.actors = actors;
			return this;
		}

		public Builder withActors(String... actors) {
			this.actors = Arrays.asList(actors);
			return this;
		}

		public Movie build() {
			return new Movie(title, director, releaseDate, actors);
		}
	}

	public String getTitle() {
		return title;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + title + '\'' +
				", director='" + director + '\'' +
				", releaseDate=" + releaseDate +
				", actors=" + actors +
				'}';
	}

	public static void main(String[] args) {
		Movie titanic = Movie.builder()
				.withDirector("James Cameron")
				.withTitle("Titanic")
				.build();
		System.out.println(titanic);

		Movie jurrasicPark = Movie.builder()
				.withTitle("Jurrasic Park")
				.withDirector("James Cameron")
				.withReleaseDate(LocalDate.now())
				.withActors(Arrays.asList())
				.build();
		System.out.println(jurrasicPark);

	}
}
