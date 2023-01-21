package com.yutian.proxy;

import com.yutian.spring.proxy.Calculator;
import com.yutian.spring.proxy.CalculatorPureImpl;
import com.yutian.spring.proxy.ProxyFactory;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void test(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorPureImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);

    }
}
