package frc.robot;

import frc.robot.commands.feederCmd;
import frc.robot.commands.intakeCmd;
import frc.robot.subsystems.feeder;
import frc.robot.subsystems.intake;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Robot's subsystems and commands:
  private final PS5Controller ps5Controller = new PS5Controller(0);
  intake intake = new intake();
  feeder feeder = new feeder();

  public RobotContainer() {
    configureBindings();
  }

private void configureBindings() {
    new JoystickButton(ps5Controller, 1).whileTrue(new ParallelCommandGroup(new intakeCmd(intake, 1), new feederCmd(feeder, 0.5)));
    new JoystickButton(ps5Controller, 2).whileTrue(new ParallelCommandGroup(new intakeCmd(intake, -1), new feederCmd(feeder, -0.5)));
  }
}

// parallel command group found in https://docs.wsr.studica.com/en/latest/docs/Software/programming/autonomous/auto-basics/command-groups/parallel-command-group.html