package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimberConstants;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.ShooterConstants;
import frc.robot.commands.TankDrive;

public class ClimbingMechanism extends SubsystemBase{

    private PWMSparkMax randomMotor = new PWMSparkMax(ClimberConstants.mainMotorPort);
    private PWMSparkMax lessRandomMotor = new PWMSparkMax(ClimberConstants.secondaryMotorPort);

    public ClimbingMechanism()
    {
        System.out.println("Climbing mechanism instantiated");
    }


    public void grabOntoFirstRung()
    {
        extendMainArm(1);
        // do something
        
    }
    void extendMainArm(double distance)
    {

    }

    void retractMainArm(double distance)
    {

    }
   

    @Override
    public void periodic(){
        
    }

    @Override
    public void simulationPeriodic(){
        
    }
}
