import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Exercise> exercisesList = new ArrayList<Exercise>();

        exercisesList.add(new Exercise("Push-Ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, true));
        exercisesList.add(new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, true));
        exercisesList.add(new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, false));
        exercisesList.add(new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, true));
        exercisesList.add(new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, false));
        exercisesList.add(new Exercise("Sidewards Back Stretch", " Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, false));

        for(int i = 0; i < exercisesList.size(); i++) {
            System.out.printf("%-32s DURATION: %dseconds. %n" +
                    "%s%n" +
                    "DESCRIPTION: %s.%n%n",
                    exercisesList.get(i).exerciseName, exercisesList.get(i).exerciseDuration,
                    "-".repeat(53), exercisesList.get(i).exerciseDescription);
        }

        //Exercises on the floor
        System.out.println("The exercises where your hands touch the floor are:\n");
        for(Exercise element : exercisesList) {
            if(element.exerciseFloor) {
                System.out.printf("%-32s DURATION: %dseconds. %n" +
                                "%s%n" +
                                "DESCRIPTION: %s.%n%n",
                        element.exerciseName, element.exerciseDuration,
                        "-".repeat(53), element.exerciseDescription);
            }
        }

        //Exercises on the floor longer than 60 seconds;
        System.out.println("The exercises where your hands touch the floor and are longer than a minute are:\n");
        for(Exercise element : exercisesList) {
            if(element.exerciseFloor && element.exerciseDuration > 60) {
                System.out.printf("%-32s DURATION: %dseconds. %n" +
                                "%s%n" +
                                "DESCRIPTION: %s.%n%n",
                        element.exerciseName, element.exerciseDuration,
                        "-".repeat(53), element.exerciseDescription);
            }
        }



    }
}
