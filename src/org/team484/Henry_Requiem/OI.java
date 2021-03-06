
package org.team484.henry;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.team484.henry.commands.DriveRobot;
import org.team484.henry.commands.HeadlightOff;
import org.team484.henry.commands.HeadlightOn;
import org.team484.henry.commands.HornOff;
import org.team484.henry.commands.HornOn;
import org.team484.henry.commands.LEDsOff;
import org.team484.henry.commands.LEDsOn;
import org.team484.henry.commands.creepRobot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    Joystick joystick = new Joystick(RobotMap.joystick);
    Joystick buttonBox = new Joystick(RobotMap.buttonBox);
    Button useHorn = new JoystickButton(buttonBox, RobotMap.hornButton);
    Button creep = new JoystickButton(joystick, RobotMap.creepButton);
    Button LEDs = new JoystickButton(buttonBox, RobotMap.lEDsButton);
    Button headLights = new JoystickButton(buttonBox, RobotMap.headlightButton);
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    public OI() {
        useHorn.whileHeld(new HornOn());
        useHorn.whenReleased(new HornOff());
        LEDs.whenPressed(new LEDsOn());
        LEDs.whileHeld(new LEDsOn());
        LEDs.whenReleased(new LEDsOff());
        
        headLights.whenPressed(new HeadlightOn());
        headLights.whileHeld(new HeadlightOn());
        headLights.whenReleased(new HeadlightOff());
        
        creep.whenPressed(new creepRobot());
        creep.whileHeld(new creepRobot());
        creep.whenReleased(new DriveRobot());
    }    
}

