package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class FithTask implements Task {

    private String operation(long a, long b, long c) {
        if (b + c == a) {
            return "added";
        } else if (b - c == a) {
            return "subtracted";
        } else if (b * c == a) {
            return "multiplied";
        } else if (b / c == a) {
            return "divided";
        } else {
            return "none";
        }
    }

    @Override
    public void run() {
        System.out.println("Write {result:long}, {firstParameter:long}, {secondParameter:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long a = scanner.nextLong(),
                    b = scanner.nextLong(),
                    c = scanner.nextLong();
            System.out.printf("operation(%d, %d, %d) -> %s%n",
                    a, b, c, operation(a, b, c));
        }
    }
}
