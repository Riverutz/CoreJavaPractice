package javaexercises.abstractionfootballteam;

import java.util.ArrayList;
import java.util.List;

public class RomanianFootballTeam {
    private String teamName;

    private List<Goalkeeper> goalkeepers = new ArrayList<>();
    private List<CentralDefenderPlayer> centralDefenders = new ArrayList<>();
    private List<FullBackPlayer> fullBacks = new ArrayList<>();
    private List<CentralMidfielderPlayer> centralMidfielders = new ArrayList<>();
    private List<DefensiveMidfielderPlayer> defensiveMidfielders = new ArrayList<>();
    private List<WingerMidfielderPlayer> wingerMidfielders = new ArrayList<>();
    private List<CentralStriker> centralStrikers = new ArrayList<>();
    private List<Winger> wingers = new ArrayList<>();

    private HeadCoachImpl headCoach;
    private AssistantCoachImpl assistantCoach;
    private DoctorImpl doctor;
    private PhysiotherapistImpl physiotherapist;
    private VideoAnalystImpl videoAnalyst;
    private AdministrativeStaffImpl administrativeStaff;

    public RomanianFootballTeam(String teamName) {
        this.teamName = teamName;
    }

    // --- Setters ---

    public void setHeadCoach(HeadCoachImpl headCoach) {
        this.headCoach = headCoach;
    }

    public void setAssistantCoach(AssistantCoachImpl assistantCoach) {
        this.assistantCoach = assistantCoach;
    }

    public void setDoctor(DoctorImpl doctor) {
        this.doctor = doctor;
    }

    public void setPhysiotherapist(PhysiotherapistImpl physiotherapist) {
        this.physiotherapist = physiotherapist;
    }

    public void setVideoAnalyst(VideoAnalystImpl videoAnalyst) {
        this.videoAnalyst = videoAnalyst;
    }

    public void setAdministrativeStaff(AdministrativeStaffImpl administrativeStaff) {
        this.administrativeStaff = administrativeStaff;
    }

    public void addGoalkeeper(Goalkeeper gk) {
        goalkeepers.add(gk);
    }

    public void addCentralDefender(CentralDefenderPlayer cd) {
        centralDefenders.add(cd);
    }

    public void addFullBack(FullBackPlayer fb) {
        fullBacks.add(fb);
    }

    public void addCentralMidfielder(CentralMidfielderPlayer cm) {
        centralMidfielders.add(cm);
    }

    public void addDefensiveMidfielder(DefensiveMidfielderPlayer dm) {
        defensiveMidfielders.add(dm);
    }

    public void addWingerMidfielder(WingerMidfielderPlayer wm) {
        wingerMidfielders.add(wm);
    }

    public void addCentralStriker(CentralStriker cs) {
        centralStrikers.add(cs);
    }

    public void addWinger(Winger w) {
        wingers.add(w);
    }

    // --- Team actions ---

    public void startMatch() {
        System.out.println("\n=== " + teamName + " starts the match! ===\n");

        goalkeepers.forEach(Goalkeeper::saveShot);
        centralDefenders.forEach(CentralDefenderPlayer::blockAttacks);
        fullBacks.forEach(FullBackPlayer::coverFlanks);
        centralMidfielders.forEach(CentralMidfielderPlayer::controlCenterOfField);
        defensiveMidfielders.forEach(DefensiveMidfielderPlayer::initiateAttack);
        wingerMidfielders.forEach(WingerMidfielderPlayer::playOnFlanks);
        centralStrikers.forEach(CentralStriker::playInFrontOfOpponentGoal);
        wingers.forEach(Winger::createOpportunities);

        if (headCoach != null) headCoach.guide();
        if (assistantCoach != null) assistantCoach.trainFitness();
        if (doctor != null) doctor.provideMedicalCare();
        if (physiotherapist != null) physiotherapist.preventInjuries();
        if (videoAnalyst != null) videoAnalyst.analyzeVideo();
        if (administrativeStaff != null) administrativeStaff.manageLogistics();
        if (administrativeStaff != null) administrativeStaff.manageMatchSchedules();
    }

    public String getTeamName() {
        return teamName;
    }
}
