package td2.forum.v2;

public class Theme extends Conteneur<Salon> implements IContenu<Theme>, IConteneur<Salon> {

    public Theme(String sujet) {
        super(sujet);
    }

    @Override
    public String typeRepr() {
        return "Theme";
    }

}
