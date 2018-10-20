package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	
	int finished = 0;
	
	Random randy = new Random();
	
public static void main(String[] args) {
	
	_01_RobotRace RR = new _01_RobotRace();
	RR.setUp();
	
}

void setUp(){
	
	
	Robot[] robots = new Robot[6];
	
	robots[0] = new Robot();
	robots[1] = new Robot();
	robots[2] = new Robot();
	robots[3] = new Robot();
	robots[4] = new Robot();
	robots[5] = new Robot();

	
	for (int i = 0; i < robots.length; i++) {
		
		robots[i].moveTo(300 + (100 * i), 650);
		robots[i].setSpeed(500000);

		
	}
	
	while (finished < 60) {
		
		for (int i = 0; i < robots.length; i++) {
			
			robots[i].move(randy.nextInt(15));
			
			
			if(robots[i].getY() < 0 + 50 ) {
				
				finished += 1;
				
				robots[i].setSpeed(50);
				robots[i].move(100);
				
				robots[i].moveTo(300 + i * 100, 650);
				
			}
		
			
		}
		
	}
	

	
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
