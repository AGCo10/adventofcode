package swf.army.mil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] Turns = {"L68", "L30", "R48", "L5", "R60" , "L55" , "L1", "L99", "R14", "L82"};
        Character[] Directions = new Character[10];
        Integer[] Ticks = new Integer[10];
        for (int index = 0; index <= Turns.length-1; index++) {
            Directions[index] = Turns[index].charAt(0);
            Ticks[index] = Integer.parseInt(Turns[index].substring(1));
        }


        for (int index = 0; index <= Turns.length-1; index++) {
            System.out.println("Direction: " + Directions[index] + " Ticks: " + Ticks[index]);
        }

    }
}