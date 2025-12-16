/* You are given a large integer represented as an integer array ,
 where each is the digit of the integer. The digits are ordered from most significant to least significant in
 left-to-right order. The large integer does not contain any leading 's.digitsdigits[i]ith0
Increment the large integer by one and return the resulting array of digits.
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
        */
public class Solution3 {
    public int[] plusOne(int[] digits) {
        //длина массива
        int n = digits.length;
        // идём с числа в конце массива, если число >= 0, то преходим на разряд старше(сдвигаемся влево в масииве
        for (int i = n - 1; i >= 0; i--) {
            //если элемент  в массиве меньше 9, то прибавляем к нему 1
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // в остальных случаях, если число равно 9, то его значение меняется на нуль
            digits[i] = 0;
        }
        //создаём новый разряд
        int[] newDigit = new int[n + 1];
        newDigit[0] = 1;
        return newDigit;
    }
}