package solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class ExporterCSV {
    public static String export(List<Movie> recommendedMovies) {
        return recommendedMovies.stream()
                .map(movie -> (movie.getTitle() + "," + movie.getGenre() + "," + movie.getDirector()))
                .collect(Collectors.joining("\n"));
    }
}