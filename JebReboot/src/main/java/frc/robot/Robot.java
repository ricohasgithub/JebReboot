
package frc.robot;

import frc.robot.subsystems.*;
import frc.robot.commands.*;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

  public static DriveSubsystem DriveSubsystem = new DriveSubsystem();
  public static ArmSubsystem ArmSubsystem = new ArmSubsystem();
  public static ShooterSubsystem ShooterSubsystem = new ShooterSubsystem();

  public static DriveCommand DriveCommand;
  public static ArmCommand ArmCommand;
  public static ShooterCommand ShooterCommand;
  
  public void robotInit() {
    DriveCommand = new DriveCommand();
    ArmCommand = new ArmCommand();
    ShooterCommand = new ShooterCommand();
  }
 
  public void robotPeriodic() {
  }

  public void autonomousInit() {
  }

  public void autonomousPeriodic() {
  }

  public void teleopInit () {
    DriveCommand.start();
    ArmCommand.start();
    ShooterCommand.start();
  }

  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  public void testPeriodic() {
  }
}
