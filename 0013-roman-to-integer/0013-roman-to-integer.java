class Solution {
    public int romanToInt(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        int tmp = 0;
        HashMap<Character, Integer> nums = new HashMap<Character, Integer>();
        nums.put('I', 1);
        nums.put('V', 5);
        nums.put('X', 10);
        nums.put('L', 50);
        nums.put('C', 100);
        nums.put('D', 500);
        nums.put('M', 1000);
        for(int i = 0; i < c.length; i++) {
            for(Character j : nums.keySet()) {
                if(c[c.length - i - 1] == j) {
                    if(nums.get(j) >= tmp) {
                        result += nums.get(j);
                    } else {
                        result -= nums.get(j);
                    }
                    tmp = nums.get(j);
                }
            }
        }
        return result;
    }
}