/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main.java.td2;

import main.java.td2.filesystem.FSFactory;
import main.java.td2.filesystem.Owner;
import main.java.td2.filesystem.Composant;
import main.java.td2.filesystem.ComposantType;
import main.java.td2.filesystem.Composite;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        FSFactory fsFactory = FSFactory.getInstance();
        Owner owner1 = new Owner("Sarah");
        Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
        Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);
        ((Composite<Composant>)r1).addChild(f1);
        f1.appendContent("Hello World\n");
        f1.appendContent("How are you doing?");
        System.out.println(r1);
        System.out.println(f1);

    }
}
