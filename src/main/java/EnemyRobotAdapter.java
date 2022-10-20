public class EnemyRobotAdapter implements EnemyAttacker{

    EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot newRobot){
        theRobot =newRobot;

    }

    @Override
    public void fireWeapon() {
        theRobot.smashWithHands();

    }

    @Override
    public void driveFoward() {
        theRobot.walkFoward();
    }

    @Override
    public void assignDriver(String driverName) {
        theRobot.reactToHuman(driverName);
    }
}
