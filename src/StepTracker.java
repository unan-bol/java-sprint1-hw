import java.util.Scanner;
class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    Converter converter =  new Converter();
    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i=0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }

    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("Введите корректное число");
            return;
        }
        System.out.println("Введите номер дня");
        int day = scanner.nextInt();
        if (day > 30 || day < 1) {
            System.out.println("Введите корректное число");
            return;
        }
        System.out.println("Введите количество шагов");
        int steps = scanner.nextInt();
        if (steps < 0) {
            System.out.println("Введите корректное число");
            return;
        }
        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Введите цель шагов");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay <= 0) {
            System.out.println("Введите положительное число");
        }
    }

    void printStatistic() {
        System.out.println("Введите число месяца");
        int month = scanner.nextInt();
        if (month <= 0 || month > 13) {
            System.out.println("Введите корректное число");
        } else {
            MonthData monthData = monthToData[month-1];//
            int sumSteps = monthData.sumStepsFromMonth();
            System.out.println("Вывод общей статистики по дням:");
            System.out.println("Сумма шагов за месяц: " + monthData.sumStepsFromMonth());
            System.out.println("Максимальное количество шагов в день за месяц: " + monthData.maxSteps());
            System.out.println("Среднее количество шагов за месяц: " + sumSteps/30);
            System.out.println("Пройденная дистанция за месяц: " + converter.convertToKm(sumSteps) + " км");
            System.out.println("Количество сожженых ккал за месяц: " + converter.convertStepsToKilocalories(sumSteps) + " ккал");
            System.out.println("Лучшая серия: " + monthData.bestSeries(goalByStepsPerDay));
            System.out.println();

        }

    }
}