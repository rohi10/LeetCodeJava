class Solution {
    public int lengthOfLastWord(String s) {
        String strarr[] =  s.split(" ");
        int arrlen = strarr.length;
        return strarr[arrlen -1].length();
    }
}
