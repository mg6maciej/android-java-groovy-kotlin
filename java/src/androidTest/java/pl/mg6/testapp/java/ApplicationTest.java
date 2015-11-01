package pl.mg6.testapp.java;

import android.app.Application;
import android.test.ApplicationTestCase;

public class ApplicationTest extends ApplicationTestCase<Application> {

    public ApplicationTest() {
        super(Application.class);
    }

    public void testTruthness() {
        assertTrue(true);
    }
}
