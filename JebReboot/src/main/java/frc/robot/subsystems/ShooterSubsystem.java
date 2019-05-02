
package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class ShooterSubsystem extends Subsystem {
 
  public TalonSRX Shooter = new TalonSRX(RobotMap.Shooter);

  public void initDefaultCommand() {
  }

  public void Shoot () {
    Shooter.set(ControlMode.PercentOutput, 0.5);
  }

}
