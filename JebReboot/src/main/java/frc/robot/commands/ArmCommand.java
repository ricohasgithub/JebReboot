
package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.OI;

import edu.wpi.first.wpilibj.command.Command;

public class ArmCommand extends Command {

  public ArmCommand() {
    requires(Robot.ArmSubsystem);
  }

  protected void initialize() {
  }

  protected void execute() {
  }

  protected boolean isFinished() {
    return false;
  }

  protected void end() {
  }

  protected void interrupted() {
  }
}
