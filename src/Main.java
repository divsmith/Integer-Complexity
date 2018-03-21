public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int test(int param)
    {
        int lowest = param + 1;

        for (int counter = 2; counter < (param / 2); counter++)
        {
            if (param % counter == 0)
            {
                int dividend = param / counter;

                int possibleLowest = dividend + counter;

                if (possibleLowest < lowest)
                {
                    lowest = possibleLowest;
                }
            }
        }

        return lowest;
    }
}
