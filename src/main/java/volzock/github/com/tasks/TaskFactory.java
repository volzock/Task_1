package volzock.github.com.tasks;

import volzock.github.com.tasks.tasks.*;

public class TaskFactory {
    public static Task createInstance(int type) {
        switch (type) {
            case 1:
                return new FirstTask();
            case 2:
                return new SecondTask();
            case 3:
                return new ThirdTask();
            case 4:
                return new FourthTask();
            case 5:
                return new FithTask();
            case 6:
                return new SixthTask();
            case 7:
                return new SeventhTask();
            case 8:
                return new EigthTask();
            case 9:
                return new NinethTask();
            case 10:
                return new TenthTask();
            default:
                throw new IllegalArgumentException("There's no task with such number");
        }
    }
}
