package pl.sdacademy.patterns.builder.example.classic;

public class CarBuildDirector {
    private MovieBuilder builder;

    public CarBuildDirector(final MovieBuilder builder) {
        this.builder = builder;
    }

    public Movie construct() {
        return builder.setDirector("James Cameron")
                .setTitle("Titanic")
                .build();
    }

    public static void main(final String[] arguments) {
        final MovieBuilder builder = new MovieBuilderImpl();

        final CarBuildDirector carBuildDirector = new CarBuildDirector(builder);

        System.out.println(carBuildDirector.construct());
    }
}
