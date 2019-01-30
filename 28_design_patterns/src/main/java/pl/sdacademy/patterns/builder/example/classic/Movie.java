package pl.sdacademy.patterns.builder.example.classic;

class Movie {
    private String title;
    private String director;

    public Movie() {
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(final String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie [title = " + title + ", director = " + director + "]";
    }
}
