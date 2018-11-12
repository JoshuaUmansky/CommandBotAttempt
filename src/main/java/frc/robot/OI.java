/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import frc.robot.commands.ExampleCommand;
public class OI {
  Joystick stick = new Joystick(1); //get joystick
  Button button1 = new JoystickButton(stick, 1); //get button on joystick (Button 1, Trigger)
      public OI(){
        button1.whileHeld(new ExampleCommand()); //runs command when button is held
  }
}
