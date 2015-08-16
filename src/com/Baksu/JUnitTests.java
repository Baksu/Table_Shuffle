package com.Baksu;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class JUnitTests {

    @Test
    public void tableShouldShuffle(){
        Shuffle shuffleTest = new Shuffle();

        assertArrayEquals("size 0: ", createOutputArray(0), shuffleTest.shuffleTab(createInputArray(0)));
        assertArrayEquals("size 10: ", createOutputArray(10), shuffleTest.shuffleTab(createInputArray(10)));
        assertArrayEquals("size 16: ", createOutputArray(16),shuffleTest.shuffleTab(createInputArray(16)));
        assertArrayEquals("size 1000: ", createOutputArray(1000),shuffleTest.shuffleTab(createInputArray(1000)));
        assertArrayEquals("size 1000000: ", createOutputArray(1000000),shuffleTest.shuffleTab(createInputArray(1000000)));
    }

    @Test (expected = Exception.class)
    public void tableShuffleShouldThrowExeption(){
        Shuffle shuffleTest = new Shuffle();

        shuffleTest.shuffleTab(createInputArray(7));
        shuffleTest.shuffleTabWithHelp(createInputArray(7));
        shuffleTest.shuffleArray(createInputArrayList(7));
    }

    @Ignore
    public void tableShouldShuffleWithHelp(){
        Shuffle shuffleTest = new Shuffle();

        assertArrayEquals("size 10: ", createOutputArray(10),shuffleTest.shuffleTabWithHelp(createInputArray(10)));
        assertArrayEquals("size 16: ", createOutputArray(16),shuffleTest.shuffleTabWithHelp(createInputArray(16)));
        assertArrayEquals("size 1000: ", createOutputArray(1000),shuffleTest.shuffleTabWithHelp(createInputArray(1000)));
        assertArrayEquals("size 1000000: ", createOutputArray(1000000),shuffleTest.shuffleTabWithHelp(createInputArray(1000000)));
    }

    @Ignore
    public void tableShouldShuffleArray(){
        Shuffle shuffleTest = new Shuffle();


        assertEquals("size 10: ", createOutputArrayList(10), shuffleTest.shuffleArray(createInputArrayList(10)));
        assertEquals("size 16: ", createOutputArrayList(16), shuffleTest.shuffleArray(createInputArrayList(16)));
        assertEquals("size 1000: ", createOutputArrayList(1000), shuffleTest.shuffleArray(createInputArrayList(1000)));
        assertEquals("size 1000000: ", createOutputArrayList(1000000), shuffleTest.shuffleArray(createInputArrayList(1000000)));
    }

    private int[] createInputArray(int size){
        int[] tab = new int[size];

        for(int i = 0; i < size; i++) {
            tab[i] = i + 1;
        }
        return tab;
    }

    private int[] createOutputArray(int size){
        int[] tab = new int[size];
        int div = size/2;
        int add = 0;

        for(int i = 0; i < size; i+=2){
            tab[i] = add+1;
            tab[i+1] = div+add+1;
            add++;
        }
        return tab;
    }

    private List createInputArrayList(int size){
        ArrayList array = new ArrayList();

        for(int i = 0; i < size; i++) {
            array.add(i+1);
        }
        return array;
    }

    private List createOutputArrayList(int size){
        ArrayList array = new ArrayList();
        int div = size/2;
        int add = 0;

        for(int i = 0; i < size; i+=2){
            array.add(add+1);
            array.add(div+add+1);
            add++;
        }
        return array;
    }
}
