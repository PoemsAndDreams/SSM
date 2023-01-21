package com.yutian.spring.proxy;

public class CalculatorStaticProxy implements Calculator{

    private CalculatorPureImpl target;

    public CalculatorStaticProxy(CalculatorPureImpl target) {
        this.target = target;
    }

    @Override
    public int add(int i, int j) {
        return 0;
    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}
