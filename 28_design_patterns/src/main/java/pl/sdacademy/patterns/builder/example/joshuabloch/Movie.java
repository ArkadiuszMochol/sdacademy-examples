package pl.sdacademy.patterns.builder.example.joshuabloch;

public class Movie {

	private String title;
	private String director;

	private Movie(String title, String director) {
		this.title = title;
		this.director = director;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static class Builder {
		private String title;
		private String director;

		public Builder withTitle(String title) {
			this.title = title;
			return this;
		}

		public Builder withDirector(String director) {
			this.director = director;
			return this;
		}

		public Movie build() {
			return new Movie(title, director);
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
				'}';
	}

	public static void main(String[] args) {
		Movie titanic = Movie.builder()
				.withDirector("James Cameron")
				.withTitle("Titanic")
				.build();
		System.out.println(titanic);
	}
}
