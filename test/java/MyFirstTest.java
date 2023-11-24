import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFirstTest {

//    @Test
//    void helloFromTest() {
//        //Arrange
//        String myValue = "Hello World";
//
//        //Act
//        String result = myValue + "!";
//
//        //Assert
//        assertEquals("Hello World!", result);
//    }
//
//    @Test
//    void declareTypedValues() {
//        //TODO
//        String notWool = "String is java are not made of wool";
//        int largestNumberForInt = 2147483647;
//        int smallestNumberForInt = -2147483648;
//        assertEquals(2147483647, largestNumberForInt);
//        double avogadro = 6.02214076E23;
//        assertEquals(avogadro, 6.02214076E23);
//        double valueFromInt = largestNumberForInt;
//        assertEquals(2147483647, valueFromInt);
//        int avogadroAsInt = (int) avogadro;
//        assertEquals(2147483647, avogadroAsInt);
//        int a = 1;
//        int b = 41;
//        int answer = a + b;
//        assertEquals(42, answer);
//    }

    @Test
    void passByValueTest() {
    }

    void addOne(int number) {
        number = number + 1;
    }
    //Arrange
    int myValue = 1337;
    //Act
    addOne(myValue);
    //Assert
    assertEquals( ? , myValue);
}

