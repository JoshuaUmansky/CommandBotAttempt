/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import frc.robot.subsystems.ExampleSubsystem;

public class Robot extends TimedRobot {
  public static ExampleSubsystem talonmotorspin = new ExampleSubsystem(); //define subsystem
  public static OI oi; //define OI
  @Override
  public void robotInit() {
    oi = new OI();//initilize the OI
  }
  @Override
  public void robotPeriodic() {
  }
  @Override
  public void disabledInit() {
  }
  @Override
  public void disabledPeriodic() {   
  }
  @Override
  public void autonomousInit() {   
  }  
  @Override
  public void autonomousPeriodic() {   
  }
  @Override
  public void teleopInit() {  
  }
  @Override
  public void teleopPeriodic() {  
  }
  @Override
  public void testPeriodic() {
  }
}
