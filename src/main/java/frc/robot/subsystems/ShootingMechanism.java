package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;
import frc.robot.Constants.ShooterConstants;
import frc.robot.commands.TankDrive;

public class ShootingMechanism extends SubsystemBase{

    private PWMSparkMax shooter = new PWMSparkMax(ShooterConstants.shooterMotorPort);
    private PWMSparkMax intake = new PWMSparkMax(ShooterConstants.intakeMotorPort);

    public ShootingMechanism()
    {
        System.out.println("Shooting mechanism instantiated");
    }

    public void shoot(double volts)
    {
        shooter.setVoltage(volts);
        System.out.println("shoot");
    }

    public void intake(double volts)
    {
        intake.setVoltage(volts);
        System.out.println("intake");
    }

    @Override
    public void periodic(){
        
    }

    @Override
    public void simulationPeriodic(){
        
    }
}
