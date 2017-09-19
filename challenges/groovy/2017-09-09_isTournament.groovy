/*
https://codefights.com/challenge/iC93kyphDAnJtJXFN

Determine if the given directed graph is a tournament. (See definition)

Example

For
n = 5,
fromV = [2, 1, 3, 4, 4, 4, 1, 2, 3, 4] and
toV = [3, 2, 1, 3, 2, 1, 5, 5, 5, 5],
the output should be
isTournament(n, fromV, toV) = true.

Here's how the given graph looks like:



Input/Output

[time limit] 6000ms (groovy)
[input] integer n

A positive integer n representing the number of vertices in the given graph.

Guaranteed constraints:
1 ≤ n ≤ 10.

[input] array.integer fromV

An array of integers containing integers less than or equal to n.

Guaranteed constraints:
0 ≤ fromV.length ≤ 50,
1 ≤ fromV[i] ≤ n.

[input] array.integer toV

For each i in range [0, fromV.length) there is an edge from the vertex number fromV[i] to the vertex toV[i] in the given directed graph.

Guaranteed constraints:
toV.length = fromV.length,
1 ≤ toV[i] ≤ n.

[output] boolean

true if the given graph is a tournament, false otherwise.

 */

T isTournament(n,a,b) {

    (1..n).sum{
        it * (n-1)
    } == (a+b).sum()

}
