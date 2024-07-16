import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(73, 67, 38, 33));
        gradingStudents(list).forEach(System.out::println);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<>();

        grades.forEach(grade->{

            if(grade < 37){
                result.add(grade);
            }
            else if((grade + 1) % 5 == 0){
                result.add(grade + 1) ;
            }
            else if((grade + 2) % 5 == 0){
                result.add(grade + 2) ;
            }
            else{
                result.add(grade);
            }
        });

        return result;
    }
}