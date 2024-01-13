/*7. Write a Java program to calculate simple interest.
Where, 
P is the principal amount 
T is the time and 
R is the rate*/


class Simple_Interest{
	public static void main(String args[]){
	
	//Input values
	double P = 10000;
	int R = 5;
	int T = 5;

	//Calculate Simple Interest
	double SI = (P*R*T)/100;

	//print the result
	System.out.println("Simple Interest : " +SI);
}
}