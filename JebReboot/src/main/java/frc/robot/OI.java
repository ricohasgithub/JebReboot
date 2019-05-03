
package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;

public class OI {

    public static XboxController Driver = new XboxController(0);
    public static XboxController Operator = new XboxController(1);

    public static double getDriverSpeed () {
        return Driver.getTriggerAxis(Hand.kRight) - Driver.getTriggerAxis(Hand.kRight);
    }

    public static double getDriverTurn () {
        return Driver.getRawAxis(0);
    }

    public static double getArmTurn () {
        return Operator.getRawAxis(0);
    }

    public static boolean FrisbeeShoot () {
        return Operator.getAButton();
    }

}
