package main.java.td2.forum.v2;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    private final String topic;
    private List<Salon> children;

    public Theme(String topic)
    {
        this.topic = topic;
        this.children = new ArrayList<>();
    }

    public String sujet()
    {
        return this.topic;
    }

    public void add(Salon child)
    {
        this.children.add(child);
    }

    public void remove(int index)
    {
        this.children.remove(index);
    }

    public int size()
    {
        return this.children.size();
    }

    public String toString()
    {
        String str = topic ;
        return str;
    }
}
