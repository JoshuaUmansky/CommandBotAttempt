/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ExampleCommand;
import edu.wpi.first.wpilibj.*;

public class ExampleSubsystem extends Subsystem { 
  private Talon exampleTalon = new Talon(1); //initilizes motor

  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new ExampleCommand()); //sets default command pairing
  }
  public void open(){ //when run talonmotorspin.open will spin motor forward
    exampleTalon.set(0.5);
  }
  public void close(){ //when run talonmotorspin.close will spin motor backward
    exampleTalon.set(-0.5);
  }
  public void stop(){ //when run talonmotorspin.stop will stop motor
    exampleTalon.set(0);
  }
}
