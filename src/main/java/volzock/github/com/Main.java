package volzock.github.com;


import volzock.github.com.tasks.Task;
import volzock.github.com.tasks.TaskFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Write the number of task: ");
        try (Scanner scanner = new Scanner(System.in)) {
            TaskFactory.createInstance(scanner.nextInt()).run();
        }
    }
}
