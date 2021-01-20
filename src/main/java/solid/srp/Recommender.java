package solid.srp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Recommender {
    public List<Movie> getListOfRecommendedMoviesByDirector(Client client) {
        List<Movie> recommendedMovies = new ArrayList<>();

        for (Movie favorite: client.getFavorites()) {
            recommendedMovies.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.getDirector()));
        }
        recommendedMovies.removeAll(client.getFavorites());

        return recommendedMovies;
    }
}