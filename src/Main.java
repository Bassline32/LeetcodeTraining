import java.util.HashMap;

/*Given an array of integers  and an integer , return indices of the two numbers such that they add up to target.numstarget
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
        Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/
public class Main {
    public static void main(String[] args) {
    }

     class Solution {
        public int[] twoSum(int[] nums, int target) {

            //делаем массив для сохранения двух индексов элементов, сумма которых даёт нужное выходное значение
            int[] result = new int[2];

            //делаем мапу для хранения ключ-значение
            HashMap<Integer, Integer> map = new HashMap<>();

            //создадим цикл, который будет проходить по каждому элементу массива nums
            for (int i = 0; i < nums.length; i++) {
                //i - индекс текущего элемента массива
                int findNumber = target - nums[i];

                if (map.containsKey(findNumber)) {
                    //записываем в нулевую позицию значение по ключу findNumber
                    result[0] = map.get(findNumber);
                    result[1] = i;
                }
                map.put(nums[i], i);
            }
            return result;
        }
    }
}



