public class FinancialForecast {

    // Recursive method
    static double futureValue(double currentValue, double growthRate, int years) {

        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double result = futureValue(currentValue, growthRate, years);

        System.out.println("Current Value : " + currentValue);
        System.out.println("Growth Rate : " + (growthRate * 100) + "%");
        System.out.println("Years : " + years);
        System.out.println("Future Value : " + result);
    }
}

/*

1. Recursion

Recursion is a programming technique in which a method calls itself to solve a problem. It breaks a large problem into smaller subproblems and continues until a base case is reached, which stops the recursive calls.

2. Setup

A recursive method named futureValue() is created to calculate the future value of an investment. It takes the current value, growth rate, and number of years as input and returns the predicted future value.

3. Implementation

The method checks whether the number of years is zero. If it is, the current value is returned. Otherwise, the value is increased by the growth rate and the method calls itself for the remaining years.

Base case: years == 0.
Increase value using the growth rate.
Call the same method recursively.
Continue until all years are calculated.

4. Analysis

The recursive algorithm makes one function call for each year, so the execution time increases linearly with the number of years. For large inputs, recursion can use more memory due to the function call stack.

Time Complexity

O(n), where n is the number of years.
Space Complexity: O(n) due to recursion.

Optimization

Use an iterative (loop-based) solution to reduce memory usage.
Use memoization if repeated calculations occur.
Iteration requires only O(1) extra space and is more efficient for large inputs. */