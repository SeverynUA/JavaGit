package HomeWork.les13.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class Race
{
    public static final AtomicLong startRaceTime = new AtomicLong();

    public static void startRace(List<Thread> cars)
    {
        new Thread(() -> {
            try {
                System.out.println("3...");
                Thread.sleep(500);
                System.out.println("2...");
                Thread.sleep(500);
                System.out.println("1...");
                Thread.sleep(500);
                System.out.println("GO!!!");
                startRaceTime.set(System.currentTimeMillis());
                for (Thread car : cars) {
                    car.start();
                }
            } catch (InterruptedException e) {
                System.out.println("Старт гонки перервано.");
            }
        }).start();
    }

    public static void main(String[] args) throws InterruptedException
    {
        int numCars = 3;
        double trackDistance = 1000.0;
        CountDownLatch latch = new CountDownLatch(numCars);

        List<RaceCarRunnable> raceCars = new ArrayList<>();
        raceCars.add(new RaceCarRunnable("Машина 1", 200.0, trackDistance, latch));
        raceCars.add(new RaceCarRunnable("Машина 2", 180.0, trackDistance, latch));
        raceCars.add(new RaceCarRunnable("Машина 3", 220.0, trackDistance, latch));

        List<Thread> threads = new ArrayList<>();
        for (RaceCarRunnable car : raceCars) {
            threads.add(new Thread(car));
        }

        startRace(threads);

        latch.await();

        System.out.println("\nРезультати гонки:");
        RaceCarRunnable winner = raceCars.get(0);
        for (RaceCarRunnable car : raceCars) {
            System.out.println(car.getName() + " фінішував за " + car.getFinishTime() + " мс");
            if (car.getFinishTime() < winner.getFinishTime()) {
                winner = car;
            }
        }

        System.out.println("\nПереможець: " + winner.getName() + " з часом " + winner.getFinishTime() + " мс!");
    }
}
