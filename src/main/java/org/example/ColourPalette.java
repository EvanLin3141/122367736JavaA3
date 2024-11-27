package org.example;

import java.util.ArrayList;

public class ColourPalette {
    private final int totalColour;
    private final ArrayList<int[]> palette = new ArrayList<>();

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
        this.errorCheck(red, green, blue);
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

    public boolean isValidColour(int red, int green, int blue) {
        return red >= 0 && red <= 255 && green >= 0 && green <= 255 && blue >= 0 && blue <= 255;
    }

    public void errorCheck(int red, int green, int blue) {
        if (palette.size() >= this.totalColour) {
            throw new IllegalStateException("Palette Exceed Capacity");
        }
        if (this.contains(red, green, blue)) {
            throw new IllegalArgumentException("Cannot Add The Same Colour");
        }
        if (!this.isValidColour(red, green, blue)) {
            throw new IllegalArgumentException("Colour needs to be within 0-255 value of RGB");
        }
    }
}
