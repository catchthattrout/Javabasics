public class calculatedMealPrice {
	public static double calculatedTotalMealPrice(double listedMealPrice,
	                                              double tipRate,
	                                              double taxRate) { // instead of void return type, we used double to return the value 

	    double tip = tipRate * listedMealPrice;
	    double tax = taxRate * listedMealPrice;
	    double result = tip + tax + listedMealPrice;
	    return result; // here we use return function to return the value of calculatedTotalMealPrice

    }

    public static void main(String[] args) {
    	double groupTotalMealPrice = calculatedTotalMealPrice(100, .2, .08); // called the function and assign to a double data type variable called groupTotalMealPrice
    	System.out.println(groupTotalMealPrice);
    }

}