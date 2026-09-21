class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();

        for(char c : first){
            count[c - 'a']++;
        }

        for(char c : second){
            count[c - 'a']--;
            if(count[c - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}