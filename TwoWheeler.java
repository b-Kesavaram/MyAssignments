package week1.day2;

public class TwoWheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj = new TwoWheeler();
		int output1 = obj.noOfWheels(2);
		short output2  = obj.noOfMirrors();
		long output3 = obj.chassisNumber(22668579);
		boolean output4 = obj.isPunctured();
		String output5 = obj.bikeName("Honda");
		double output6 = obj.runningKM(63000);
		System.out.println("Number of wheels=" + " "+ output1);
		System.out.println("Number of mirrors=" + " "+output2);
		System.out.println("Bike chassis number is=" + " "+ output3);
		System.out.println("Is bike Puncture=" +  " "+output4);
		System.out.println("Name of the bike=" + " "+ output5);
		System.out.println("Total running KM=" + " "+ output6);
	}
		public int noOfWheels(int num1) {
			int wheels = num1;
			return wheels;
		}
		public short noOfMirrors() {
			short mirrors = -2;
			return mirrors;
					}
		public long chassisNumber(long num1) {
			long chassis = num1;
			return chassis;
		}
		boolean isPunctured() {
	     boolean puncture = true;
		return puncture;
	}
	public String bikeName(String name) {
		String bike = name;
		return bike;
	}
	public double runningKM(double num1) {
		double KM = num1;
		return KM;
	}
	
	

}
