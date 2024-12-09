package HomeWork.les13.ex;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class RaceCarRunnable extends Car implements Runnable
{
    private double passed;
    private final double distance;
    private boolean isFinish;
    private final CountDownLatch latch;
    private long finishTime;

    private static final DecimalFormat df = new DecimalFormat("0.0");

    public RaceCarRunnable(String name, double maxSpeed, double distance, CountDownLatch latch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.latch = latch;
        this.passed = 0;
        this.isFinish = false;
    }

    private double getRandomSpeed()
    {
        Random random = new Random();
        double minSpeed = getMaxSpeed() / 2;
        return minSpeed + (getMaxSpeed() - minSpeed) * random.nextDouble();
    }

    @Override
    public void run() {
        while (!isFinish)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(getName() + " було перервано.");
                return;
            }

            double speed = getRandomSpeed();
            passed += speed;

            if (passed >= distance)
            {
                passed = distance;
                isFinish = true;
                finishTime = System.currentTimeMillis() - Race.startRaceTime.get();
                System.out.println(getName() + " завершив гонку! Час: " + finishTime + " мс");
                latch.countDown();
            } else
            {
                System.out.println(getName() + " => швидкість: " + df.format(speed) +
                        "; прогрес: " + df.format(passed) + "/" + df.format(distance));
            }
        }
    }

    public long getFinishTime() {return finishTime;}
}
