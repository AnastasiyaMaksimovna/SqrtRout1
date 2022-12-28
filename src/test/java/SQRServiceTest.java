import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqrService.csv")
    public void testNumberOfSquares(int expected, int i, int z) {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(i, z);

        Assertions.assertEquals(expected, actual);
    }
}
