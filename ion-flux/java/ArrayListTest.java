import java.util.*;

class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(-5);
        list.add(1);
        for (int i = 0 ; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Integer arr[] = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
