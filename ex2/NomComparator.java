import java.util.Comparator;

public class NomComparator implements Comparator<etudiant> {
    
    public int compare(etudiant e1, etudiant e2) {
    return e1.getNom().compareTo(e2.getNom());}
    }