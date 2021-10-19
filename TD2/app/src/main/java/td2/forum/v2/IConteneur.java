package main.java.td2.forum.v2;

public interface IConteneur {
    public void add(T child);
    public void remove(int index);
    public int size();
}
