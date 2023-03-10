class MonthData {
    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }
        return sumSteps;
    }

    int maxSteps(){
        int maxStep = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxStep){
                maxStep = days[i];
            }
            else{

            }
        }
        return maxStep;
    }

    int bestSeries(int goalByStepsPerDay){
        int currentSeries = 0;
        int finalSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if(days[i] == goalByStepsPerDay){
                currentSeries ++;
            }else{
                currentSeries = 0;
            }
            if (finalSeries <=  currentSeries){
                finalSeries = currentSeries;
            }
        }
        return finalSeries;
    }
}