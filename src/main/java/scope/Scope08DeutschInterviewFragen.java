package scope;

public class Scope08DeutschInterviewFragen {

    /*
Frage 1: Was ist die Sichtbarkeit (Scope) einer Variablen in Java?

Antwort: Die Sichtbarkeit einer Variablen in Java bezieht sich darauf, in welchem Teil des Codes diese Variable verwendet werden kann. Es gibt vier grundlegende Arten von Scopes in Java:

Block Scope: Eine Variable, die innerhalb eines Codeblocks deklariert wurde, ist nur innerhalb dieses Blocks sichtbar.

java
Copy code
{
    int x = 10; // Block Scope
}
// x ist hier nicht sichtbar
Method Scope: Eine Variable, die innerhalb einer Methode deklariert wurde, ist nur innerhalb dieser Methode sichtbar.

java
Copy code
public void myMethod() {
    int y = 20; // Method Scope
}
// y ist hier nicht sichtbar
Class Scope: Eine Variable, die in einer Klasse, aber außerhalb von Methoden, deklariert wurde, ist in der gesamten Klasse sichtbar.

java
Copy code
public class MyClass {
    int z = 30; // Class Scope
}
// z ist in der gesamten Klasse sichtbar
Global Scope (Klassenvariablen oder Instanzvariablen): Eine Variable, die als statisches Mitglied (Klassenvariable) oder als Instanzvariable in einer Klasse deklariert wurde, ist in der gesamten Klasse und, wenn sie als statisches Mitglied deklariert wurde, auch in anderen Klassen sichtbar.

java
Copy code
public class MyClass {
    static int w = 40; // Global Scope (Klassenvariable)
    int x = 50; // Global Scope (Instanzvariable)
}
// w und x sind in der gesamten Klasse sichtbar

Frage 2: Was ist der Unterschied zwischen lokalen Variablen und Instanzvariablen?

Antwort:

Lokale Variablen werden innerhalb einer Methode oder eines Codeblocks deklariert und haben Block- oder Methodenscope. Sie sind nur innerhalb des Blocks oder der Methode sichtbar, in dem sie deklariert wurden, und existieren nur während der Ausführung dieser Methode oder dieses Blocks.

Beispiel:

java
Copy code
public void myMethod() {
    int localVar = 10; // Lokale Variable
}
// localVar ist außerhalb von myMethod nicht sichtbar
Instanzvariablen werden in einer Klasse, aber außerhalb von Methoden deklariert und haben Klassenscope. Sie sind sichtbar und existieren für jedes Objekt (Instanz) der Klasse und können von verschiedenen Methoden innerhalb dieser Klasse verwendet werden.

Beispiel:

java
Copy code
public class MyClass {
    int instanceVar = 20; // Instanzvariable
}
// instanceVar ist für jedes Objekt von MyClass sichtbar



     */




}
