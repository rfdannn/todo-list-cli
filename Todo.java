import java.util.ArrayList;

public class Todo {
  private ArrayList<String> todoList;

  Todo() {
    todoList = new ArrayList<>();
  }

  public void getTodolist() {
    if (todoList.size() < 1) {
      System.out.println("\n=========================");
      System.out.println("Oops! you doesn't have list now. ");
      System.out.println("=========================");
      System.out.println("\n");

      return;
    }
    System.out.println("\n");
    System.out.println("==============================");
    System.out.println("My list: ");
    for (int i = 0; i < todoList.size(); i++) {
      System.out.println(i + 1 + ". " + todoList.get(i));
    }
    System.out.println("==============================");
    System.out.println("\n");

  }

  public void addList(String newList) {
    todoList.add(newList);
    System.out.println("New list added: " + newList);
  }

  public void removeList(int idx) {
    if (!validateIdx(idx)) {
      System.out.println("Index invalid");
      return;
    }
    todoList.remove(todoList.get(idx - 1));
  }

  public void updateList(int idx, String updatedList) {
    if (!validateIdx(idx)) {
      System.out.println("Index invalid");
      return;
    }
    todoList.remove(todoList.get(idx - 1));
    todoList.add(idx - 1, updatedList);
  }

  private boolean validateIdx(int index) {
    return index >= 1 && index < todoList.size();
  }

}