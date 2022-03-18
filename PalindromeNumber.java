class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }
    int reversedNum = 0;
     int newNum = x;
    while (newNum > 0) {
      reversedNum = reversedNum * 10 + newNum % 10;
      newNum /= 10;
    }
  
    return x - reversedNum == 0;
  }
  
  
}
