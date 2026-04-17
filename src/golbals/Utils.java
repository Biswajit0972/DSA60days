package golbals;

import java.util.List;

public class Utils {
    public static <T> void print2dList(List<List<T>> list) {
        System.out.print("[");
        for (List<T> list1 : list) {
            System.out.print("[");
            for (T num : list1) {
                System.out.print(num + ",");
            }
            System.out.print("]");

        }
        System.out.println("]");
    }

    public static <T> void printList(List<T> nums) {
        System.out.println("[");
        for (T num : nums) {
            System.out.print(num + ", ");
        }
        System.out.println("]");
    }

    public static <T> void print2dArray(int[]  [] arr) {
        System.out.print("[");
        for (int  [] list1 : arr) {
            System.out.print("[");
            for (int num : list1) {
                System.out.print(num + ",");
            }
            System.out.print("]");

        }
        System.out.println("]");
    }
}
