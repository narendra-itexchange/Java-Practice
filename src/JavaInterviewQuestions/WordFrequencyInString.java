package JavaInterviewQuestions;

import java.awt.*;
import java.util.*;

public class WordFrequencyInString {
//    String str = "Science blank Maths blank blank Physics blank Maths";

    public static Map<String, Integer>  countTheRepeatedWord(String str){
        //Created a map for count the frequency
        Map<String, Integer> mapOfRepeatedWord = new HashMap<String, Integer>();

        //split the string

        String []words = str.split(" ");

        for(String word : words){

            String tempWord = word.toLowerCase();

            if(mapOfRepeatedWord.containsKey(tempWord)){

                mapOfRepeatedWord.put(tempWord,mapOfRepeatedWord.get(tempWord)+1);

            }
            else {
                mapOfRepeatedWord.put(tempWord,1);
            }

        }
        for (String name: mapOfRepeatedWord.keySet()){

            String key =name.toString();
            String value = mapOfRepeatedWord.get(name).toString();
            System.out.println(key + " " + value);


        }

  return mapOfRepeatedWord;

    }

    public static void main(String[] args){

        String str = "two times three is not four";
        String words = "two times two is four";
        Map<String, Integer> Sentence = countTheRepeatedWord(str);
        Map<String, Integer> subString = countTheRepeatedWord(words);

        for (String word:subString.keySet()){
            if(Sentence.containsKey(word) && Sentence.get(word)>=subString.get(word)){
                System.out.println("true");
            }
            else{
                System.out.println("false");

            }

        }
    }



}



