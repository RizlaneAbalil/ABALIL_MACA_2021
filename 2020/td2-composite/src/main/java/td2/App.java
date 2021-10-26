package td2;

import td2.filesystem.FSFactory;
import td2.filesystem.Owner;
import td2.filesystem.Composant;
import td2.filesystem.ComposantType;
import td2.forum.v2.*;

public final class App {

    public static void question1() {
        System.out.println("** question 1 **");
        FSFactory fsFactory = FSFactory.getInstance();
        Owner owner1 = new Owner("Sarah");
        Composant f1 = fsFactory.createComposant(ComposantType.FICHIER, "Fichier 1", owner1);
        Composant r1 = fsFactory.createComposant(ComposantType.REPERTOIRE, "Repertoire 1", owner1);
        if (r1.isComposite())
            ((td2.filesystem.Composite<Composant>) r1).addChild(f1);
        f1.appendContent("Hello World\n");
        f1.appendContent("How are you doing?");
        System.out.println(r1);
        System.out.println(f1);
    }

    public static void question2v1() {
        System.out.println("** question 2 (main.java.td2.forum.v1) **");
        td2.forum.v1.Forum forum = new td2.forum.v1.Forum("Programmation orientée objet");
        td2.forum.v1.Theme theme1 = new td2.forum.v1.Theme("Constructeurs");
        td2.forum.v1.Theme theme2 = new td2.forum.v1.Theme("Design patterns");
        td2.forum.v1.Salon salon1 = new td2.forum.v1.Salon("Héritage");
        td2.forum.v1.Salon salon2 = new td2.forum.v1.Salon("Composition");
        td2.forum.v1.Salon salon3 = new td2.forum.v1.Salon("Pattern Composite");
        td2.forum.v1.Message message1 = new td2.forum.v1.Message("J’ai un problème", "voila, j’ai essayé ...");
        td2.forum.v1.Message message2 = new td2.forum.v1.Message("Au secours", "ça marche pas ...");
        td2.forum.v1.Message message3 = new td2.forum.v1.Message("Différence ?", "quelle est la différence entre l’aggrégation et la composition ");
        td2.forum.v1.Message message4 = new td2.forum.v1.Message("Question", "quand utilise-t-on le pattern composite ?");
        forum.add(theme1);
        forum.add(theme2);
        theme1.add(salon1);
        theme1.add(salon2);
        theme2.add(salon3);
        salon1.add(message1);
        salon1.add(message2);
        salon2.add(message3);
        salon3.add(message4);
        System.out.println(forum.toString());
    }

    public static void question2v2() {
        System.out.println("** question 2 (v2) **");
        IConteneur<Theme> forum = new Forum("Programmation orientée objet");
        IContenu<Theme> theme1 = new Theme("Constructeurs");
        IContenu<Theme> theme2 = new Theme("Design patterns");
        IContenu<Salon> salon1 = new Salon("Héritage");
        IContenu<Salon> salon2 = new Salon("Composition");
        IContenu<Salon> salon3 = new Salon("Pattern Composite");
        IContenu<Message> message1 = new Message("J’ai un problème", "voila, j’ai essayé ...");
        IContenu<Message> message2 = new Message("Au secours", "ça marche pas ...");
        IContenu<Message> message3 = new Message("Différence ?", "quelle est la différence entre l’aggrégation et la composition ");
        IContenu<Message> message4 = new Message("Question", "quand utilise-t-on le pattern composite ?");
        forum.add(theme1);
        forum.add(theme2);
        ((IConteneur<Salon>)theme1).add(salon1);
        ((IConteneur<Salon>)theme1).add(salon2);
        ((IConteneur<Salon>)theme2).add(salon3);
        ((IConteneur<Message>)salon1).add(message1);
        ((IConteneur<Message>)salon1).add(message2);
        ((IConteneur<Message>)salon2).add(message3);
        ((IConteneur<Message>)salon3).add(message4);
        System.out.println(forum.toString());
    }
    
    public static void main(String[] args) {
        question1();
        question2v1();
        question2v2();
    }

}
