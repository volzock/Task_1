package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class SecondTask implements Task {

    private long triArea(long base, long height) {
        return base * height / 2;
    }

    @Override
    public void run() {
        System.out.println("Write {base:long} and {height:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long base = scanner.nextLong(),
                    height = scanner.nextLong();
            System.out.printf("triArea(%d, %d) -> %d%n", base, height, triArea(base, height));
        }
    }
}
