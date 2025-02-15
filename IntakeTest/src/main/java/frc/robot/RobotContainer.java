// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.subsystems.CoralIntake;
import frc.robot.subsystems.CoralIntakeIO;

public class RobotContainer {
  private CoralIntake coralIntake;

  public RobotContainer() {
    coralIntake = new CoralIntake(new CoralIntakeIO(1, 2, 0));
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
