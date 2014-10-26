/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team484.henry.subsystems;

import edu.wpi.first.wpilibj.AnalogChannel;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team484.henry.RobotMap;
import org.team484.henry.commands.CommandBase;
import org.team484.henry.commands.DriveRobot;

/**
 *
 * @author kevin
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive driveTrain = new RobotDrive(RobotMap.leftWheel,RobotMap.rightWheel);
    Joystick joystick = new Joystick(RobotMap.joystick);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DriveRobot());
    }
    public void driveRobot() {
        if (CommandBase.ultrasonic.getVoltage() > RobotMap.ultrasonicVoltage) {
            driveTrain.arcadeDrive(-joystick.getY(), -joystick.getX());
        } else {
            driveTrain.arcadeDrive(0.3,0);
        }
        
    }
}
