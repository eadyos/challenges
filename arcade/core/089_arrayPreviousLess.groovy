/*
https://codefights.com/arcade/code-arcade/spring-of-integration/MQg7s3dKrP4caN42A

Given array of integers, for each position i, search among the previous positions for the last (from the left) position that contains a smaller value. Store this value at position i in the answer. If no such value can be found, store -1 instead.

Example

For items = [3, 5, 2, 4, 5], the output should be
arrayPreviousLess(items) = [-1, 3, -1, 2, 4].

Input/Output

[time limit] 6000ms (groovy)
[input] array.integer items

Non-empty array of positive integers.

Guaranteed constraints:
3 ≤ items.length ≤ 15,
1 ≤ items[i] ≤ 200.

[output] array.integer

Array containing answer values computed as described above.
 */


List<Integer> arrayPreviousLess(List<Integer> items) {

    (0..<items.size()).collect{i->
        items[0..<i].reverse().find{
            it < items[i]
        } ?: -1
    }

}
