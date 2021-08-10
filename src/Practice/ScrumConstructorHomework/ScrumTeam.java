package Practice.ScrumConstructorHomework;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String SM;
    public ArrayList<TesterHw> testers;
    public ArrayList<DeveloperHw> developers;

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        testers = new ArrayList<>();
        developers = new ArrayList<>();
    }


    public String toString() {
        return "ScrumTeam{ " +
                "PO= '" + PO + '\'' +
                ", BA= '" + BA + '\'' +
                ", SM= '" + SM + '\'' +
                ", testers =" + testers.size() +
                ", developers =" + developers.size() +" "+
                '}';
    }


    public void hireTester(TesterHw tester){
        testers.add(tester);
    }

    public void hireTester(TesterHw[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void fireTester(int id){
        testers.removeIf(p -> p.id == id);
    }

    public void hireDeveloper(DeveloperHw developer){
        developers.add(developer);
    }

    public void hireDeveloper(DeveloperHw[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void fireDeveloper(int id){
        developers.removeIf(p -> p.id == id);
    }




}


