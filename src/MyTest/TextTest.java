package MyTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTest {

    @Test
    public void testGetRows() {


        //Arrange
        RowTest myRows = new RowTest();

        //Act
        // myRows.addRows();
        int actual = myRows.getRows();
        int expected = 0;


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testAddRows() {


        //Arrange
        RowTest myRows = new RowTest();

        //Act

        myRows.addRows();
        int actual = myRows.getRows();
        int expected = 1;


        //Assert
        assertEquals(expected, actual);


    }

    @Test
    public void testGetChars() {


        //Arrange
        RowTest myRows = new RowTest();

        //Act
        // myRows.addRows();
        int actual = myRows.getChars();
        int expected = 0;


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testAddChars() {


        //Arrange
        RowTest myRows = new RowTest();

        //Act
        myRows.addChars("Hej");
        int actual = myRows.getChars();
        int expected = 3;


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testStopTrue() {

        String text = "stop";
        //Arrange
        RowTest myRows = new RowTest();
        myRows.setStop(text);
        //Act
        boolean actual = myRows.isStop();
        boolean expected = true;


        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testStopFalse() {

        String text = "hej";
        //Arrange
        RowTest myRows = new RowTest();
        myRows.setStop(text);
        //Act
        boolean actual = myRows.isStop();
        boolean expected = false;


        //Assert
        assertEquals(expected, actual);
    }

}
