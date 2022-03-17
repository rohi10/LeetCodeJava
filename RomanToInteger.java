class Solution {
  public int romanToInt(String s) {
    String[] keys = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
    int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
    Map<String, Integer> romanMap = new HashMap<>();
    for (int i = 0; i < keys.length; i++) {
      romanMap.put(keys[i], values[i]);
    }
    int intVal = 0;
    int i = 0;
    int len = s.length();
    while (i < len) {
      char c = s.charAt(i);
      if (i < len-1 && romanMap.containsKey(s.substring(i, i + 2))) {
        intVal += romanMap.get(s.substring(i, i + 2));
        i += 2;
      }
      else {
        intVal += romanMap.get(String.valueOf(c));
        i++;
      }
    }
    return intVal;
  }
}
