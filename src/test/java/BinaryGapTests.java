import easy.BinaryGap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinaryGapTests {

    @Test
    void solutionWithFlagsShouldWork() {
        int actualValue1 = BinaryGap.solutionWithFlags(1041);
        int actualValue2 = BinaryGap.solutionWithFlags(15);
        int actualValue3 = BinaryGap.solutionWithFlags(32);
        int actualValue4 = BinaryGap.solutionWithFlags(561892);
        int actualValue5 = BinaryGap.solutionWithFlags(6291457);
        int actualValue6 = BinaryGap.solutionWithFlags(328);
        int actualValue7 = BinaryGap.solutionWithFlags(805306373);

        Assertions.assertEquals(5, actualValue1);
        Assertions.assertEquals(0, actualValue2);
        Assertions.assertEquals(0, actualValue3);
        Assertions.assertEquals(3, actualValue4);
        Assertions.assertEquals(20, actualValue5);
        Assertions.assertEquals(2, actualValue6);
        Assertions.assertEquals(25, actualValue7);
    }

    @Test
    void bestSolutionShouldWork() {
        int actualValue1 = BinaryGap.bestSolution(1041);
        int actualValue2 = BinaryGap.bestSolution(15);
        int actualValue3 = BinaryGap.bestSolution(32);
        int actualValue4 = BinaryGap.bestSolution(561892);
        int actualValue5 = BinaryGap.bestSolution(6291457);
        int actualValue6 = BinaryGap.bestSolution(328);
        int actualValue7 = BinaryGap.bestSolution(805306373);

        Assertions.assertEquals(5, actualValue1);
        Assertions.assertEquals(0, actualValue2);
        Assertions.assertEquals(0, actualValue3);
        Assertions.assertEquals(3, actualValue4);
        Assertions.assertEquals(20, actualValue5);
        Assertions.assertEquals(2, actualValue6);
        Assertions.assertEquals(25, actualValue7);
    }
}
