package immutable;

public class ImmutableDeutschInterviewFragen {

    /*
Frage 1: Was ist Unveränderlichkeit (Immutability) in Java?

Antwort: Unveränderlichkeit bezieht sich auf die Eigenschaft eines Objekts,
dessen Zustand nach seiner Erstellung nicht mehr geändert werden kann.
Wenn ein Objekt als unveränderlich betrachtet wird, bedeutet dies,
dass seine Attribute (Felder) nach der Initialisierung nicht mehr geändert werden können.

Frage 2: Warum ist Unveränderlichkeit in Java wichtig?

Antwort: Unveränderlichkeit bietet mehrere Vorteile:

Thread-Sicherheit: Unveränderliche Objekte können sicher in mehreren Threads verwendet werden,
da sie nicht geändert werden können. Dadurch werden Wettlaufbedingungen und Dateninkonsistenzen vermieden.

Einfache Fehlerbehandlung: Da unveränderliche Objekte nicht geändert werden können, sind sie fehlerresistent.
Wenn ein Fehler auftritt, wird ein neues Objekt erstellt, anstatt das vorhandene zu ändern.

Einfache Wartung: Unveränderliche Objekte sind leichter zu warten,
da sie konsistent bleiben und sich nicht unerwartet ändern.

Frage 3: Wie erstellt man ein unveränderliches Objekt in Java?

Antwort: Um ein unveränderliches Objekt in Java zu erstellen, folgen Sie diesen Schritten:

Machen Sie die Klasse final: Damit die Klasse nicht erweitert werden kann.

Machen Sie alle Felder private final: Damit die Felder nach der Initialisierung nicht geändert werden können.

Bieten Sie keine Mutationsmethoden an: Vermeiden Sie Methoden, die den Zustand des Objekts ändern.

Verwenden Sie Konstruktoren für die Initialisierung: Alle Felder sollten im Konstruktor initialisiert werden.

Vermeiden Sie das Überschreiben von Methoden, die den Zustand ändern könnten, wie hashCode() und equals().

Frage 4: Was ist der Unterschied zwischen Unveränderlichkeit und Konstanz (Finalität) in Java?

Antwort: Unveränderlichkeit bezieht sich auf die Unfähigkeit, den Zustand eines Objekts nach seiner Initialisierung zu ändern.
Dies wird normalerweise durch die Verwendung von final für Felder und/oder Methoden erreicht.

Konstanz (Finalität) hingegen bezieht sich auf die Unmöglichkeit, eine Referenz auf ein Objekt nach seiner Initialisierung zu ändern.
Dies wird durch die Verwendung des Schlüsselworts final für Variablen erreicht. Ein final-Feld ist immer unveränderlich,
aber ein unveränderliches Objekt muss nicht zwangsläufig final-Felder haben.

Frage 5: Welche Java-Klassen sind unveränderlich?

Antwort: In Java sind viele der Standardklassen unveränderlich,
darunter String, Integer, BigDecimal, LocalDate, LocalTime, LocalDateTime, usw.
Diese Klassen haben private Felder, die nach der Initialisierung nicht mehr geändert werden können,
und bieten keine Methoden an, um ihren Zustand zu ändern.



     */
}
