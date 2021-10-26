package td2.forum.v2;

public interface IConteneur<T extends IContenu<T>> extends IForumObject {
    void add(IContenu<T> child);

    void remove(int index);

    int size();
}
