import java.util.ArrayList;
import java.util.Collection;

public class TacheComplexe implements Tache{
private String nom;
    private Collection<Tache> sousTaches;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<>();
    }

    public void ajouter(Tache sousTache) {
        sousTaches.add(sousTache);
    }

    public void supprimer(Tache sousTache) {
        sousTaches.remove(sousTache);
    }

    
    public String getNom() {
        return nom;
    }

    
    public int getCout() {
        int coutTotal = 0;
        for (Tache sousTache : sousTaches) {
            coutTotal += sousTache.getCout();
        }
        return coutTotal;
    }
}