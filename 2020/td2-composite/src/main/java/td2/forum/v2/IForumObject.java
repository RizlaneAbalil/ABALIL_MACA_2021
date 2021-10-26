package td2.forum.v2;

public interface IForumObject {
    String sujet();

    String contenu();

    String typeRepr();

    default String repr() {
        return String.format("%s: %s\n%s", typeRepr(), sujet(), contenu());
    }

}
