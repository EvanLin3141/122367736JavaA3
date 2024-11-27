package test;

import org.example.ColourPalette;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourPaletteTest {

    private ColourPalette palette;
    private ColourPalette palette1;


    @BeforeEach
    void setUp() {
        palette = new ColourPalette(2);
        palette1 = new ColourPalette(10);
    }
    @Test
    void testIfColourPaletteExists() {
        assertNotNull(palette, "ColourPalette should be instantiated successfully");
    }

    @Test
    void testTotalNumberOfColourInPalette() {
        assertEquals(2, palette.getTotalColours());
        assertEquals(10, palette1.getTotalColours());
    }
}
