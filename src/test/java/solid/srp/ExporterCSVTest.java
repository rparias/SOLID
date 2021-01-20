package solid.srp;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class ExporterCSVTest {

    @Test
    public void exportRecomendedMoviesCSVFormatTest(){
        Recommender recommender = new Recommender();
        Client client = new Client("John", BBDD.ET);
        ExporterCSV exporterCSV = new ExporterCSV(recommender);

        String expectedCSV = "Saving Private Ryan,War,Spielberg";

        assertThat(exporterCSV.export(client)).isEqualTo(expectedCSV);
    }
}
