package day02;

import java.util.List;

public class StringLists {

    public void shortestWords(List<String> words){
        StringBuilder sb = new StringBuilder();
        int max=1000;
        for (String actual : words) {
            if (actual.length()<max) {max=actual.length();}
        }
        for (String actual : words) {
            if (actual.length()==max) System.out.println(actual.toString());}
        }


    public static void main(String[] args) {
        StringLists stringLists = new StringLists();
        stringLists.shortestWords(List.of("aaa","aa","bb","cccc","dd"));
    }


    }

