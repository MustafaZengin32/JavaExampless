package map;

import java.util.Hashtable;

public class Map05HashTable {

    /*
           1) HashTable bir map'dir.
           2) HashTable etrySet'ler herhangi bir siralamaya tabi tutmaz.
           3) HashTable, HashMop'lerden daha yavastir. Cunku HashTable'lar thread-safe(ayni anda birkaç iş yapabilme) ve
              synchronized'dir.

           Note: toString() method'u object'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
                 toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.

    */
    public static void main(String[] args) {
        Hashtable<String, Integer> countryPopulations= new Hashtable<>();
        countryPopulations.put("USA",     400000000);
        countryPopulations.put("Germany", 80000000);
        countryPopulations.put("Turkey",  90000000);

        // countryPopulations.put(null,      90000000); //HashTable'larda key null olamaz. NullPointerException
        // countryPopulations.put("France", null);      //HashTable'larda value null olamaz. NullPointerException

        Hashtable<String, Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks", "th@gmail.com", 21, true));
        System.out.println(myStudents);//{Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}}

        String name = myStudents.get("Math").name;
        System.out.println(name);//Tom Hanks

        int age =  myStudents.get("Math").age;
        System.out.println(age);//21

        myStudents.put("GEO", new Students("Angelina Julie", "aj@gmail.com", 51, true));
        System.out.println(myStudents);
        //{Math=Students{name='Tom Hanks', email='th@gmail.com', age=21, success=true}, GEO=Students{name='Angelina Julie', email='aj@gmail.com', age=51, success=true}}
    }


}
