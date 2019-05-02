
package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ArmSubsystem extends Subsystem {
 
  public TalonSRX Arm = new TalonSRX(RobotMap.Arm);

  public void initDefaultCommand() {
  }

  public void MoveArmVariable (double power) {
    Arm.set(ControlMode.PercentOutput, power);
  }

}
