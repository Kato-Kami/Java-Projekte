public class WeatherData {

    public static void printTemperatures (int[][] temperatures) {

        for (int i = 0; i < temperatures.length; i++) {
            for (int j = 0; j < temperatures[i].length; j++) {
                System.out.print(temperatures[i][j] + " " );


            }
            System.out.println();
        }
    }

    public static double[] calculateDailyAverages (int[][] temperatures){

        double[] calculateDailyAverages = new double[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int sum = 0;
            for (int j = 0; j < temperatures[i].length; j++) {
                sum += temperatures[i][j];
                calculateDailyAverages[i] = sum / temperatures[i].length;
            }



        }
        return calculateDailyAverages;


    }

    public static void main(String[] args) {

        int[][] temperatures = {
                {2, 9, 11, 2},
                {4, 12, 13, 4},
                {6, 16, 13, 4},
                {5, 9, 8, 1}
        };

        printTemperatures(temperatures);


        double[] dailyAverages = calculateDailyAverages(temperatures);

        System.out.println("\nTägliche Durchschnittstemperaturen: ");
        for(double avg : dailyAverages) {
            System.out.print(avg + " ");
        }


    }
}
