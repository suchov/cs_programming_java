public class UniformRandomNumbers {
	public static void main(String[] args) {
		double first = Math.random();
		double second = Math.random();
		double third = Math.random();
		double fourth = Math.random();
		double fifth = Math.random();
		//print out five rundom numbers between 0 and 1
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		System.out.println(fifth);
		//print their average value
		double average = (first + second + third + fourth + fifth) / 5;
		System.out.println("average = " + average);
		//print minimum and maximum values
		double min1 = Math.min(first, second);
		double min2 = Math.min(min1, third);
		double min3 = Math.min(min2, fourth);
		double min4 = Math.min(min3, fifth);
		System.out.println("minimum = " + min4);
		double max1 = Math.max(first, second);
		double max2 = Math.max(max1, third);
		double max3 = Math.max(max2, fourth);
		double max4 = Math.max(max3, fifth);
		System.out.println("maximum = " + max4);
	}
}
