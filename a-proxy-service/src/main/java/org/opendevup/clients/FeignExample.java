package org.opendevup.clients;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FeignExample implements CommandLineRunner {
    private Log log = LogFactory.getLog(this.getClass().getName()); 
    @Override
    public void run(String... strings) throws Exception {
        log.info("\n-----------------\nFeign Example");
    }
}
