// @author Ethan Bennikutty

package org.usfirst.frc5427.TheLittleRobotThatCould.subsystems;

import org.usfirst.frc5427.TheLittleRobotThatCould.RobotMap;
import org.usfirst.frc5427.TheLittleRobotThatCould.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {
    private final SpeedController frontLeftMotor = RobotMap.driveTrainfrontLeftMotor;
    private final SpeedController frontRightMotor = RobotMap.driveTrainfrontRightMotor;
    private final SpeedController backLeftMotor = RobotMap.driveTrainbackLeftMotor;
    private final SpeedController backRightMotor = RobotMap.driveTrainbackRightMotor;
    private final RobotDrive robotDriveController = RobotMap.driveTrainRobotDriveController;

    public void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }
    
    public void takeJoystickInputs(Joystick stick){
    	robotDriveController.arcadeDrive(stick);
    }
    
    public void stop(){
    	robotDriveController.arcadeDrive(0, 0);
    }
}

