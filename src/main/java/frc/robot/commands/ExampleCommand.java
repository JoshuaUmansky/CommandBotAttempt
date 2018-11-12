/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ExampleCommand extends Command {
  public ExampleCommand() {
    requires(Robot.talonmotorspin); //sets subsystem as a requirement
  }
  @Override
  protected void initialize() {
  } 
  @Override
  protected void execute() {
    Robot.talonmotorspin.open(); //when command runs, will spin motor forward
  }
  @Override
  protected boolean isFinished() {
    return false;
  }
  @Override
  protected void end() {
    Robot.talonmotorspin.stop(); //when command stops running, will stop motor
  }
  @Override
  protected void interrupted() { //if command gets interrupted, runs end function above
    end();
  }
}
