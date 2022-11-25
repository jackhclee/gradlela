import com.app.SpringApp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        classes = {SpringApp.class}
        ,properties = {"SPRING_PROFILES_ACTIVE=local"}
        ,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles(profiles = {"local"})
public class SpringAppTestLocal {
    @Value("${app.title}")
    private String title;

    @Test
    public void testTitle() {
        assertEquals("local", title);
    }
}
