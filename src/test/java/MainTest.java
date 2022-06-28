import com.kenzie.app.Shell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void canStuffShellWithPearls() {

        //Arrange - set up the input
        int  inputNumber = 4;
        Shell testShell = new Shell();
        testShell.setNumPearls(1);

        //Act - call the method
        testShell = Main.stuffShellWithPearls(testShell,inputNumber);
        int outputPearls = testShell.numPearls;

        //Assert - check the results
        assertEquals(5,outputPearls, "Test: Positive number will be added" );

    }

    //add a test for negative numbers

    @Test
    void canStuffShellWithPearls_NegativeTest() {
        //possible inputs

        //Arrange - set up the input
        int  inputNumber = -2;
        Shell testShell = new Shell();
        testShell.setNumPearls(1);

        //Act - call the method
        testShell = Main.stuffShellWithPearls(testShell,inputNumber);
        int outputPearls = testShell.numPearls;

        //Assert - check the results
        assertEquals(0,outputPearls, "Test: Negative number will be set to zero" );

    }

}