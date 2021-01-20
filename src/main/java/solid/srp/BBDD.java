package solid.srp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BBDD {
    private static final String GENRE_FANTASY = "Fantasy";
    private static final String GENRE_WAR = "War";

    public static final String DIRECTOR_SPIELBERG = "Spielberg";

    public static final Movie ET = new Movie("ET", GENRE_FANTASY, DIRECTOR_SPIELBERG);
    public static final Movie SAVING_RYAN = new Movie("Saving Private Ryan", GENRE_WAR, DIRECTOR_SPIELBERG);

    public static final Movie [] ALL = { ET, SAVING_RYAN };

    public static Map<String, List<Movie>> MOVIES_BY_DIRECTOR = Arrays.stream(ALL)
            .collect(Collectors.groupingBy(Movie::getDirector));
}
