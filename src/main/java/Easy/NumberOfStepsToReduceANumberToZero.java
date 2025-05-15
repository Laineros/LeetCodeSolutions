package Easy;

public class NumberOfStepsToReduceANumberToZero {
    public static int numberOfSteps(int num) {
        int iterations = 0;
        while (num > 0) {
            if(num >= 2 && num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            iterations++;
        }
        return iterations;
    }
}
