package volzock.github.com.tasks.tasks;

import volzock.github.com.tasks.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NinethTask implements Task {

    private long sumOfCubes(List<Long> nums) {
        return nums.stream().mapToLong(num -> num * num * num).sum();
    }

    @Override
    public void run() {
        System.out.println("Write {n1:long}, {n1:long}m ..., {nn:long}:");
        try (Scanner scanner = new Scanner(System.in)) {
            String nums = scanner.nextLine();
            System.out.printf("sumOfCubes([%s]]) -> %d%n",
                    String.join(", ", nums.split(" ")),
                    sumOfCubes( Stream.of(nums.split(" ")).map(Long::parseLong).collect(Collectors.toList())));
        }
    }
}
