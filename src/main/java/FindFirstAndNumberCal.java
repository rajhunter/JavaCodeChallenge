import java.util.*;
import java.util.stream.Collectors;
public class FindFirstAndNumberCal {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 6, 3, 4, 9, 6);
        List<Integer> numbers = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
       System.out.println(numbers); // [4, 8, 12]
        findSecondHighest(list);


        List<Integer> numberList= Arrays.asList(10,9,5,10,4,5,9,5,10,3,4,3,3);

        Map<Integer, Long> groupList=numberList.stream()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()));

        System.out.println(groupList); // [4, 8, 12]

    }

    public static void findSecondHighest(List<Integer> list){
        int secondHi=list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(()-> new NoSuchElementException("No record"));
        System.out.println("Second Highest:"+secondHi);



    }


}

