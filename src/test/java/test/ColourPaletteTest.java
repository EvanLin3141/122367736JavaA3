package test;

import org.example.ColourPalette;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;



class ColourPaletteTest {

    private ColourPalette palette;
    private ColourPalette palette1;


    @BeforeEach
    void setUp() {
        palette = new ColourPalette(2);
        palette1 = new ColourPalette(8);
    }

    /**
     * Requirement 1
     */
    @Test
    void testIfColourPaletteExists() {
        assertNotNull(palette, "ColourPalette should be instantiated successfully");
    }

    @Test
    void testTotalNumberOfColourInPalette() {
        assertEquals(2, palette.getTotalColours());
        assertEquals(8, palette1.getTotalColours());
    }

    /**
     * Req 2
     */
    @Test
    void isTotalNumberOfColoursPowerOfTwo() {
        assertThrows(IllegalArgumentException.class, () -> new ColourPalette(10),
                "Total number of colours needs to be greater than 1 & to the power of 2.");

        assertDoesNotThrow(() -> new ColourPalette(2), "ColourPalette created.");
    }

    /**
     * Req 3
     */
    @Test
    void createExceptionWhenNoSizeGiven() {
        assertThrows(IllegalArgumentException.class, () -> new ColourPalette(),
                "Need to give number of colours.");
    }

}
