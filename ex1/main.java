public class main {
    public static void main(String[] args) {
        TacheElementaire tache1 = new TacheElementaire("Tache1", 10);
        TacheElementaire tache2 = new TacheElementaire("Tache2", 15);

        TacheComplexe tacheComplexe = new TacheComplexe("TacheComplexe");
        tacheComplexe.ajouter(tache1);
        tacheComplexe.ajouter(tache2);

        System.out.println("Coût total de la tâche complexe : " + tacheComplexe.getCout());
    }
    
}
