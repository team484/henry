package org.team484.henry;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    public static final int joystick = 1; //Joystick port
    public static final int hornButton = 3; //Button
    public static final int leftWheel = 4; //PWM
    public static final int rightWheel = 3; //PWM
    public static final int horn = 7; //Relay
    public static final int LEDs = 5; //Relay
    public static final int Lights = 3; //Relay
    public static final int ultrasonic = 1; //Analog Input
    public static final double ultrasonicVoltage = 0.0; //Voltage for close object
}
