package queue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class startTest extends AbstractDocClosetApiStarter {

    @Test
    public void runTest() {
        final String helloWorld = "helloWorld";
        assertEquals(helloWorld, "helloWorld");
    }
}
