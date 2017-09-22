/*
https://codefights.com/arcade/code-arcade/spring-of-integration/dwA8RtDF86WucuoaQ/description

Given an array of 2k integers (for some integer k), perform the following operations until the array contains only one element:

On the 1st, 3rd, 5th, etc. iterations (1-based) replace each pair of consecutive elements with their sum;
On the 2nd, 4th, 6th, etc. iterations replace each pair of consecutive elements with their product.
After the algorithm has finished, there will be a single element left in the array. Return that element.

Example

For inputArray = [1, 2, 3, 4, 5, 6, 7, 8], the output should be
arrayConversion(inputArray) = 186.

We have [1, 2, 3, 4, 5, 6, 7, 8] -> [3, 7, 11, 15] -> [21, 165] -> [186], so the answer is 186.

Input/Output

[time limit] 6000ms (groovy)
[input] array.integer inputArray

Guaranteed constraints:
1 ≤ inputArray.length ≤ 20,
-9 ≤ inputArray[i] ≤ 99.

[output] integer
 */

int arrayConversion(List<Integer> inputArray) {

    boolean odd = true
    while(inputArray.size() > 1){
        def outputArray = []
        (0..<inputArray.size()/2).each{
            if(odd)
                outputArray << inputArray[it*2,it*2+1].sum()
            else
                outputArray << inputArray[it*2,it*2+1].inject(1){p,v->
                    p * v
                }
        }
        inputArray = outputArray
        odd = !odd
    }
    return inputArray[0]
}
