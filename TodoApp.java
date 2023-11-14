import java.util.Scanner;

public class TodoApp {
  public static void main(String[] args) {
    Todo todoApp = new Todo();

    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("\nChoose avaible menu: ");
        System.out.println("\n1. Add new list: ");
        System.out.println("2. View my list: ");
        System.out.println("3. Update todo from my list");
        System.out.println("4. Remove todo from my list");
        System.out.println("5. Exit application");
        System.out.print("\nInsert a menu (1-5): ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
          case 1:
            System.out.print("\nInput new todo: ");
            String newTodo = scanner.nextLine();
            todoApp.addList(newTodo);
            break;
          case 2:
            todoApp.getTodolist();
            break;
          case 3:
            System.out.print("\nThe todo number want to update: ");
            int idxTodo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("\nInsert new todo name: ");
            String newName = scanner.nextLine();
            todoApp.updateList(idxTodo, newName);
            break;
          case 4:
            System.out.print("\nThe todo number: ");
            int idx = scanner.nextInt();
            todoApp.removeList(idx);
            break;
          case 5:
            System.out.println("\n Goodbyee! ");
            System.exit(0);
            break;

          default:
            System.err.println("\n The option does't exist in menu.");
            break;
        }

      }
    }
  }
}
