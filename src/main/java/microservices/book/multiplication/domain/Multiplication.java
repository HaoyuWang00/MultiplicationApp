package microservices.book.multiplication.domain;

/**
 * This class represents a Multiplication in our application.
 */
//public class Multiplication {
//
//    // Both factors
//    private int factorA;
//    private int factorB;
//
//    // The result of the operation A * B
//    private int result;
//
//    public Multiplication(int factorA, int factorB) {
//        this.factorA = factorA;
//        this.factorB = factorB;
//        this.result = factorA * factorB;
//    }
//
//    public int getFactorA() {
//        return factorA;
//    }
//
//    public int getFactorB() {
//        return factorB;
//    }
//
//    public int getResult() {
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "Multiplication{" +
//                "factorA=" + factorA +
//                ", factorB=" + factorB +
//                ", result(A*B)=" + result +
//                '}';
//    }
//
//}

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**

 * This represents a Multiplication (a * b) .

 */

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    // Both factors
    private final int factorA;
    private final int factorB;
    // TODO: manually added line, conflict with the code from the book
    private final int result = 0;

    // Empty constructor for JSON (de)serialization
    Multiplication() {
        this(0, 0);
    }
}