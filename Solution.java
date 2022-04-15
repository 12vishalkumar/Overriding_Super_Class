import java.io.*;
import java.util.*;

class Bicyle
{
    String Define_Me()
    {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends Bicyle
{
    String Define_Me()
    {
        return "a cycle with an engine.";
    }
    MotorCycle()
    {
        System.out.println("Hello I am a motorcycle, I am "+ Define_Me()); 
        System.out.println("My ancestor is a cycle who is "+ super.Define_Me());
    }
    
}

public class Solution
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        MotorCycle MT = new MotorCycle();
        
    }
}