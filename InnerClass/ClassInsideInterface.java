interface Vehicle{
	public int getNoOfWheels();

	class DefaultVehicle implements Vehicle{
		public int getNoOfWheels(){
			return 2;
		}
	}
}

class Bus implements Vehicle{
	public int getNoOfWheels(){
		return 6;
	}
}

class ClassInsideInterface{
	public static void main(String[] args){
		Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());  //2

		Bus b =new Bus();
		System.out.println(b.getNoOfWheels());   //6
	}
}