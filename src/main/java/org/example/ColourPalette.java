package org.example;

public class ColourPalette {
    private int totalColour;

    public ColourPalette() {
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
}
