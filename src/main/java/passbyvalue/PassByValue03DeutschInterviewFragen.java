package passbyvalue;

public class PassByValue03DeutschInterviewFragen {
    /*
    1. Erklären Sie das Konzept des "Pass-by-Value" in Java.

Antwort: "Pass-by-Value" in Java bedeutet,
dass eine Kopie des tatsächlichen Werts einer Variable an eine Methode übergeben wird,
anstatt die Variable selbst. Änderungen, die in der Methode an dem Parameter vorgenommen werden,
beeinflussen nicht die ursprüngliche Variable.

2. Kann man den Wert eines primitiven Datentyps ändern, der einer Methode übergeben wird?

Antwort: Nein, man kann den Wert eines primitiven Datentyps, der einer Methode übergeben wird, nicht ändern.
Da die Methode eine Kopie des primitiven Werts erhält, sind Änderungen, die in der Methode vorgenommen werden,
auf diese Kopie beschränkt. Die ursprüngliche Variable bleibt unverändert.

3. Kann man den Zustand eines Objekts ändern, das einer Methode übergeben wird?

Antwort: Ja, man kann den Zustand eines Objekts ändern, das einer Methode übergeben wird.
Obwohl Java "Pass-by-Value" verwendet, ist es wichtig zu beachten, dass die übergebene Referenz eine Kopie ist.
Sowohl die ursprüngliche Referenz als auch die Kopie verweisen immer noch auf dasselbe Objekt im Speicher.
Daher werden Änderungen am Zustand des Objekts in der Methode im ursprünglichen Objekt widergespiegelt.

5. Wie kann man "Pass-by-Reference"-Verhalten in Java simulieren?

Antwort: Man kann "Pass-by-Reference"-Verhalten in Java simulieren, indem man das Objekt in ein anderes Objekt einpackt
(z.B. einen Wrapper) oder ein Array oder eine Liste verwendet.
Man übergibt dann das Wrapper- oder Container-Objekt an die Methode, und Änderungen am Zustand des Objekts in der Methode
werden im ursprünglichen Objekt reflektiert, da dasselbe Objekt geändert wird.


     */
}
