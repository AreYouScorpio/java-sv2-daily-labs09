package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String> shortestWords(List<String> words){
        int max=1000;
        List<String> result = new ArrayList<>();
        for (String actual : words) {
            if (actual.length()<max) {max=actual.length();}
        }
        for (String actual : words) {
            if (actual.length()==max) result.add(actual);}
        return result;
        }

    public static void main(String[] args) {
        StringLists stringLists = new StringLists();
        stringLists.shortestWords(List.of("aaa","aa","bb","cccc","dd"));
    }


    }

