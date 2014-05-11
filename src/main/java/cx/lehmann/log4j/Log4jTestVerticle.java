package cx.lehmann.log4j;

import org.vertx.java.core.logging.Logger;
import org.vertx.java.platform.Verticle;

public class Log4jTestVerticle extends Verticle {

    private Logger logger;

    public void start() {
        logger = container.logger();

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
    }

}
