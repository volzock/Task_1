package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class FirstTask implements Task {
    private long reminder(long a, long b) {
        return a % b;
    }

    public FirstTask() {}

    @Override
    public void run() {
        System.out.println("Write {dividend:long} and {divider:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long dividend = scanner.nextLong(),
                    divider = scanner.nextLong();
            System.out.printf("reminder(%d, %d) -> %d%n", dividend, divider, reminder(dividend, divider));
        }
    }
}
