package Practical3;

import java.util.Arrays;

/*
*     job allocation
*
*
* Suppose you want to schedule N activities in a Seminar Hall. Start
time and Finish time of activities are given by pair of (si,fi) for ith
activity. Implement the program to maximize the utilization of
Seminar Hall. (Maximum activities should be selected.)
*
* */


class Activity implements Comparable<Activity> {
    int start;
    int finish;

    public Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Activity other) {
        return this.finish - other.finish;
    }
}
public class joballocation {
        public static int maxActivities(Activity[] activities) {
            if (activities == null || activities.length == 0) {
                return 0;
            }

            Arrays.sort(activities);

            int count = 1;
            int prevFinish = activities[0].finish;

            for (int i = 1; i < activities.length; i++) {
                if (activities[i].start >= prevFinish) {
                    count++;
                    prevFinish = activities[i].finish;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Activity[] activities = {
                    new Activity(1, 3),
                    new Activity(2, 5),
                    new Activity(5, 7),
                    new Activity(4, 8),
                    new Activity(8, 10),
                    new Activity(9, 11),
            };

            int maxActivities = maxActivities(activities);
            System.out.println("Maximum activities that can be scheduled: " + maxActivities);
        }
}

