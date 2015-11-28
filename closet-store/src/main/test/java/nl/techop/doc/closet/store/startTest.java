package nl.techop.doc.closet.store;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class startTest extends AbstractDocCloseStoreStarter {
    private static final Logger logger = LoggerFactory.getLogger(startTest.class);

    @Test
    public void runTest() {
        final String helloWorld = "helloWorld";
        assertEquals(helloWorld, "helloWorld");
    }
}
