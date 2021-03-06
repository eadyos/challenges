/*
https://codefights.com/challenge/npgAxzzMjLxhaXwSM


Given an array of integers, find the rightmost round number in it and output its position in the array (0-based). If there are no round numbers in the given array, output -1.

Example

For inputArray = [0, 5, 10, 15], the output should be
rightmostRoundNumber(inputArray) = 2;
For inputArray = [1, 2, 3, 4, 5], the output should be
rightmostRoundNumber(inputArray) = -1.
Input/Output

[execution time limit] 6 seconds (groovy)

[input] array.integer inputArray

Guaranteed constraints:
0 ≤ inputArray.length ≤ 10,
0 ≤ inputArray[i] ≤ 104.

[output] integer

*/

T rightmostRoundNumber(a) {
  
    a*.mod 10 lastIndexOf 0

}
