/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DemoApp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    public void TestNullArray(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer i1 = 3;
        Integer i2 = 2;
        assertThrows(Exception.class,() -> { App.averageOfIndex(arr1, null, i1, i2); });
      }

      public void TestEmptyArray(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>();
        Integer i1 = 3;
        Integer i2 = 2;
        assertThrows(Exception.class,() -> { App.averageOfIndex(arr1, arr2, i1, i2); });
      }
      
      public void TestNegativeIndex(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer i1 = -1;
        Integer i2 = -2;
        assertThrows(Exception.class,() -> { App.averageOfIndex(arr1, arr2, i1, i2); });
      }

      public void TestSizeExceedIndex(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer i1 = 20;
        Integer i2 = 20;
        assertThrows(Exception.class,() -> { App.averageOfIndex(arr1, arr2, i1, i2); });
      }

      public void TestCorrect(){
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        Integer i1 = 1;
        Integer i2 = 2;
        try{
            assertEquals(5, App.averageOfIndex(arr1,arr2,i1,i2));
        }catch (Exception e){
            e.getMessage();
        }
      }
}
