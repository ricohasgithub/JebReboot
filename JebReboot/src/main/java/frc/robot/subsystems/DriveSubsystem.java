
package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;

public class DriveSubsystem extends Subsystem {
 
  public TalonSRX Left1 = new TalonSRX(RobotMap.Left1);
  public TalonSRX Left2 = new TalonSRX(RobotMap.Left2);
  public TalonSRX Right1 = new TalonSRX(RobotMap.Right1);
  public TalonSRX Right2 = new TalonSRX(RobotMap.Right2);

  public void initDefaultCommand() {
    Left2.set(ControlMode.Follower, RobotMap.Left1);
    Right2.set(ControlMode.Follower, RobotMap.Right1);
  }

  // Basic Tank Drive Method
  public void TankDrive(double left, double right){
    Left1.set(ControlMode.PercentOutput, left * 0.8);
    Left2.set(ControlMode.PercentOutput, -left * 0.8);
    Right1.set(ControlMode.PercentOutput, -right * 0.8);
    Right2.set(ControlMode.PercentOutput, right * 0.8);
  }
  
  // Basic Arcade Drive Method
  public void ArcadeDrive (double speed, double turn) {
		TankDrive(speed - turn, - speed - turn);
  }

}
