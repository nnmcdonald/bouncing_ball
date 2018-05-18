////////////////////////////////////////////////////////////////////////////
//
// Nathaniel McDonald
// February 14, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program calculates the height of a bouncing ball.
// 
// INPUTS:  Initial velocity of the ball.
//    
//
// OUTPUTS:  Time followed by the height of the ball. If the ball bounces between time intervals then "Bounce!" is
//           displayed. The program ends after the 5th bounce.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

public class BouncingBall
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Imagine you were to throw a ball downward. Please enter an initial velocity for the ball " +
                       "in ft per second.");
    double velocity = keyboard.nextDouble();
    
    keyboard.close();
      
    double height = 0;
    int time = 0;
    int bounce = 0;
    
    //Starts a loop that prints out the time interval and the height of the ball using the velocity
    //entered above. The loop repeats until the ball bounces 5 times.
    for (bounce = 0; bounce < 5; time++)
    { 
      if (height >= 0)
      {
        System.out.printf("Time: %1d Height: %1.1f \n", time, height);
        height = height + velocity;
        velocity = velocity - 32;
      }
     
      //Inverts the height and velocity if height goes below 0 to simulate the bounce and prints "Bounce!".
      else
      {
        height = height * (-0.5);
        velocity = velocity * (-0.5);
        System.out.println("Bounce!");
        bounce++;
      }
    }   
  }
}
