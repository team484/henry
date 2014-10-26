/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.team484.henry.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team484.henry.commands.CommandBase;
import org.team484.henry.commands.HornOff;

/**
 *
 * @author kevin
 */
public class Horn extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Relay horn = new Relay(7);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new HornOff());
    }
    public void hornOff() {
        horn.set(Relay.Value.kOff);
    }
    public void hornOn() {
        horn.set(Relay.Value.kForward);
    }
}
