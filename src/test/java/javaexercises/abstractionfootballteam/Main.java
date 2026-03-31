package javaexercises.abstractionfootballteam;

public class Main {
    public static void main(String[] args) {

        RomanianFootballTeam team = new RomanianFootballTeam("Romania National Team");

        // Goalkeeper
        Goalkeeper gk = new Goalkeeper("Florin", "Nita", 36, 1.90);
        team.addGoalkeeper(gk);

        // Defenders
        CentralDefenderPlayer cd1 = new CentralDefenderPlayer("Radu", "Dragusin", 22, 1.91);
        team.addCentralDefender(cd1);

        FullBackPlayer fb1 = new FullBackPlayer("Andrei", "Ratiu", 26, 1.78);
        team.addFullBack(fb1);

        // Midfielders
        CentralMidfielderPlayer cm1 = new CentralMidfielderPlayer("Marius", "Marin", 27, 1.75);
        team.addCentralMidfielder(cm1);

        DefensiveMidfielderPlayer dm1 = new DefensiveMidfielderPlayer("Nicolae", "Stanciu", 31, 1.76);
        team.addDefensiveMidfielder(dm1);

        WingerMidfielderPlayer wm1 = new WingerMidfielderPlayer("Valentin", "Mihaila", 24, 1.74);
        team.addWingerMidfielder(wm1);

        // Attackers
        CentralStriker cs1 = new CentralStriker("George", "Puskas", 25, 1.80);
        team.addCentralStriker(cs1);

        Winger w1 = new Winger("Florinel", "Coman", 26, 1.74);
        team.addWinger(w1);

        // Staff
        HeadCoachImpl coach = new HeadCoachImpl("Edward", "Iordanescu", 45, 1.78);
        team.setHeadCoach(coach);

        AssistantCoachImpl assistantCoach = new AssistantCoachImpl("Adrian", "Mihalcea", 40, 1.75);
        team.setAssistantCoach(assistantCoach);

        DoctorImpl doctor = new DoctorImpl("Ioan", "Cristea", 50, 1.80);
        team.setDoctor(doctor);

        PhysiotherapistImpl physio = new PhysiotherapistImpl("Mihai", "Popescu", 35, 1.77);
        team.setPhysiotherapist(physio);

        VideoAnalystImpl analyst = new VideoAnalystImpl("Andrei", "Dumitrescu", 30, 1.76);
        team.setVideoAnalyst(analyst);

        AdministrativeStaffImpl admin = new AdministrativeStaffImpl("Elena", "Ionescu", 40, 1.65);
        team.setAdministrativeStaff(admin);

        team.startMatch();
    }
}
