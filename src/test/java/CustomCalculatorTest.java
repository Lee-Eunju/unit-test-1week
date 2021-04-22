import org.junit.Test;
import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트를 진행합니다.
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        /* 테스트 코드 입력 */
        assertTrue(result == 20);
        //assertFalse(result == 19);
    }

    // 빼기 테스트를 진행합니다.
    @Test
    public void subTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 5);
        assertTrue(result == 5);
        //assertFalse(result == 5); //에러
    }

    // 곱하기 테스트를 진행합니다.
    @Test
    public void mulTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(3,4);
        assertTrue(result == 12);
    }

    // 나누기 테스트를 진행합니다.
    @Test
    public void divTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(10,2);
        assertTrue(result == 5);
        //assertTrue(customCalculator.divide(4,2) == 2);
    }

}