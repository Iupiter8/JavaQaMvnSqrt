import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SqrtService;

public class SqrtServiceTest {

    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/sqrt.csv")
    public void shouldSqrtBetween(int expected, int downLine, int upLine){
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(downLine, upLine);

        Assertions.assertEquals(expected, actual);
    }


}
