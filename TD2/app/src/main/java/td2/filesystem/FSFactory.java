package main.java.td2.filesystem;

public class FSFactory {

    public final FSFactory instance = new FSFactory();

    private FSFactory()
    {
    }

    public FSFactory getInstance()
    {
        return this.instance;
    }

    public Composant createComposant(ComposantType type, String name, Owner owner)
    {
        Composant rtn;
        switch (type)
        {
            case FICHIER:
                rtn = new Fichier(name, owner);
            default:
                rtn = new Repertoire(name, owner);
        }
        return rtn;
    }
}
