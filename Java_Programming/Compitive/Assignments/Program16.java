/* sum of all even numbers up to N */
class Logic
{
    void sumEvenNumbers(int n)          
    {
        int sum = 0;                    // Variable to store sum

        for(int i = 2; i <= n; i = i + 2)   // Start from 2 and increase by 2
        {
            sum = sum + i;              // Add current even number
        }

        System.out.println("Sum = " + sum); // Print final sum
    }
}

class Program16
{
    public static void main(String args[])
    {
        Logic obj = new Logic();        // Create object

        obj.sumEvenNumbers(10);         // Call method
    }
}