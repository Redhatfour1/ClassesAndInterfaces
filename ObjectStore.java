public interface ObjectStore {
  public ToDo add(ToDo todo);
  public ToDo remove(ToDo todo);
  public ToDo objectAtIndex(int index);
  public int numberOfObjects();
  public void allToDos();
  public void testStore();

}
