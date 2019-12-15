public class CreateDirecteur extends FactoryEnseignant {
    @Override
    protected Enseignant createEnseignant() {
        return new Directeur();
    }
}
