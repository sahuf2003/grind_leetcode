class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        Map<Character,Integer> sfreq = new HashMap<>();
        Map<Character,Integer> tfreq = new HashMap<>();

        for(char a:s.toCharArray()){
            sfreq.put(a,sfreq.getOrDefault(a,0)+1);
        }
        for(char b:t.toCharArray()){
            tfreq.put(b,tfreq.getOrDefault(b,0)+1);
        }
        return sfreq.equals(tfreq);
    }
}