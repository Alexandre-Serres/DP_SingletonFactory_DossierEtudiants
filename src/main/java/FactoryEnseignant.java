public abstract class FactoryEnseignant {

    public Enseignant createEnseignant(String name){
        Enseignant enseignant = createEnseignant();
        enseignant.setName(name);
        return enseignant;
    }

    protected abstract Enseignant createEnseignant();
}
