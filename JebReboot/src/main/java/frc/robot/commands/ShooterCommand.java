
package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class ShooterCommand extends Command {

  public ShooterCommand() {
    requires(Robot.ShooterSubsystem);
  }

  protected void initialize() {
  }

  protected void execute() {
    if (OI.FrisbeeShoot()) {
      Robot.ShooterSubsystem.Shoot();
    }
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
