package com.cg.tsw.ui;

enum ConstructorTest {

    PLUS("Plus One"), MINUS("MinusTwo"), TIMES("MultiplyByFour"), DIVIDE(
            "DivideByZero");
    private String operationName;

    private ConstructorTest(final String operationName) {
        setOperationName(operationName);
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(final String operationName) {
        this.operationName = operationName;
    }

    public static ConstructorTest getOperationName(final String operationName) {

        for (ConstructorTest oprname : ConstructorTest.values()) {
            if (operationName.equals(oprname.toString())) {
                return oprname;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return operationName;
    }
}

public class EnumDemo2 {
    public static void main(String[] args) {

    	String name = "MinusTwo";
    	ConstructorTest test = ConstructorTest.getOperationName(name);
        switch (test) {
        case PLUS:
            System.out.println("Plus.....");
            break;
        case MINUS:
            System.out.println("Minus.....");
            break;

        default:
            System.out.println("Nothing..");
            break;
        }
    }
}