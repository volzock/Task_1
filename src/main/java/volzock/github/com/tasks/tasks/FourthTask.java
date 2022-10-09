package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.Scanner;

public class FourthTask implements Task {

    private boolean profitableGamble(double prob, long prize, long pay) {
        return prob * prize > prob;
    }
    @Override
    public void run() {
        System.out.println("Write {prob:double}, {prize:long}, {pay:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            double prob = scanner.nextDouble();
            long prize = scanner.nextLong(),
                    pay = scanner.nextLong();
            System.out.printf("profitableGamble(%f, %d, %d) -> %b%n",
                    prob, prize, pay, profitableGamble(prob, prize, pay));
        }
    }
}
