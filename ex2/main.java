import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
public class main {
    public static void main(String[] args) {
        ArrayList <etudiant> ve = new ArrayList <>();
		stats s = new stats();
		
        ve.add(new etudiant("123","soumaya"));
        ve.get(0).addNote(new note("math",12));
        ve.get(0).addNote(new note("geo",14));
        ve.add(new etudiant("123","amal"));
        ve.get(1).addNote(new note("math",16));
        ve.get(1).addNote(new note("geo",13));

        ve.add(new etudiant("123","ahmed"));
        ve.get(2).addNote(new note("histoire",11));
        ve.get(2).addNote(new note("geo",7));

        s.afficherStatsEtudiants(ve);
        System.out.println("max classe"+ s.getMaximumGroupe(ve));
        System.out.println("min classe"+ s.getMinimumGroupe(ve));

        System.out.println(ve);
        Collections.sort(ve);
        System.out.println(ve);

        NomComparator cn = new NomComparator();
        Collections.sort(ve,cn);
        System.out.println(ve);

    }
}
