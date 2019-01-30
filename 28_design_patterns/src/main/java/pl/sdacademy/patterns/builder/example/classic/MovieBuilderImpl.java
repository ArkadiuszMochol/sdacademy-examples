package pl.sdacademy.patterns.builder.example.classic;

class MovieBuilderImpl implements MovieBuilder {
    private Movie movieTmp;

    public MovieBuilderImpl() {
        movieTmp = new Movie();
    }

    @Override
    public Movie build() {
        Movie movie = new Movie();
        movie.setTitle(movieTmp.getTitle());
        movie.setDirector(movieTmp.getDirector());
        return movie;
    }

    @Override
    public MovieBuilder setTitle(final String title) {
        movieTmp.setTitle(title);
        return this;
    }

    @Override
    public MovieBuilder setDirector(final String director) {
        movieTmp.setDirector(director);
        return this;
    }
}