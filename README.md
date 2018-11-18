# WalkerGame

We are playing a game on our cell phone. We are given an array of length n, indexed from 0 to n-1. Each element of the array is either 0 or 1. We can only move to an index which contains 0. At first, we are at the 0th position. In each move we can do one of the following things:
•	Walk one step forward or backward.
•	Make a jump of exactly length forward.

That means we can move from position x to x+1, x-1 or x+m in one move, but at least one of the following conditions must be true:
•	The new position contains 0.
•	The new position is greater than n-1.
We can’t move backward from position 0. If we move to any position greater than n-1, we win the game.
Given the array and the length of the jump, we need to determine if it’s possible to win the game or not.


Input Format
In the first line there will be an integer T denoting the number of test cases. Each test case will consist of two lines. The first line will contain two integers, n and m. On the second line there will be n space-separated integers, each of which is either 0 or 1.
Constraints:
•	1 <= T <= 5000
•	2 <= n <= 100
•	0 <= m <= 100
•	The first integer in the array is always 0.
Output Format:
For each case output YES if it’s possible to win the game, output NO otherwise.


# Solution Class
Read input from STDIN based on the test description

# WalkerGame
Because I want to write test cases for this class I created WalkerGame class and all tests are available on WalkergameTest

## Running the tests

There are 4 Junit tests
For the First sample input:
testWalkerGamerFor45300000()

For the second sample input:
testWalkerGamerFor465000111()

For the third sample input:
testwalkerGamerFor463001110()

For the forth sample input:
testwalkerGamerFor431010()




## Authors

* **Farahnaz Vahdati** 



## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details