package repeat.shop.workers;

import java.time.LocalTime;

public interface WorkerInterface {

    public static final int CONSTANT = 10;

    void goWork(int hours);

    void takeSalary();

    default void currentTime() {
        LocalTime now = getTime();
        System.out.println(now);
    }

    private static LocalTime getTime() {
        return LocalTime.now();
    }
}
