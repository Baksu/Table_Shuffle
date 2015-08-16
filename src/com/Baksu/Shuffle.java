package com.Baksu;

import java.util.List;

public class Shuffle {

    public int[] shuffleTab(int[] tab){
        if(tab.length % 2 != 0){
            throw new IllegalArgumentException();
        }
        final int div = tab.length/2;
        int help;
        int iterator = 1;
        int range = div-1;

        while(range > 0){
            help = tab[iterator + range];
            System.arraycopy(tab,iterator,tab,iterator+1,range);
            tab[iterator] = help;
            iterator += 2;
            range--;
        }

        return tab;
    }

    public int[] shuffleTabWithHelp(int[] tab){
        if(tab.length % 2 != 0){
            throw new IllegalArgumentException();
        }
        int[] tabHelp = new int[tab.length];
        int div = tab.length/2;
        int i = 0;
        int place = 0;

        while(i < div){
            tabHelp[place] = tab[i];
            i++;
            place +=2;
        }

        i = div;
        place = 1;

        while(i < tab.length){
            tabHelp[place] = tab[i];
            i++;
            place +=2;
        }

        return tabHelp;
    }

    public List shuffleArray(List array){
        if(array.size() % 2 != 0){
            throw new IllegalArgumentException();
        }
        final int div = array.size()/2;
        int place = 1;
        int range = div-1;

        while(range >= 0){
            array.add(place, array.get(place+range));
            array.remove(place+range+1);

            place += 2;
            range--;
        }
        return array;
    }

}
