package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map01 {

    public static void main(String[] args) {

        /*
            1)Siz "HashMap<String, Double> salaries = new HashMap<>();" kodu yazdiginizda Java memory'de 16 kutu(bucket) iceren bir yapi olusturur ve
              bu yapidaki herbir kutuya index verir. Index'ler 0 dan 15 e kadaradir.
            2)Siz "salaries.put("QA", 110000.00);" kodunu yazdiginizda Java, key icin bir HashCode olusturur bu HashCode'u 15 e boler ve kalani index olarak kullanir.
              Ve bu elemani o index'e yerlestirir.
            3)Yerlestirirken 4'lu bir yapi olusturur, bu yapinin ilk bolumune "HashCode" u, ikinci bolumune "Key" i, ucuncu bolumune "Value" u ve dorduncu bolumune
              "pointer" i koyar. Bu cok bolumlu yapi LinkedList'lerdeki "Node" dur. Yani HashMap bucket'lari koydugu data'yi LinkedList olarak depolar.
            4)Java "null" icin hep HashCode olarak "zero" uretir, o yuzden key null oldugunda
              eleman ilk bucket'a yerlestirilir. Bundan dolayi key'si null olan elemanlar Map in icinde
              genellikle ilk sirada gozukurler.
            5)Java normalde HashCode'lari unique yapar ama bazen trafik kazasi gibi farkli iki eleman icin
              ayni HashCode uretilebilir. Buna "Hash Collision" denir. Hash Collision meshur bir
              Java Development peoblemidir. Bu problemle karsilasildiginda developer'lar bu problemi cozmek icin kodlar yazarlar, ama bu
              Core Java nin konusu degildir.
     */


        Map<Integer, String> sinif = new HashMap();
        sinif.put(101, "Ali, Can, J.dev");
        sinif.put(102, "Veli, Yan, QA");
        sinif.put(103, "Ali, Yan, C#");
        System.out.println(sinif);

        System.out.println("***************************************************");

        int no = 104;
        String isim = "Ayse";
        String soyisim = "Can";
        String brans = "QA";
        sinif.put(Integer.valueOf(no), isim + ", " + soyisim + ", " + brans);
        System.out.println(sinif);

        System.out.println("***************************************************");

        System.out.println((String)sinif.get(102));//Veli, Yan, QA
        System.out.println((String)sinif.get(104));//Ayse, Can, QA

        System.out.println("***************************************************");

        System.out.println(sinif.keySet());//[101, 102, 103, 104]
        System.out.println(sinif.values());//[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]

        System.out.println("***************************************************");



        List<String> valueList = new ArrayList(sinif.values());
        System.out.println(valueList);//[Ali, Can, J.dev, Veli, Yan, QA, Ali, Yan, C#, Ayse, Can, QA]
        System.out.println(valueList.size());//4

        System.out.println("***************************************************");

        List<String> isimListesi = new ArrayList();

        String[] bilgiler = new String[3];

        for(int i = 0; i < valueList.size(); ++i) {
            bilgiler = ((String)valueList.get(i)).split(",");
            isimListesi.add(bilgiler[0]);
        }

        System.out.println(isimListesi);//[Ali, Veli, Ali, Ayse]

        System.out.println("***************************************************");

        Map<String, String> ogr1Map = new HashMap();
        ogr1Map.put("isim", "Ali");
        ogr1Map.put("soyisim", "Can");
        ogr1Map.put("brans", "J.dev");

        Map<String, String> ogr2Map = new HashMap();
        ogr2Map.put("isim", "Veli");
        ogr2Map.put("soyisim", "Yan");
        ogr2Map.put("brans", "QA");

        Map<String, String> ogr3Map = new HashMap();
        ogr3Map.put("isim", "Ali");
        ogr3Map.put("soyisim", "Yan");
        ogr3Map.put("brans", "C#");

        Map<String, String> ogr4Map = new HashMap();
        ogr4Map.put("isim", "Ayse");
        ogr4Map.put("soyisim", "Can");
        ogr4Map.put("brans", "QA");

        System.out.println("1. ogrenci : " + ogr1Map);
        System.out.println("2. ogrenci : " + ogr2Map);
        System.out.println("3. ogrenci : " + ogr3Map);
        System.out.println("4. ogrenci : " + ogr4Map);

        Map<Integer, Map<String, String>> sinifMap = new HashMap();

        sinifMap.put(101, ogr1Map);
        sinifMap.put(102, ogr2Map);
        sinifMap.put(103, ogr3Map);
        sinifMap.put(104, ogr4Map);

        System.out.println(sinifMap);


    }

}
