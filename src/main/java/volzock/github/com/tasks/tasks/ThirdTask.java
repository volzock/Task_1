package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class ThirdTask implements Task {

    private long animals(long chickens, long cows, long pigs) {
        return 2 * chickens + 4 * (cows + pigs);
    }
    @Override
    public void run() {
        System.out.println("Write {chickens:long}, {cows:long}, {pigs:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long chickens = scanner.nextLong(),
                    cows = scanner.nextLong(),
                    pigs = scanner.nextLong();
            System.out.printf("animals(%d, %d, %d) -> %d%n", chickens, cows, pigs, animals(chickens, cows, pigs));
        }
    }
}
