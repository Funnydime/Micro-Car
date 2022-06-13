//Dimitri Rodriguez
//P8.6
//CS 234
public class Car{
	private int gas;
	private int effec;
	private int loss;
	
	public Car(int x){
		effec += x;
		gas = 0;
		loss = 0;
	}
	
	public void addGas(int add){
		gas += add;
	}
	
	public void drive(int loss){
		gas = gas - (loss/effec);
	}
	
	public int getGasLevel(){
		gas = gas;
		return gas;
	}
	
	public static void main(String[] args){
	 Car myCar = new Car(50);
	 myCar.addGas(20);
	 myCar.drive(100);
	 System.out.println("Fuel remaining: " + myCar.getGasLevel());
	}
}