package com.example;


import org.junit.Assert;
import org.junit.Test;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Неверный список еды", feline.getFood("Хищник"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals("Неверное семейство", expectedFamily, feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = 5;
        int expectedKittens = kittensCount;
        Assert.assertEquals("Неверное колличество", expectedKittens, feline.getKittens(5));
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        int kittensCount = 1;
        int expectedKittens = kittensCount;
        Assert.assertEquals("Неверное колличество", expectedKittens, feline.getKittens());
    }

}
