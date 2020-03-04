import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestingInheritence {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        Logger log = Logger.getLogger(TestingInheritence.class.getName());
        log.info("Hello World");
    }
}

