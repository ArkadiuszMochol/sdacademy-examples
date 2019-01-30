package pl.sdacademy.patterns.builder.example.classic;

interface MovieBuilder {
    Movie build();

    MovieBuilder setTitle(final String color);

    MovieBuilder setDirector(final String wheels);
}
