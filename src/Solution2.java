/*You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
*/

public class Solution2 {
    public int[] mergeLists(int[] list1, int[] list2) {
        //задал массивы
        list1 = new int[]{2, 4, 5, 8};
        list2 = new int[]{2, 6, 3, 10};

        // создаю новый массив, обЪединяющий размеры лист1 илист 2
        int[] multiList = new int[list1.length + list2.length];

        //копируем значения элементов лист1 в мультилист
        System.arraycopy(list1, 0, multiList, 0, list1.length);

        //копируем значения элементов лист2 в мультилист
        System.arraycopy(list2, 0, multiList, 0, list2.length);
        return multiList;

    }

}
