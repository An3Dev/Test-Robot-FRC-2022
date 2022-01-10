// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{
    public static final class DriveConstants 
    {
        public static final int frontLeftMotorPort = 0;
        public static final int backLeftMotorPort = 1;
        public static final int frontRightMotorPort = 2;
        public static final int backRightMotorPort = 3;

        public static final double wheelDiameterInches = 8;
    }

    public static final class ShooterConstants
    {
        public static final int shooterMotorPort = 4;
        public static final int intakeMotorPort = 5;
    }

    public static final class ClimberConstants
    {
        public static final int mainMotorPort = 6;
        public static final int secondaryMotorPort = 7;
    }

    public static final class ControllerConstants
    {
        public static final int controllerPort = 0;

        public static final int leftStickPort = 1;
        public static final int rightStickPort = 2;

        public static final int westButtonPort = 3;
        public static final int northButtonPort = 4;
        public static final int eastButtonPort = 5;
        public static final int southButtonPort = 6;

        public static final int rightTriggerPort = 7;
        public static final int leftTriggerPort = 8;

        public static final int leftBumperPort = 9;
        public static final int rightBumperPort = 10;

    }
}
