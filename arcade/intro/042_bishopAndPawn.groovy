/*
https://codefights.com/arcade/intro/level-9/6M57rMTFB9MeDeSWo

See link for descriptive image.

Given the positions of a white bishop and a black pawn on the standard chess board, determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:


Example

For bishop = "a1" and pawn = "c3", the output should be
bishopAndPawn(bishop, pawn) = true.



For bishop = "h1" and pawn = "h3", the output should be
bishopAndPawn(bishop, pawn) = false.



Input/Output

[time limit] 6000ms (groovy)
[input] string bishop

Coordinates of the white bishop in the chess notation.

[input] string pawn

Coordinates of the black pawn in the same notation.

[output] boolean

true if the bishop can capture the pawn, false otherwise.
 */

boolean bishopAndPawn(String bishop, String pawn) {

    def bPos = bishop.chars.collect{(int)it}
    def pPos = pawn.chars.collect{(int)it}
    (bPos[0] - pPos[0]).abs() == (bPos[1] - pPos[1]).abs()
}
