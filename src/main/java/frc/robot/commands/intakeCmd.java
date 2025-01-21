package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.intake;

public class intakeCmd extends Command {
  intake mIntake;
  double mSpeed;
  public intakeCmd(intake intakeMotor, double speed) {
    this.mIntake = intakeMotor;
    this.mSpeed = speed;
    addRequirements(mIntake);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    mIntake.setIntake(mSpeed);
  }

  @Override
  public void end(boolean interrupted) {
    mIntake.setIntake(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
