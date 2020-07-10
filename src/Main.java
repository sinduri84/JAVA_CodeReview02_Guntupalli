import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Creates a new ArrayList and adds the Exercise objects into the ArrayList
        List<Exercise> exercisesList = new ArrayList<Exercise>();

        exercisesList.add(new Exercise("Push-Ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, true));
        exercisesList.add(new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, true));
        exercisesList.add(new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, false));
        exercisesList.add(new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, true));
        exercisesList.add(new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, false));
        exercisesList.add(new Exercise("Sidewards Back Stretch", " Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, false));

        //Calls the method to print all the exercises offered!
        System.out.println("The exercises offered are:");
        Exercise.printExerciseList(exercisesList);

        //Calls the method to print the exercises "touching the floor" and "touching the floor & longer than 1 minute"!
        Exercise.printLimitedExercises(exercisesList);

        //Creates a list of all exercises included in the Example Interval Workout!
        List<Exercise> exercisesIncluded = new ArrayList<Exercise>();

        //Adds Push-Ups to the list!
        exercisesIncluded.add(exercisesList.get(0));
        //Adds Squats to the List!
        exercisesIncluded.add(exercisesList.get(2));
        //Adds Planks to the List!
        exercisesIncluded.add(exercisesList.get(1));

        //Creates a list to store IntervalWorkout Objects
        List<IntervalWorkout> intervalWorkoutType = new ArrayList<IntervalWorkout>();

        //Creates and stores the example Interval Workout Object
        intervalWorkoutType.add(new IntervalWorkout(exercisesIncluded, 4, 30));

        //Additional Examples of IntervalWorkout Example to show additional data;
        List<Exercise> exercisesIncluded2 = new ArrayList<Exercise>();
        exercisesIncluded2.add(exercisesList.get(2));
        exercisesIncluded2.add(exercisesList.get(1));
        exercisesIncluded2.add(exercisesList.get(4));
        exercisesIncluded2.add(exercisesList.get(5));
        intervalWorkoutType.add(new IntervalWorkout(exercisesIncluded2, 5, 25));

        List<Exercise> exercisesIncluded3 = new ArrayList<Exercise>();
        exercisesIncluded3.add(exercisesList.get(0));
        exercisesIncluded3.add(exercisesList.get(5));
        exercisesIncluded3.add(exercisesList.get(2));
        exercisesIncluded3.add(exercisesList.get(3));
        exercisesIncluded3.add(exercisesList.get(0));
        intervalWorkoutType.add(new IntervalWorkout(exercisesIncluded3, 10, 15));

        //Calls the print method from the IntervalWorkout Class to display all the IntervalWorkout Objects created!
        IntervalWorkout.printResults(intervalWorkoutType);




    }
}
