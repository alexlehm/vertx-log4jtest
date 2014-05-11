package cx.lehmann.log4j;

import org.junit.Test;
import org.vertx.java.core.logging.Logger;
import org.vertx.testtools.TestVerticle;
import org.vertx.testtools.VertxAssert;

public class Log4jTestVerticleTest extends TestVerticle {

    @Test
    public void testLog4j() {
        final Logger logger = container.logger();

        logger.debug("hello");
        logger.debug("hello");
        logger.error("hello");
        
        logger.info("Verticle class");
        logger.info("Verticle class2");

        new TestInterface() {
            public void execute(String msg) {
                logger.info("inner class");
            }

        }.execute("execute");
        
        logger.info("test finished");
        VertxAssert.testComplete();
    }

}
