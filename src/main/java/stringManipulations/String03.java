package stringManipulations;

public class String03 {
    public static void main(String[] args) {
        String a="Java kolaydir.";

        boolean b=a.startsWith("va",2);
        System.out.println(b); //true

        boolean b1=a.startsWith("kola", 5);
        System.out.println(b1);//true

        //replace
        String c=a.replaceFirst("a", "*");
        System.out.println(c);//J*va kolaydir.

        //concat
        String d=a.concat(" Anladin mi?");
        System.out.println(d);

        //trim
        String e = "   Tom HANKS     ";
        String f=e.trim();
        System.out.println(e); //"   Tom HANKS     "
        System.out.println(f); //"Tom HANKS"

        String e1 = "        ";
        String f1=e1.trim();
        System.out.println(e1); //"         "
        System.out.println(f1); //""

        String h="Java";
        String i="Java";

        int k=h.compareTo(i);
        System.out.println(k); //0

        String h1="Java";
        String i1="Kava";

        int k1=h1.compareTo(i1);
        System.out.println(k1); //-1

        String h2="Java";
        String i2="Hava";

        int k2=h2.compareTo(i2);
        System.out.println(k2); //2

        String h3="Java";
        String i3="java";
        int k3=h3.compareTo(i3);
        System.out.println(k3); //-32 buyuk kucuk harf arasi hep 32 vardir //A 65 //a 97

        int k4=h3.compareToIgnoreCase(i3);
        System.out.println(k4); //0

        String z=" She is beautiful";
        String n= z.repeat(5);
        System.out.println(n);

    }
}
