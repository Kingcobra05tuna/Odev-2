package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.feeder;

public class feederCmd extends Command {
  feeder mFeeder;
  double mSpeed;
  public feederCmd(feeder feederMotor, double speed) {
    this.mFeeder = feederMotor;
    this.mSpeed = speed;
    addRequirements(mFeeder);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    mFeeder.setFeeder(mSpeed);
  }

  @Override
  public void end(boolean interrupted) {
    mFeeder.setFeeder(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
