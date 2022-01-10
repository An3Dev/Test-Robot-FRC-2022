package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveTrain extends SubsystemBase{

    private PWMSparkMax frontLeftMotor = new PWMSparkMax(DriveConstants.frontLeftMotorPort);
    private PWMSparkMax backLeftMotor = new PWMSparkMax(DriveConstants.backLeftMotorPort);
    private PWMSparkMax frontRightMotor = new PWMSparkMax(DriveConstants.frontRightMotorPort);
    private PWMSparkMax backRightMotor = new PWMSparkMax(DriveConstants.backRightMotorPort);
  
    private MotorControllerGroup leftMotorControllerGroup = new MotorControllerGroup(frontLeftMotor, backLeftMotor);
    private MotorControllerGroup rightMotorControllerGroup = new MotorControllerGroup(frontRightMotor, backRightMotor);
  
    private DifferentialDrive differentialDrive;

    public DriveTrain()
    {
        System.out.println("Drive train instantiated");
        
        rightMotorControllerGroup.setInverted(true);
        differentialDrive = new DifferentialDrive(leftMotorControllerGroup, rightMotorControllerGroup);
    }

    public void moveForward()
    {
        System.out.println("Move forward");
    }

    public void tankDrive(double leftSpeed, double rightSpeed)
    {
        differentialDrive.tankDrive(leftSpeed, rightSpeed);
    }

    @Override
    public void periodic(){
        
    }

    @Override
    public void simulationPeriodic(){
        
    }
}
