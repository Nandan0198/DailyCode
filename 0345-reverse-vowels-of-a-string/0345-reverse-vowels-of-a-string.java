class Solution {
    static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int n = s.length();
        int i = 0, j = n - 1;

        while(i < j){
            while( i < j && !isvowel(chars[i])){
                i++;
            }
            while( i < j && !isvowel(chars[j])){
                j--;
            }
            if( i < j){
                swap(chars, i , j);
                i++;
                j--;
            }
        }
        return new String(chars);
    }

    static void swap(char[] word, int i, int j){
        char temp = word[i];
        word[i] = word[j];
        word[j] = temp;
    }

    static boolean isvowel(char ch){
        return ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'
        || ch == 'A' || ch == 'O' || ch == 'U' || ch == 'E' || ch == 'I';
    }
}