import java.util.List;
import java.util.Scanner;

public class IntervalWorkout {
    List<Exercise> exercisesIncluded;
    int numberRepetitions;
    int breakTime;

    public IntervalWorkout(List<Exercise> exercisesIncluded, int numberRepetitions, int breakTime) {
        this.exercisesIncluded = exercisesIncluded;
        this.numberRepetitions = numberRepetitions;
        this.breakTime = breakTime;
    }

    //Method to print all Interval Workouts (if there are 1 or more)!
    public static void printResults(List<IntervalWorkout> intervalWorkoutType) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter\n\t 1 for a low intensity workout or\n\t 2 for a medium intensity workout or\n\t 3 for a high intensity workout ");
        int selectedOption = inputValue.nextInt();
        if(selectedOption <= intervalWorkoutType.size()) {
            System.out.printf("INTERVAL WORKOUT %d:%n", selectedOption);
            System.out.println("*".repeat(45));
            System.out.println("Interval Workout STARTS !!!!");
            System.out.println("*".repeat(45));
            for (int i = 0; i < intervalWorkoutType.get(selectedOption - 1).numberRepetitions; i++) {
                System.out.println("=".repeat(45));
                System.out.printf("ROUND %d:%n", i + 1);
                for (int j = 0; j < intervalWorkoutType.get(selectedOption - 1).exercisesIncluded.size(); j++) {
                    System.out.printf("%-32s%d seconds%n",
                            intervalWorkoutType.get(selectedOption - 1).exercisesIncluded.get(j).exerciseName,
                            intervalWorkoutType.get(selectedOption - 1).exercisesIncluded.get(j).exerciseDuration);
                }
                if (i < (intervalWorkoutType.get(selectedOption - 1).numberRepetitions - 1)){
                    System.out.println("=".repeat(45));
                    System.out.printf("DO THE BREAK (%d SECONDS)%n", intervalWorkoutType.get(selectedOption - 1).breakTime);
                }
            }
            System.out.printf("%n%s%n", "*".repeat(45));
            System.out.println("CONGRATS - YOU ARE DONE !!!");
            System.out.println("*".repeat(45));
        } else {
            System.out.println("Please select the available options");
        }
    }
}
