public class CreateProfesseur extends FactoryEnseignant {
    @Override
    protected Enseignant createEnseignant() {
        return new Professeur();
    }
}
