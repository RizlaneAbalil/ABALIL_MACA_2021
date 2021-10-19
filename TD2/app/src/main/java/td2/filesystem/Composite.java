package main.java.td2.filesystem;

import java.util.List;

public interface Composite<T> {
    public List<T> getChildren();

    public void addChild(T t);

    public boolean removeChild(T t);

    public boolean removeChildren(List<T> t);
}
