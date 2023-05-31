package string_problem;


import java.util.Arrays;

public class Anagram {



    /**
     * INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     * <p>
     * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     * original letters exactly once.
     * <p>
     * Ex: "CAT" & "ACT",
     * "ARMY" & "MARY",
     * "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        String str1 = "MARY";
        String str2 = "ARMY";
        if(isAnagram(str1, str2)){
            System.out.println(str1+ " and " + str2 + " are anagrams");

        }else {
            System.out.println(str1+  " and " + str2 + "are not anagrams ");
        }


    }
         static public boolean isAnagram(String str1 , String str2){
        //we need to check the length of the string because is they don't have the saame length they cant be anagrams
        if(str1.length() != str2.length()){
            return false;

        }else{
            char ch1[] = str1.toCharArray();
            char ch2[] = str2.toCharArray();
           //Array.sort Methode will sort the string in  order
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            // we have to compare our arrays if they are equals with methode
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
            else {
                return false;
            }



        }

    }

    }







