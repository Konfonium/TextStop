package MyTest;

public class RowTest {

    private boolean theStop;
    private int rows;
    private int numberOfCharacters;

    public RowTest() {
        rows = 0;
        numberOfCharacters = 0;
        theStop = false;
    }

    public int getRows() {
        return rows;

    }

    public void addRows() {
        rows = rows + 1;

    }

    public int getChars() {
        return numberOfCharacters;

    }

    public void addChars(String myChars) {
        numberOfCharacters = numberOfCharacters + myChars.length();
    }

    public boolean isStop() {
        return theStop;


    }

    public void setStop(String myChars) {
        if (myChars.equals("stop")) {
            theStop = true;
        }
    }
}

