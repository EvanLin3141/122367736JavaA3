package org.example;

import java.util.ArrayList;

public class ColourPalette {
    private int totalColour;
    private ArrayList<int[]> palette = new ArrayList<>();

    public ColourPalette() {
        throw new IllegalArgumentException("Need to give number of colours.");
    }

    public ColourPalette(int totalColour) {
        if (totalColour <= 1 || (totalColour & (totalColour - 1)) != 0) {
            throw new IllegalArgumentException("Total number of colours needs to be " +
                    "greater than 1 & to the power of 2.");
        } else {
            this.totalColour = totalColour;
        }
    }

    public int getTotalColours() {
        return this.totalColour;
    }

    public void add(int red, int green, int blue) {
        this.palette.add(new int[]{red, green, blue});
    }

    public boolean contains (int red, int green, int blue) {
        for (int[] color : palette) {
            if (color[0] == red && color[1] == green && color[2] == blue) {
                return true;
            }
        }
        return false;
    }


}
