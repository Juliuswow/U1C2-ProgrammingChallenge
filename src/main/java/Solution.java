public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
       double average= (t1 + t2 + t3 + t4) / 4;
        return average;
    }

    public int roundAverage(double average) {
       int x= (int)(average + .5);
        return x;
    }

    public boolean isPassing(int roundedAverage) {
        if (roundedAverage < 65){
            return false;
        }else{
            return true;
        }
        
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        double x=(shares * price);
        return x;
    }


   public int roundValueChange(double totalStock) {
    if (totalStock >= 0) {
        return (int) (totalStock + 0.5);
    } else {
        return (int) (totalStock - 0.5);
    }
}
    

    /*
    Problem 3: Digit Incrementer 
    */
   



public double adjustDigits(double userDouble) {

    long totalCents = Math.round(userDouble * 100);
    
    // Extract the individual digits using integer math
    long hundreth = (totalCents % 10 + 1) % 10;
    long tenth = ((totalCents / 10) % 10 + 1) % 10;
    long ones = ((totalCents / 100) % 10 + 1) % 10;
    long tens = ((totalCents / 1000) % 10 + 1) % 10;
    

    double result = (tens * 10) + ones + (tenth * 0.1) + (hundreth * 0.01);
    
    return Math.round(result * 100.0) / 100.0;
}

    


        



    

    public static void main(String[] args) {
        Solution s = new Solution();


    }

}
