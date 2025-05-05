import com.app.SpringApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = {SpringApp.class}
        ,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringAppTestDefault {

    @Value("${app.title}")
    private String title;

    @Test
    public void testTitle() {
        assertEquals("Gradlela", title);
    }
}
