package accessmodifier;

public class AccessModifeirDeutschInterviewFragen {

    /*

Frage 1: Welche Access-Modifier gibt es in Java, und was bedeuten sie?

Antwort: In Java gibt es vier Haupt-Access-Modifier:

public: Die Variable oder Methode ist von überall aus zugänglich.
protected: Die Variable oder Methode ist in der gleichen Klasse,
in abgeleiteten Klassen (Vererbung) und im gleichen Paket zugänglich.
default (kein Modifier angegeben): Die Variable oder Methode ist nur in der gleichen Klasse und im gleichen Paket zugänglich.
private: Die Variable oder Methode ist nur in der gleichen Klasse zugänglich.

Frage 2: Was ist der Unterschied zwischen public, protected, default und private?

Antwort: Der Hauptunterschied besteht in ihrem Sichtbarkeitsbereich:

public: Überall sichtbar.
protected: Nur in der Klasse selbst, in abgeleiteten Klassen und im gleichen Paket sichtbar.
default: Nur in der Klasse selbst und im gleichen Paket sichtbar.
private: Nur in der Klasse selbst sichtbar.

Frage 3: Welche Access-Modifier werden oft in Java-Interfaces verwendet?

Antwort: In Java-Interfaces werden in der Regel keine Access-Modifier verwendet,
da alle Felder automatisch als public, static, und final deklariert sind.
Methoden in Interfaces sind standardmäßig als public deklariert
und können nicht mit private oder protected versehen werden.

Frage 4: Was ist der Unterschied zwischen public und default (kein Modifier) Sichtbarkeit?

Antwort:

public: Die Variable oder Methode ist von überall aus sichtbar und zugänglich.
default: Die Variable oder Methode ist nur in der gleichen Klasse und im gleichen Paket sichtbar und zugänglich.
 Wenn kein Access-Modifier angegeben ist, wird dies als "default" bezeichnet.

 Frage 5: Welche Vorteile hat die Verwendung von private?

Antwort: Die Verwendung von private schützt Variablen und Methoden vor dem direkten Zugriff von außen, was die Datenkapselung ermöglicht.
Dies erhöht die Sicherheit und erleichtert die Wartung des Codes,
da Änderungen an den internen Details einer Klasse keine Auswirkungen auf den externen Code haben.

Frage 6: Kann eine protected Methode außerhalb des Pakets aufgerufen werden?

Antwort: Ja, eine protected Methode kann in abgeleiteten Klassen aufgerufen werden,
auch wenn sie sich außerhalb des Pakets befinden. Sie ist jedoch nicht von anderen Klassen außerhalb des Pakets zugänglich.




     */
}
