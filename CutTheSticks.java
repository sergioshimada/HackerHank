import java.util.*;

public class CutTheSticks {


    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 4, 2, 2, 8));
        cutTheSticks(list).forEach(System.out::println);
    }

    public static List<Integer> cutTheSticks(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();

        Collections.sort(arr);

        while (!arr.isEmpty()){
            result.add(arr.size());

            Integer lowerValue = arr.stream().findFirst().get();

            removerLowerValues(arr, lowerValue);
            subtractValues(arr, lowerValue);
        }

        return result;
    }

    private static void subtractValues(List<Integer> arr, Integer lowerValue) {
        for(int i = 0; i <= arr.size()-1 ; i++){
            arr.set(i, arr.get(i) - lowerValue);
        }
    }

    private static void removerLowerValues(List<Integer> arr, Integer lowerValue) {
        for(int i = arr.size()-1; i >= 0 ; i--){
            if(Objects.equals(arr.get(i), lowerValue)){
                arr.remove(i);
            }
        }
    }
}