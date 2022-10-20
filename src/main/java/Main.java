public class Main {
    public static void main(String[] args) {

        EnemyTank newTank=new EnemyTank();
        EnemyRobot fredTheRobot=new EnemyRobot();
        EnemyAttacker robotAdapter=new EnemyRobotAdapter(fredTheRobot);

        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Jazmin");
        fredTheRobot.walkFoward();
        fredTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");

        newTank.assignDriver("Aqil");
        newTank.driveFoward();
        newTank.fireWeapon();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("Sam");
        robotAdapter.driveFoward();
        robotAdapter.fireWeapon();



    }


}
