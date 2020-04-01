package com.algorithms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class IntegerPrinterTest {

    @Spy
    private IntegerPrinter testedInstance = new IntegerPrinter();

    @Test
    public void shouldNotPrintZero(){
        //when
        testedInstance.printAsHashesAndAsterixes(0);
        //then
        verify(testedInstance, never()).printLine(anyString());
    }

    @Test
    public void shouldNotPrintNegativeNumber(){
        //when
        testedInstance.printAsHashesAndAsterixes(-1);
        //then
        verify(testedInstance, never()).printLine(anyString());
    }

    @Test
    public void shouldPrintOne(){
        //when
        testedInstance.printAsHashesAndAsterixes(1);
        //then
        verify(testedInstance).printLine("*");
    }

    @Test
    public void shouldPrintTwo(){
        //when
        testedInstance.printAsHashesAndAsterixes(2);
        //then
        InOrder inOrder = inOrder(testedInstance);
        inOrder.verify(testedInstance).printLine("*#");
        inOrder.verify(testedInstance).printLine("#*");
    }

    @Test
    public void shouldPrintThree(){
        //when
        testedInstance.printAsHashesAndAsterixes(3);
        //then
        InOrder inOrder = inOrder(testedInstance);
        inOrder.verify(testedInstance).printLine("*##");
        inOrder.verify(testedInstance).printLine("#**");
        inOrder.verify(testedInstance).printLine("*##");
    }

    @Test
    public void shouldPrintFour(){
        //when
        testedInstance.printAsHashesAndAsterixes(4);
        //then
        InOrder inOrder = inOrder(testedInstance);
        inOrder.verify(testedInstance).printLine("*###");
        inOrder.verify(testedInstance).printLine("##**");
        inOrder.verify(testedInstance).printLine("**##");
        inOrder.verify(testedInstance).printLine("###*");
    }

    @Test
    public void shouldPrintFive(){
        //when
        testedInstance.printAsHashesAndAsterixes(5);
        //then
        InOrder inOrder = inOrder(testedInstance);
        inOrder.verify(testedInstance).printLine("*####");
        inOrder.verify(testedInstance).printLine("###**");
        inOrder.verify(testedInstance).printLine("***##");
        inOrder.verify(testedInstance).printLine("###**");
        inOrder.verify(testedInstance).printLine("*####");
    }
}
