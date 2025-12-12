import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] list1 = new int[]{};
        int[] list2 = new int[]{0};
        int[]  returnMiltilist = solution2.mergeLists(list1, list2);

        System.out.println(Arrays.toString(returnMiltilist));

    }
}




