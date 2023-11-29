
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Project project = new Project("Наш проект");

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить новый этап");
            System.out.println("2.Добавить задачу в этап");
            System.out.println("3.Показать проект");
            System.out.println("4.Просмотреть все этапы");
            System.out.println("5.Просмотреть все задачи в этапе");
            System.out.println("0.Завершить");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите название");
                    String stageName = scanner.nextLine();
                    Stage stage = new Stage(stageName);
                    project.addProjectItem(stage);
                    break;
                case 2:
                    System.out.println("Выберите номер этапа");
                    project.display();
                    int stageIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.println("Введите название задачи");
                    String taskName = scanner.nextLine();
                    Task task = new Task(taskName);

                    if (stageIndex >= 0 && stageIndex < project.getProjectItems().size() &&
                            project.getProjectItems().get(stageIndex) instanceof Stage) {
                        Stage selectedStage = (Stage) project.getProjectItems().get(stageIndex);
                        selectedStage.addProjectItem(task);
                    } else {
                        System.out.println("Такого этапа нет");
                    }
                    break;
                case 3:
                    project.display();
                    break;
                case 4:
                    System.out.println("Выберите номер этапа");
                    project.display();
                    int selectedStageIndex = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (selectedStageIndex >= 0 && selectedStageIndex < project.getProjectItems().size() &&
                            project.getProjectItems().get(selectedStageIndex) instanceof Stage) {
                        Stage selectedStage = (Stage) project.getProjectItems().get(selectedStageIndex);
                        selectedStage.display();
                    } else {
                        System.out.println("Такого этапа нет");
                    }
                    break;
                case 5:
                    System.out.println("Выберите этап для просмотра задач:");
                    project.display();
                    int stageIndexForTasks = scanner.nextInt() - 1;
                    scanner.nextLine();

                    if (stageIndexForTasks >= 0 && stageIndexForTasks < project.getProjectItems().size() &&
                            project.getProjectItems().get(stageIndexForTasks) instanceof Stage) {
                        Stage selectedStage = (Stage) project.getProjectItems().get(stageIndexForTasks);
                        selectedStage.display();

                        System.out.println("Выберите номер задачи");
                        int taskIndex = scanner.nextInt() - 1;
                        scanner.nextLine();

                        if (taskIndex >= 0 && taskIndex < selectedStage.getProjectItems().size() &&
                                selectedStage.getProjectItems().get(taskIndex) instanceof Task) {
                            Task selectedTask = (Task) selectedStage.getProjectItems().get(taskIndex);
                            selectedTask.display();
                        } else {
                            System.out.println("Такой задачи нет");
                        }
                    } else {
                        System.out.println("Такого этапа нет");
                    }
                    break;
                case 0:
                    System.out.println("Завершено");
                    scanner.close();
                    return;
                default:
                    System.out.println("Некорректно");
            }
        }
    }
}