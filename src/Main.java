import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        List<Integer> list=new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.set(1,20);

        System.out.println(list);

        //SO v can create a copy of the list other than doing traversing through foreach
        List<Integer> list2=new ArrayList<>(list);
        System.out.println(list2);

        list2.add(4);

        System.out.println(list2); // So adding extra elements in the copy list won't add to the og list

        List<Integer> list3=new ArrayList<>();
        list3.add(6);
        list3.add(7);
        list3.add(9);

        list3.addAll(list); //This will print all elements of list after list3 elements

        System.out.println(list3);

        System.out.println(list.indexOf(2)); //This 2 is object, not index. As its not available, therefore it is returning -1

        List<Integer> list4= list3.subList(1,4);
        System.out.println(list4);

        List<Integer> lk=new LinkedList<>();
        lk.add(1);
        lk.add(2);
        lk.add(3);

        ListIterator<Integer> iterator = lk.listIterator();

        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());
        System.out.println(iterator.previous());

        //Converting arraylist to array
        Integer [] arr= list.toArray(new Integer[0]);
        for(int x:arr)
            System.out.println(x+ " ");
    }
}