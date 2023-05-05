package tests;

import dbconnection.DBConnection;
import org.junit.jupiter.api.*;
import utils.Log;

import java.sql.SQLException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestsSetup {

    @BeforeAll
    public void setUp(TestInfo testInfo)  {
        Log.info("------- Started test: " + testInfo.getDisplayName() + " -------");
        DBConnection.connectToDB();
        //Assertions.assertNotNull(DBConnection.connectToDB());
    }

    @AfterAll
    public void tearDown(TestInfo testInfo) {
        DBConnection.closeConnection();
        Log.info("------- Finished test: " + testInfo.getDisplayName() + " -------");
    }
}
