import java.util.ArrayList;

public class stats{
    public static void afficherStatsEtudiants(ArrayList<etudiant> l)
    {
        for (etudiant e:l){
            System.out.println(e.getValue());
            System.out.println(e.getMinNote());
            System.out.println(e.getMaxNote());
        }
    }

    public float getMoyenneGroupe (ArrayList<etudiant>l){
        float moy=0;
        for (etudiant e:l){
            moy+=e.getValue();
        }
        return moy/l.size();
    }

    public float getMaximumGroupe (ArrayList<etudiant>l){
        float max=l.get(0).getValue();
        for (etudiant e:l){
            if (max< e.getValue()){
                max=e.getValue();
            }
        }
        return max;
    }

    public float getMinimumGroupe (ArrayList<etudiant>l){
        float min=l.get(0).getValue();
        for (etudiant e:l){
            if (min> e.getValue()){
                min=e.getValue();
            }
        }
        return min;
    }
}