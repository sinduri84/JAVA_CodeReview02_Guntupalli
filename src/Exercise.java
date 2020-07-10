import java.util.ArrayList;
import java.util.List;

public class Exercise {
    String exerciseName;
    String exerciseDescription;
    int exerciseDuration;
    boolean exerciseFloor;

    public Exercise(String exerciseName, String exerciseDescription, int exerciseDuration, boolean exerciseFloor) {
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
        this.exerciseDuration = exerciseDuration;
        this.exerciseFloor = exerciseFloor;
    }

    //print method to print the objects in the required format
    public static void printExerciseList(List<Exercise> exercisesList) {
        for (Exercise element : exercisesList) {
            System.out.printf("%-32s DURATION: %dseconds. %n" +
                            "%s%n" +
                            "DESCRIPTION: %s.%n%n",
                    element.exerciseName, element.exerciseDuration,
                    "-".repeat(53), element.exerciseDescription);
        }
    }

    //Method to print the exercises where your hands touch the floor and where your hands touch the floor and are longer than 60 seconds;
    public static void printLimitedExercises(List<Exercise> exercisesList) {
        List<Exercise> exercisesFloor = new ArrayList<>();
        List<Exercise> exercisesFloorLong = new ArrayList<>();

        for (Exercise element : exercisesList) {
            if (element.exerciseFloor && element.exerciseDuration > 60) {
                exercisesFloorLong.add(element);
            }
            if (element.exerciseFloor) {
                exercisesFloor.add(element);
            }

        }

        //Exercises on the floor
        System.out.println("\nThe exercises where your hands touch the floor are:\n");
        printExerciseList(exercisesFloor);
        //Exercises on the floor longer than 60 seconds;
        System.out.println("\nThe exercises where your hands touch the floor and are longer than a minute are:\n");
        printExerciseList(exercisesFloorLong);
    }

}
