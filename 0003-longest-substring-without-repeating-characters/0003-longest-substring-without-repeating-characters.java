class Solution {
    public int lengthOfLongestSubstring(String s) {


        Map<Character, Integer> chars =  new HashMap<>();

        int res = 0;

        int left = 0;
        int right = 0;

        while(right < s.length()){
            char c = s.charAt(right);
            chars.put(c, chars.getOrDefault(c,0) + 1);

            while(chars.get(c) > 1){
                char l = s.charAt(left);
                chars.put(l, chars.get(l)-1);
                left++;
            }
            res = Math.max(res, right-left+1);
            right++;
        }

        return res;
        
    }
}