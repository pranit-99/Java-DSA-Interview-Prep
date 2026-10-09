/*Guided Problem 9 — Smart Home Device System

Now we'll learn another important concept:

A child class can override a concrete method from an abstract parent, in addition to being required to implement its abstract methods.

So far:

Abstract method → must be implemented by a concrete child.
Concrete method → child can simply inherit it.
Now → child can also choose to override that concrete method.
Problem Statement

A smart-home application controls different devices:

SmartLight
SmartAC

Every smart device must implement:

abstract void turnOn();

The parent class also provides a normal method:

void showStatus()

with a default message:

Device is connected to the Smart Home System

For this problem:

SmartLight

Implements turnOn()
Uses the parent's existing showStatus()

SmartAC

Implements turnOn()
Overrides showStatus() with its own message

Expected output:

Smart Light is turned ON
Device is connected to the Smart Home System
--------------------------------
Smart AC is turned ON
Smart AC is connected and temperature is set to 72°F
Complete Solution */
abstract class SmartDevice{
    abstract void turnOn();

    void showStatus(){
        System.out.println("Device os connected to the smart Home System");
    }
}

class SmartLight extends SmartDevice{
    @Override
    void turnOn(){
        System.out.println("Smart Light is turned ON");
    }
}

class SmartAC extends SmartDevice{
    @Override 
    void turnOn(){
        System.out.println("Smart AC is turned ON");
    }

    @Override
    void showStatus(){
        System.out.println("Smart AC is connected and temperature is set to 72°F");
    }
}
public class SmartHomeSystem {
    public static void main(String args[]){
        SmartLight light = new SmartLight();
        SmartAC ac = new SmartAC();

        light.turnOn();
        light.showStatus();

        System.out.println("---------------------");
        ac.turnOn();
        ac.showStatus();
    }
}
