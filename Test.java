import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] list = new String[]{"a", "b", "c", "d", "e", "f", "g"};
        int i = 0;
        int j = list.length;
        while (i < j){
            String elem = list[j-1];
            list[j-1] = list[i];
            list[i] = elem;

            i++;
            j++;
        }

        System.out.println(Arrays.toString(list));
    }
}
