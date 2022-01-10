// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.ControllerConstants;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveTrain;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
 // private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  //private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private DriveTrain driveTrainSubsystem = new DriveTrain();

  // controllers inputs
  Joystick controller = new Joystick(0);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    /**  Read this if you're confused about the lambda expression: () ->
     * A lambda expression is used with Classes called suppliers. In this case, we're using DoubleSuppliers
     * because the controller input is read as type double.
     * The TankDrive constructor has two DoubleSupplier parameters: leftStickInput and rightStickInput
     * When we pass in () -> controller.getY() and () -> controller.getRawAxis(3) as parameters below, 
     * we're basically creating mini-methods and passing these methods as parameters into the TankDrive constructor
     * So in the TankDrive class, whenever it needs to read the value of leftStickInput, it'll call the mini-method, which 
     * in this case would call controller.getY(). This value will then get passed as a double into the leftStickInput DoubleSupplier.
     */
    
    TankDrive tankDriveCommand = new TankDrive(() -> controller.getY(), () -> controller.getRawAxis(3), driveTrainSubsystem);
    driveTrainSubsystem.setDefaultCommand(tankDriveCommand);
  }

  private void configureButtonBindings() 
  {
    Joystick joystick = new Joystick(ControllerConstants.controllerPort);
    JoystickButton rightTrigger = new JoystickButton(joystick, ControllerConstants.rightTriggerPort);
    rightTrigger.whileHeld(new InstantCommand(driveTrainSubsystem::moveForward, driveTrainSubsystem));
  }

  public Command getAutonomousCommand() {
    // Executes command to call move forward method
    return new InstantCommand(driveTrainSubsystem::moveForward, driveTrainSubsystem);
  }
}
