package org.usfirst.frc5427.BlakeBot.subsystems;
import org.usfirst.frc5427.BlakeBot.RobotMap;
import org.usfirst.frc5427.BlakeBot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
    private final SpeedController frontRightMotor = RobotMap.driveTrainFrontRightMotor;
    private final SpeedController frontLeftMotor = RobotMap.driveTrainFrontLeftMotor;
    private final SpeedController backRightMotor = RobotMap.driveTrainBackRightMotor;
    private final SpeedController backLeftMotor = RobotMap.driveTrainBackLeftMotor;
    private final RobotDrive robotDrive4 = RobotMap.driveTrainRobotDrive4;
    
    //Initializes the default command to drive with joysticks.
    public void initDefaultCommand()
    {
        setDefaultCommand(new DriveWithJoystick());
    }
    
    //Gets the input of the joysticks.
    public void takeJoystickInput(Joystick joy)
    {
    	robotDrive4.arcadeDrive(joy);
    }
    
    //Stops the robot from moving.
    public void stop()
    {
    	robotDrive4.drive(0, 0);
    }
}

