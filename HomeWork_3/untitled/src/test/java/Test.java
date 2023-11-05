import org.example.EvenOddNumber;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;


public class Test {

    EvenOddNumber evenOddNumber = new EvenOddNumber();
    int[] oddNumbers = new int[]{-3,-1,5,7};
    int[] evenNumbers = new int[]{-6,-2,4,8};

    @ParameterizedTest
    @ValueSource (ints = {-2,-4,6, Integer.MIN_VALUE})
    void oddNumberTest(int n){

        assertThat(evenOddNumber.evenOddNumber(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource (ints = {-7,-1,9, Integer.MAX_VALUE})
    void evenNumberTest(int n){

        assertThat(evenOddNumber.evenOddNumber(n)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {25,50,100})
    void isInsideInterval(int n){
        assertThat(evenOddNumber.isInInterval(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 24, 150})
    void isOutsideInterval(int n) {
        assertThat(evenOddNumber.isInInterval(n)).isFalse();
    }

}
