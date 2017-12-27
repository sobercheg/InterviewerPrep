package crackingcoding.ch8recursion;

/**
 * A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
 * steps at a time. Implement a method to count how many possible ways the child can run up the
 * stairs.
 */
public class TripleStep {

    public int getNumOfWays(int totalSteps) {
        // It was extremely hard for me to wrap my mind around these base cases and why it is NOT needed to add 1 to the return value
        if (totalSteps < 0) return 0;
        if (totalSteps == 0) return 1;

        return getNumOfWays(totalSteps - 1) + getNumOfWays(totalSteps - 2) + getNumOfWays(totalSteps - 3);
    }
}
