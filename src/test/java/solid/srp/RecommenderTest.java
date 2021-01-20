package solid.srp;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RecommenderTest {

    @Test
    void ReturnsRecommendedMoviesNotYetSeenByTheClient() {
        Recommender recommender = new Recommender();
        Client client = new Client("John", BBDD.ET);

        List<Movie> recommendedMovies = recommender.getListOfRecommendedMoviesByDirector(client);

        assertThat(BBDD.ET).isNotIn(recommendedMovies);
    }

}