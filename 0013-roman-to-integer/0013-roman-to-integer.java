class Solution {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        int tmp = 0;
        Map<Character, Integer> nums = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        for(int i = 0; i < c.length; i++) {
            int curr = nums.get(c[c.length - i - 1]);
            result += curr >= tmp ? curr : -curr;
            tmp = curr;
        }
        return result;
    }
}