package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CoralIntake extends SubsystemBase {

  // no bindings
  private CoralIntakeIO io;
  private boolean intakeSensor;

  public CoralIntake(CoralIntakeIO io) {
    this.io = io;
  }

  @Override
  public void periodic() {
    intakeSensor = io.checkSensor();
  }

  public void stop() {
    io.stop();
  }
}
