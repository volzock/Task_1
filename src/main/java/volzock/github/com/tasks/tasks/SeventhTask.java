package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class SeventhTask implements Task {

    private long addUpTo(long number) {
        return number * (1 + number) / 2;
    }

    @Override
    public void run() {
        System.out.println("Write {number:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long number = scanner.nextLong();
            System.out.printf("addUpTo('%d') -> %d%n", number, addUpTo(number));
        }
    }
}
