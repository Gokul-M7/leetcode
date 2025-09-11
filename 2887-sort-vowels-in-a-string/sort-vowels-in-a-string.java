import java.util.Arrays;

class Solution {
    public String sortVowels(String s) {
        char[] v = s.toCharArray();
        char[] vowels = new char[v.length];
        int count = 0;

        for (char ch : v) {
            if (isVowel(ch)) {
                vowels[count++] = ch;
            }
        }

        Arrays.sort(vowels, 0, count);
        int idx = 0;
        for (int i = 0; i < v.length; i++) {
            if (isVowel(v[i])) {
                v[i] = vowels[idx++];
            }
        }

        return new String(v);
    }

    private boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }
}
