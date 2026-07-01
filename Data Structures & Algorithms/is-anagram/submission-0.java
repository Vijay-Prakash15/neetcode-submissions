class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n > m || m > n) return false;
        int[] charArr1 = new int[26];
        int[] charArr2 = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            charArr1[ch-'a']++;
        }
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            charArr2[ch - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(charArr1[i] != charArr2[i]){
                return false;
            }
        }
        return true;
    }
}
