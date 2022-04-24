package my.example.bdd.calculator;

public class Calculator {
    private Integer result;
    public Integer add(Integer a, Integer b) {
        result = a + b;
        return result;
    }
    public Integer getResult() {
        return result;
    }

}
