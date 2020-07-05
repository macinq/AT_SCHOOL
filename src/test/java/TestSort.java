import org.junit.After;
import org.junit.Before;

import java.util.Arrays;

import static org.junit.Assert.fail;

/**
 * @author Sergey Igoshin.
 */
public class TestSort {
  /**
   * Тестирование метода сортировки массива в убывающем порядке.
   *
   * @param arr       - массив, который приходит на вход.
   * @param expResult - ожидаемый результат.
   */
  public void testReverseSort(int[] arr, int[] expResult) {
    int[] result = Sort.reverseSort(arr);
    boolean flag = true;

    if (expResult.length == result.length) {
      for (int i = 0; i < expResult.length; i++) {
        if (expResult[i] != result[i]) {
          flag = false;
          break;
        }
      }
    } else {
      flag = false;
    }


    if (flag) {
      System.out.println("testReverseSort PASSED" + " exp: " + Arrays.toString(expResult) + " res: " + Arrays.toString(result));
    } else {
      System.out.println("testReverseSort FAILED" + " exp: " + Arrays.toString(expResult) + " res: " + Arrays.toString(result));
    }
  }

}
