import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

/**
 * @author Sergey Igoshin.
 */
public class TestCompareObjects {
  /**
   * Тестирование метода сравнения объектов.
   *
   * @param object1 - первый объект для сравнения.
   * @param object2 - второй лбъект для сравнения.
   */
  public void testCompare(Object object1, Object object2) {
    boolean expResult = true;
    boolean result = CompareObjects.compare(object1, object2);

    if (expResult == result) {
      System.out.println("testCompare PASSED");
    } else {
      System.out.println("testCompare FAILED");
    }
  }

  /**
   * Тестирование метода сравнения объектов, которые переведены в строку.
   *
   * @param object1 - первый объект для сравнения.
   * @param object2 - второй лбъект для сравнения.
   */
  public void testCompareToString(Object object1, Object object2) {
    boolean expResult = false;
    boolean result = CompareObjects.compareToString(object1, object2);

    if (expResult == result) {
      System.out.println("testCompareToString PASSED" + " " + object1.toString() + " & " + object2.toString());
    } else {
      System.out.println("testCompareToString FAILED" + " " + object1.toString() + " & " + object2.toString());
    }
  }

  /**
   * Тестирование метода сравнения хэш-кодов объектов.
   *
   * @param object1 - первый объект для сравнения.
   * @param object2 - второй лбъект для сравнения.
   */
  public void testCompareHashCode(Object object1, Object object2) {
    boolean expResult = false;
    boolean result = CompareObjects.compareHashCode(object1, object2);

    if (expResult == result) {
      System.out.println("testCompareHashCode PASSED" + " " + object1.hashCode() + " & " + object2.hashCode());
    } else {
      System.out.println("testCompareHashCode FAILED" + " " + object1.hashCode() + " & " + object2.hashCode());
    }
  }
}
