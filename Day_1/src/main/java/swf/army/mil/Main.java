package swf.army.mil;

import java.io.IOException;
import java.nio.file.Files;
import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        File myFile = new File("/Users/a2473390/Desktop/adventocode/adventofcode/Day_1/src/main/resources/Dial_Turns");



        String[] Turns = Files.readAllLines(myFile.toPath()).toArray(new String[0]);

        Character[] Directions = new Character[Turns.length];
        Integer[] Ticks = new Integer[Turns.length];
        for (int index = 0; index <= Turns.length-1; index++) {
            Directions[index] = Turns[index].charAt(0);
            Ticks[index] = Integer.parseInt(Turns[index].substring(1));
        }


        for (int index = 0; index <= Turns.length-1; index++) {
            System.out.println("Direction: " + Directions[index] + " Ticks: " + Ticks[index]);
        }

        int Dial = 50;
        int ZeroCount = 0;

        for(int index = 0; index <= Turns.length-1; index++) {
            while (Ticks[index] > 100) {
                Ticks[index] -= 100;
            }
            if (Directions[index] == 'L') {
                if (Dial - Ticks[index] < 0) {
                    Dial = 100 - (Ticks[index]-Dial);
                }
                else {
                    Dial -= Ticks[index];
                }
                if (Dial == 0) {
                    ZeroCount++;
                }
            }
            else {
                if (Dial + Ticks[index] > 99) {
                    Dial =(Ticks[index]+Dial) - 100;
                }
                else {
                    Dial += Ticks[index];
                }
                if (Dial == 0) {
                    ZeroCount++;
                }
            }
            System.out.println("Dial is: " + Dial);
        }
        System.out.println("ZeroCounter: " + ZeroCount);


    }
}