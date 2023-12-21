import io.raynelz.HibernateSessionService;
import org.junit.jupiter.api.Test;

public class HibernateServiceTest {

    @Test
    void exec() {
        HibernateSessionService service = new HibernateSessionService();
        service.exec();
    }
}
