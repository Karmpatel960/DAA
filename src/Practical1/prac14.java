package Practical1;

public class prac14 {
        public static void main(String[] args) {
            int[] inputSizes = {10, 15, 20, 30, 45};
            double machineATime, machineBTime, machineCTime;

            System.out.println("n\tMachine A\tMachine B\tMachine C");

            for (int n : inputSizes) {
                machineATime = 1e-4 * Math.pow(2, n);
                machineBTime = 1e-6 * Math.pow(2, n);
                machineCTime = 1e-2 * Math.pow(n, 3);

                System.out.println(n + "\t" + machineATime + "\t" + machineBTime + "\t" + machineCTime);
            }
        }
}
