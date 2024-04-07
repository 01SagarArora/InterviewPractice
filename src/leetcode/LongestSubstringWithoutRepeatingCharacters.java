package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

//    public static int lengthOfLongestSubstring(String s) {
//        String str2 = "", str3 = "";
//        for(int i=0; ; i++){
//            for (int j=i-1; j<s.length(); j++)
//                if(!str2.contains(Character.toString(s.charAt(j)))) {
//                    str2 += s.charAt(j);
//            }
//
//            if(str2.length() > str3.length()){
//                str3 = str2;
//                str2 = "";
//            }
//        }
//        return str3.length();
//
//    }


        public static  int lengthOfLongestSubstring(String s) {
            if (s.isEmpty()) return 0;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int max=0;
            for (int i=0, j=0; i<s.length(); ++i){
                if (map.containsKey(s.charAt(i))){
                    j = Math.max(j,map.get(s.charAt(i))+1);
                }
                map.put(s.charAt(i),i);
                max = Math.max(max,i-j+1);
            }
            return max;
        }


    public static void main(String[] args) {
        int result = lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }
}
