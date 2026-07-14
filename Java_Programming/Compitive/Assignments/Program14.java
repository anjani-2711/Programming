/* Write a program to print each digit 
of a number seperately */

class Logic
{
    void printDigits(int num)          // Method to print each digit
    {
        while(num != 0)                // Repeat until number becomes 0
        {
            System.out.println(num % 10); 

            num = num / 10;            // Remove last digit
        }
    }
}

class Program14
{
    public static void main(String args[])
    {
        Logic obj = new Logic();       // Create object

        obj.printDigits(9876);         // Call method
    }
}