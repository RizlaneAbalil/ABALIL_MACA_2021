package main.java.td2.forum.v1;
import java.util.*;

public class Forum {
    private final String topic;
    private List<Theme> children;

    public Forum(String topic)
    {
        this.topic = topic;
        this.children = new ArrayList<>();
    }

    public String sujet()
    {
        return this.topic;
    }

    public void add(Theme child)
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
        String str = topic;
        return str;
    }
}
