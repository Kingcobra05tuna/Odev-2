package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class intake extends SubsystemBase {
  Talon taloncuk = new Talon(1);
  public intake() {}

  public void setIntake(double speed) {
    taloncuk.set(speed);
  }

  @Override
  public void periodic() {
    // will be called once per scheduler run
  }
}
