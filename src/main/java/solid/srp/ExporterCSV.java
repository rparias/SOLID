package solid.srp;

import java.util.stream.Collectors;

public class ExporterCSV {
    private Recommender recommender;
    public ExporterCSV(Recommender recommender){
        this.recommender = recommender;
    }
    public String export(Client client) {
        return recommender.getListOfRecommendedMoviesByDirector(client).stream()
                .map(movie -> (movie.getTitle() + "," + movie.getGenre() + "," + movie.getDirector()))
                .collect(Collectors.joining("\n"));
    }
}
