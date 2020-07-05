import java.util.HashMap;

import static org.junit.Assert.fail;

/**
 * @author Sergey Igoshin.
 */
public class TestMap {

  /**
   * Тестирование метода подсчета одинаковых элементов в HashMap, где поиск производится по фамилии и имени.
   *
   * @param lastName  - фамилия для проверки.
   * @param firstName - имя для проверки.
   * @param expResult - ожидаемый результат.
   */
  public void testCountElementsInMap(String lastName, String firstName, int expResult) {
    int result = Map.countElementsInMap(lastName, firstName);

    if (expResult == result) {
      System.out.println("testCountElementsInMap PASSED" + " exp: " + expResult + " res: " + result);
    } else {
      System.out.println("testCountElementsInMap FAILED" + " exp: " + expResult + " res: " + result);
    }
  }


  /**
   * Тестирование метода удаления определенного элемента из HashMap.
   *
   * @param map       - HashMap с наполненными данными.
   * @param value     - значение, поиск по которому будет производится.
   * @param expResult - ожидаемый результат.
   */
  public void testDeleteValueFromMap(HashMap<String, String> map, String value, HashMap<String, String> expResult) {
    HashMap<String, String> result = Map.deleteValueFromMap(map, value);
    boolean flag = true;

    if (expResult == null || result == null || expResult.size() != result.size()) {
      flag = false;
    } else {
      for (String key : expResult.keySet()) {
        String str1 = expResult.get(key);
        String str2 = result.get(key);
        if (str1 == null || str2 == null) {
          flag = false;
          break;
        } else if (!str1.trim().equalsIgnoreCase(str2.trim())) {
          flag = false;
          break;
        }
      }
    }

    if (flag) {
      System.out.println("testDeleteValueFromMap PASSED");
    } else {
      System.out.println("testDeleteValueFromMap FAILED");
    }

    for (HashMap.Entry<String, String> ent : result.entrySet()) {
      System.out.println(ent.getKey() + " " + ent.getValue());
    }
  }
}
