import java.util.ArrayList;
import java.util.Comparator;


public class etudiant implements IStatisticable, Comparable<etudiant> {
    private String matricule;
    private String nom;
    private ArrayList<note> listenote;

    public etudiant(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
        listenote= new ArrayList();
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public ArrayList<note> getListenote() {
        return listenote;
    }
    public void setListenote(ArrayList<note> listenote) {
        this.listenote = listenote;
    }

    public String toString(){
        return "etudiant{"+matricule+"/"+nom+"/"+getValue()+"}";
    }

    void addNote(note n){
        listenote.add(n);
    }

    public float getValue(){
        float moy=0;
        for(int i=0;i<listenote.size();i++)
        {
            moy+=listenote.get(i).getNote();
        }
        return moy/listenote.size();

    }

    public double getMinNote(){
        double min=listenote.get(0).getNote();
        for(int i=0;i<listenote.size();i++)
        {
            if (listenote.get(i).getNote()<min){
                min=listenote.get(i).getNote();
            }
        }
        return min;

    }
    
    public double getMaxNote(){
        double max=listenote.get(0).getNote();
        for(int i=0;i<listenote.size();i++)
        {
            if (listenote.get(i).getNote()>max){
                max=listenote.get(i).getNote();
            }
        }
        return max;
    }

    public int compareTo(etudiant e){
        if (this.getValue()>e.getValue()){
            return 1;
        }
        if (this.getValue()<e.getValue()){
            return -1;
        }
        return 0;
    }
    

    

}