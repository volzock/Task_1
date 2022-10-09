package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class TenthTask implements Task {

    private boolean abcmath(long a, long b, long c) {
        for (int i = 0; i < b; ++i) {
            a += a;
        }
        return a % c == 0;
    }

    @Override
    public void run() {
        System.out.println("Write {a:long}, {b:long}, {c:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long a = scanner.nextLong(), b = scanner.nextLong(), c = scanner.nextLong();
            System.out.printf("abcmath(%d, %d, %d) -> %b%n", a, b, c, abcmath(a, b, c));
        }
    }
}
