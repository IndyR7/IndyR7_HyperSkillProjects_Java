package tictactoe;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UI userInterface = new UI(scanner);
        userInterface.start();
    }
}