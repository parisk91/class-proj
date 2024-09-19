package gr.aueb.cl.ch17.knight;

public class Knight implements IKnight {

    @Override
    public void embarkOnMission(IMission mission) {//anonymus class
        mission.embark();
    }
}