import  java.util.*;

public class Store extends ToDo implements ObjectStore{
  ArrayList<String> todos = new ArrayList<String>();
  public Store(String text, int priorityLevel){
    super(text, priorityLevel);
  }
  public void allToDos(){
    todos.add("pick up dry cleaning");
    todos.add("consult with financial invester");
    todos.add("get estimates on new roof");
    todos.add("get tickets to play");
    todos.add("call for dinner reservations");
    todos.add("come up with vacation ideas");
    System.out.println(todos);
  }
  public int numberOfObjects(){
    int number = todos.size();
    System.out.println("Number of objects = " + number);
    return todos.size();
    }
  // This method will display each todo and the index.
    public ToDo objectAtIndex(int index){

    if (index >= 0 && index <= todos.size()){
        String todo = todos.get(index);
        System.out.println(todo);
        return ToDo;
      }
  }
  public ToDo remove(ToDo todo){
    todos.remove("pick up dry cleaning");
    todos.remove("get estimates on new roof");
    System.out.println("revised todo list after items are removed:"+todos);
  }
  public ToDo add(ToDo todo){
    todos.add("send package back to Amazon");
    todos.add("leave money out for the housekeepers");
    System.out.println("revised todo list after new items are added:"+todos);
  }
  public void testStore(){

  }
}
