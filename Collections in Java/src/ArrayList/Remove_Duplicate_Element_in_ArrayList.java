package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate_Element_in_ArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));

//        1) LinkedHashSet
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>(numbers);
        ArrayList<Integer> numbersListWithoutDuplicates = new ArrayList<>(lhs);
        System.out.println(numbersListWithoutDuplicates);

//        2) JDK - 8 Stream
        ArrayList<Integer> markList = new ArrayList<>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
        List<Integer> marklistUnique =  markList.stream().distinct().collect(Collectors.toList());
        System.out.println(marklistUnique);
    }
}
