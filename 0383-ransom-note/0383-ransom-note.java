class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> vocabulary = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++) {
            Integer m = vocabulary.putIfAbsent(magazine.charAt(i), 1);
            if(m != null) {
                vocabulary.compute(magazine.charAt(i), (k, v) -> v + 1);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            Integer r = vocabulary.computeIfPresent(ransomNote.charAt(i), (k, v) -> v - 1);
            if(r == null || r < 0) {
                return false;
            }
        }
        return true;
    }
}