package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class EigthTask implements Task {

    private long nextEdge(long ab, long bc) {
        return ab + bc - 1;
    }

    @Override
    public void run() {
        System.out.println("Write {ab:long}, {bc:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            long ab = scanner.nextLong(), bc = scanner.nextLong();
            System.out.printf("addUpTo(%d, %d) -> %d%n", ab, bc, nextEdge(ab, bc));
        }
    }
}
