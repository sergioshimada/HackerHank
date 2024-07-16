import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppleAndOrange {

    public static void main(String[] args) {

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = new ArrayList<>(Arrays.asList(-2, 2, 1));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(5, -6));

        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        AtomicInteger applesCount = new AtomicInteger();
        AtomicInteger orangesCount = new AtomicInteger();

        apples.forEach(apple->{
            int appleLocation = apple + a;

            if(validArea(s, t, appleLocation)){
                applesCount.getAndIncrement();
            }
        });

        oranges.forEach(orange->{
            int orangeLocation = orange + b;

            if(validArea(s, t, orangeLocation)){
                orangesCount.getAndIncrement();
            }
        });

        System.out.println(applesCount.get());
        System.out.println(orangesCount);
    }

    private static boolean validArea(int s, int t, int location) {
        return location >= s && location <= t;
    }
}
