package MyTest;

import java.util.Scanner;

public class MainRow {

    public static void main(String[] args) {
        RowTest myRows = new RowTest();
        Scanner scan = new Scanner(System.in);

        //Läs in nästa rad
        String myString = scan.nextLine();
        //Kontrollera om vi har ordet stop
        myRows.setStop(myString);
        //Gör följande såvida inte stop är satt
        while (!myRows.isStop()) {

            //Räknar vi antal tecken i myString
            //lägg till en rad
            myRows.addChars(myString);
            myRows.addRows();
            //läs in myString igen
            myString = scan.nextLine();
            //kontroller om vi har ordet stop igen
            myRows.setStop(myString);
        }
        //Skriver vi ut antal tecken
        //Skriv ut antal rader
        System.out.println(myRows.getRows());
        System.out.println(myRows.getChars());

    }
}
