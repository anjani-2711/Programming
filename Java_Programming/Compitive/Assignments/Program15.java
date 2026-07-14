/* Write a program to calculate 
the power of number using loops */
class Logic
{
    void calculatePower(int base, int exp)   // Method to calculate power
    {
        int result = 1;                      // Store the final answer

        for(int i = 1; i <= exp; i++)        // Loop runs 'exp' times
        {
            result = result * base;          // Multiply result by base
        }

        System.out.println(result);          
    }
}

class Program15
{
    public static void main(String args[])
    {
        Logic obj = new Logic();            

        obj.calculatePower(2, 5);            
    }
}