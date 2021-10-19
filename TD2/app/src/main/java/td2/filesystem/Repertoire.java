package main.java.td2.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends ComposantImpl implements Composite<Composant>{

    private List<Composant> children;

    public Repertoire(String name, Owner owner) {
        super(name, owner);
        this.children = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return this.children.size();
    }

    @Override
    public String getContent() {
        //On retourne un tableau String qui contient le nom des children
        List<String> listNameFile = new ArrayList<>();
        for(Composant c : this.children)
        {
            listNameFile.add(c.getName() + ",");
        }
        return listNameFile.toString();
    }

    @Override
    public void appendContent(String name) {
        //throw new Exception("ERREUR");
    }

    @Override
    public boolean isComposite() {
        return true;
    }

    @Override
    public List<Composant> getChildren() {
        return this.children;
    }

    @Override
    public void addChild(Composant composant) {
        this.children.add(composant);
    }

    @Override
    public boolean removeChild(Composant composant) {
        return this.children.remove(composant);
    }

    @Override
    public boolean removeChildren(List<Composant> t) {
        return this.children.removeAll(t);
    }
}
