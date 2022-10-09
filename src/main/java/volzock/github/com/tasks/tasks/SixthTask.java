package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class SixthTask implements Task {

    private byte ctoa(char character) {
        return (byte) character;
    }

    @Override
    public void run() {
        System.out.println("Write {character:String[1]}:");
        try (Scanner scanner = new Scanner(System.in)) {
            char character = scanner.next().charAt(0);;
            System.out.printf("ctoa('%c') -> %d%n", character, ctoa(character));
        }
    }
}
