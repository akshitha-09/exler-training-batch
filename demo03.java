class demo03 {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 10;
        num2 = 20;
        num3 = 30;
        
        if ((num1 > num2) && (num1 > num3)) {  // Changed curly braces and fixed condition syntax
            System.out.println("num1 is greater");  // Removed 'x:' and fixed the print statement
        } 
        else if ((num2 > num1) && (num2 > num3)) {  // Fixed condition syntax
            System.out.println("num2 is greater");  // Removed 'x:' and fixed the print statement
        } 
        else {
            System.out.println("num3 is greater");  // Removed 'x:' and fixed the print statement
        }
    }
}