
public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            //introduced null pointer exception by setting double to null by default
            sum = sum + numbers[i];
        }
        //introduced a logic error when calculating the average
            double avg = sum / numbers.length;
        //introduced a index out of bounds exception by printing a index number not in the index
            System.out.println(numbers[numbers.length - 1]);
            System.out.println("The average is " + avg);
        }
    }

//I used the debug functionality because I received an error of a Null Point Error where my variable sum was not initialized and thus sent to null by default. I fixed it by setting it equals to 0.
// I used the debug functionality to fix the out of bounds error by looking at the code stack to see that the index I was searching for was not in the range of 5 and thus an invalid array range. I fixed it by adding a -1 to the end of numbers.length to account for the array starting at 0.
//I used the debug functionality to fix the logic error by adding a breakpoint before the program prints the average and stepped out while watching the average changed. I saw the average was not right due to the numbers.length being one less than it needed to be and fixed it.