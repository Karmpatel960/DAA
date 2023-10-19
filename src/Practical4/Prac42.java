package Practical4;

import java.util.*;

class Activity {
    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }
}

public class Prac42 {
    public static void selectMaxActivities(Activity[] activities) {
        // Sort the activities by their finish times
        Arrays.sort(activities, (a1, a2) -> a1.finish - a2.finish);

        System.out.println("Selected Activities:");

        // The first activity always gets selected
        int prevFinishTime = activities[0].finish;
        System.out.println("Activity 1: Start time = " + activities[0].start + ", Finish time = " + activities[0].finish);

        // Consider the remaining activities
        for (int i = 1; i < activities.length; i++) {
            // If this activity has a start time greater than or equal to the finish time of the previous activity, then select it
            if (activities[i].start >= prevFinishTime) {
                System.out.println("Activity " + (i + 1) + ": Start time = " + activities[i].start + ", Finish time = " + activities[i].finish);
                prevFinishTime = activities[i].finish;
            }
        }
    }

    public static void main(String[] args) {
        Activity[] activities = {
                new Activity(1, 3),
                new Activity(2, 5),
                new Activity(3, 8),
                new Activity(4, 6),
                new Activity(5, 9),
                new Activity(6, 10)
        };

        selectMaxActivities(activities);
    }
}

