package map;

import java.util.Arrays;
import java.util.HashMap;

public class Map03 {

    public static void main(String[] args) {

        //Size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren kodu yaziniz
        // "I like to move it, move it." ==> I=1, like=1, to=1, move=2, it=2

        String str = "I like to move it, move it.";

        //Noktalama isaretlerini sil
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);//I like to move it move it

        //Kelimeleri almak icin split() kullanalim
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));// [I, like, to, move, it, move, it]

        HashMap<String, Integer> sonuc = new HashMap<>();// { I=1, like=1 move=1                          }

        // I, like, to, move, it, move, it
        for(String w : kelimeler){

            Integer gorunumSayisi = sonuc.get(w);
            if(gorunumSayisi==null){
                sonuc.put(w, 1);
            }else{
                sonuc.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(sonuc);// { I=1, like=1, to=1, move=2, it=2 }

    }

}

