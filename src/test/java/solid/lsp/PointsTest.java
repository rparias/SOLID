package solid.lsp;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

public class PointsTest {
    @Test
    void pointsAreEqualIfOnlyIfDistanceIsZero() {
        Point2D reference = new Point2D(3,5);
//        Point2D reference = new Point3D(3,5,1);
        List<Point2D> testPoints = Arrays.asList(
                new Point2D(2,3),
                new Point2D(3,5),
                new Point2D(4,3)
        );

        for (Point2D point: testPoints) {
            assertThat(reference.distance(point) == 0).isEqualTo(reference.equals(point));
        }
    }
}
