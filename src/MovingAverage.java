import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    int size;
    Queue<Integer> movingAverageValues = new LinkedList<>();
    public MovingAverage( int size ) {
        this.size = size;
    }

    public double next(int val) {
        if (size < 1) { return -1; }

        if (movingAverageValues.size() < size) {
            movingAverageValues.offer(val);
        } else {
            movingAverageValues.poll();
            movingAverageValues.offer(val);
        }

        //Do calculation
        int output = 0;
        for (Integer x : movingAverageValues) {
            output += x;
        }

        return (double) output / movingAverageValues.size();
    }

    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1)); // return 1.0 = 1 / 1
        System.out.println(movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
        System.out.println(movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
        System.out.println(movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3

    }
}
