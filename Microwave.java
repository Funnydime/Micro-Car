//Dimitri Rodriguez
//P8.1
//CS 234
import java.util.Scanner;
public class Microwave{
	private int time;
	private int level;
	public Microwave(){
		time = 0;
		level = 1;
	}

	public void start(){
		System.out.println("The microwave will start at " + time + " at level " + level);
	}
	
	public void increaseTime(){
		time += 30;
	}
	
	public void switchPower(){
		if (level == 1){
			level = 2;
		}
		
		else{
			level = 1;
		}
	}
	
	public void reset(){
		time = 0;
		level = 1;
		System.out.println("Microwave reset");
	}
	public static void main(String[] args){
		Microwave appliance = new Microwave();
		
		appliance.increaseTime();
		appliance.increaseTime();
		appliance.increaseTime();
		appliance.switchPower();
		
		appliance.start();
		
		appliance.reset();
		
		appliance.increaseTime();
		appliance.switchPower();
		appliance.start();		
	}
}