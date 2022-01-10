package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class TankDrive extends CommandBase
{
    boolean isFinished = false;
    DriveTrain driveTrainSubsystem;

    DoubleSupplier leftSpeedInput, rightSpeedInput;

    public TankDrive(DoubleSupplier leftSpeedInput, DoubleSupplier rightSpeedInput, DriveTrain driveTrain)
    {
        this.leftSpeedInput = leftSpeedInput;
        this.rightSpeedInput = rightSpeedInput;
        driveTrainSubsystem = driveTrain;
        addRequirements(driveTrainSubsystem);
    }

    @Override
    public void initialize()
    {
        System.out.println("Initialized tank drive command");
    }

    @Override
    public void execute() 
    {       
        driveTrainSubsystem.tankDrive(leftSpeedInput.getAsDouble(), rightSpeedInput.getAsDouble());
    }

    @Override
    public boolean isFinished()
    {
        return isFinished;
    }

    @Override
    public void end(boolean interrupted) {}
}