package cx.lehmann.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {

    public static void main(String args[]) {
        final Logger logger=Logger.getLogger(Log4jTest.class);
        
        logger.debug("hello");
        logger.debug("hello");
        logger.error("hello");
        
        logger.info("Verticle class");

        new TestInterface() {
            public void execute(String msg) {
                logger.info("inner class");
            }

        }.execute("execute");
    }

}
