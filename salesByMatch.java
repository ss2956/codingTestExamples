import java.util.Arrays;
/*
There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Function Description

Complete the sockMerchant function in the editor below.

sockMerchant has the following parameter(s):

int n: the number of socks in the pile
int ar[n]: the colors of each sock

Returns
int: the number of pairs
Input Format

The first line contains an integer , the number of socks represented in .
The second line contains  space-separated integers, , the colors of the socks in the pile.

*/
class Solution {
  public int solution(int n, int[] ar)
 {
    int numPairs = 0;
    for (int x = 0; x < n; x++) {
      for (int i = x + 1; i < n; i++) {
        if (ar[x] == ar[i] && ar[x] != -1) {

          ar[x] = -1;
          ar[i] = -1;
          numPairs++;
          break;
        }
      }
    }

    return numPairs;
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] testOne = { 2, 1, 5, 3, 5, 2, 7, 3 };
    int[] testTwo = {};
    int[] testThree = { 2, 1 };
    int[] testFour = { 1 };
    int[] testFive = { 6, 6 };
    System.out.println(s.solution(8, testOne));
    System.out.println(s.solution(0, testTwo));
    System.out.println(s.solution(2, testThree));
    System.out.println(s.solution(1, testFour));
    System.out.println(s.solution(2, testFive));
  }
}
