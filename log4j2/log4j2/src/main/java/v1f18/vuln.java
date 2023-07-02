package v1f18;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class vuln {
    private static final Logger logger = LogManager.getLogger(vuln.class);
    public static void main(String[] args) {
        String a="${java:os}";
        logger.error(a);
    }
}
