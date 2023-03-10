import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);
        while(true){
            printMenu();
            int i = scanner.nextInt();
            if (i==1){
                System.out.println("Выполняется команда: Добавить шаги");
                stepTracker.addNewNumberStepsPerDay();
            }else if (i==2){
                System.out.println("Выполняется команда: Изменить цель шагов в день");
                stepTracker.changeStepGoal();
            }else if (i==3){
                System.out.println("Выполняется команда: Вывод статистики");
                stepTracker.printStatistic();
            }else if (i==4){
                System.out.println("Выполняется команда: Выход");
                System.out.println("Пока!");
                scanner.close();
                return;
            }else{
                System.out.println("Такой команды  нет");
            }

        }
    }

    static void printMenu(){
       System.out.println("Что вы хотите сделать?");
       System.out.println("1.Добавить шаги");
       System.out.println("2.Изменить цель шагов в день");
       System.out.println("3.Статистика");
       System.out.println("4.Выход");
    }
}