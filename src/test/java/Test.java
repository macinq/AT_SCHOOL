import java.util.HashMap;

/**
 * @author Sergey Igoshin.
 */
public class Test {
  /**
   * Тестирование класса CompareObjects.
   */
  public void testCompareObjects() {
    Human human1 = new Human("Vasya", 30, 65);
    Human human2 = new Human("Petya", 35, 90);
    new TestCompareObjects().testCompare(human1, human2);
    new TestCompareObjects().testCompareToString(human1, human1);
    new TestCompareObjects().testCompareHashCode(human1, human1);
  }

  /**
   * Тестирование класса Map.
   */
  public void testMap() {
    String lastName = "Ерохин";
    String firstName = "Сергей";
    new TestMap().testCountElementsInMap(lastName, firstName, 96);

    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Дмитров", "Алексей");
    map.put("Ерохин", "Сергей ");
    map.put("Ярмолов", "Алексей");
    map.put("Карасев ", "Дмитрий");
    map.put(" Ерохин", "Сергей");
    map.put("Андреев ", "Андрей ");
    map.put("Смирнов", "Владимир");
    map.put("Ерохин ", "Сергей");
    map.put("Андреев", "Андрей");

    HashMap<String, String> expResult = new HashMap<String, String>();
    expResult.put("Дмитров", "Сергей");
    expResult.put("Ерохин", "Сергей ");
    expResult.put("Ярмолов", "Алексей");
    expResult.put("Карасев ", "Дмитрий");
    expResult.put(" Ерохин", "Сергей");
    expResult.put("Смирнов", "Владимир");
    expResult.put("Ерохин ", "Сергей");
    new TestMap().testDeleteValueFromMap(map, "Андрей", expResult);
  }

  /**
   * Тестирование класса Sort.
   */
  public void testSort() {
    int[] arr = {1, 4, 3, 2, 5};
    int[] expResult = {5, 5, 3, 2, 1};
    new TestSort().testReverseSort(arr, expResult);
  }

  /**
   * Тестирование всех имеющихся классов.
   */
  public static void main(String[] args) {
    new Test().testCompareObjects();
    new Test().testMap();
    new Test().testSort();
  }

  /**
   * Переопределение equals для сравнения по полям класса.
   */
  static class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
      this.name = name;
      this.age = age;
      this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }

      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Human human = (Human) o;
      return age == human.age &&
              weight == human.weight &&
              name.equals(human.name);
    }
  }
}
