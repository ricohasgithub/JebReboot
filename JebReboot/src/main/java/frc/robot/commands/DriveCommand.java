
package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class DriveCommand extends Command {

  public DriveCommand() {
    requires(Robot.DriveSubsystem);
  }

  protected void initialize() {
  }

  protected void execute() {
    Robot.DriveSubsystem.ArcadeDrive(OI.getDriverSpeed(), OI.getDriverSteer());
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
