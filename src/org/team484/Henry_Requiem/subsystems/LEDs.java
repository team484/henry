/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team484.henry.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team484.henry.RobotMap;
import org.team484.henry.commands.LEDsOff;

/**
 *
 * @author kevin
 */
public class LEDs extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Relay LEDs = new Relay(RobotMap.LEDs);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new LEDsOff());
    }
    public void LEDsOn() {
        LEDs.set(Relay.Value.kForward);
    }
    public void LEDsOff() {
        LEDs.set(Relay.Value.kOff);
    }
}
