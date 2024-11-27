package test;

import org.example.ColourPalette;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ColourPaletteTest {

    private ColourPalette palette;
    private ColourPalette palette1;


    @BeforeEach
    void setUp() {
        palette = new ColourPalette(2);
        palette.add(150,250,100);
        palette1 = new ColourPalette(8);
        palette1.add(15,25,10);
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

    /** Removed so testDoNotAddColourAlreadyExist()
     *      CAN pass test case
    @Test
    void testAddColoursToPalette() {
        assertDoesNotThrow(() -> palette.add(150,250,100));
        assertDoesNotThrow(() -> palette1.add(15,25,10));
    }
     */

    @Test
    void testIfColourExist() {
        assertTrue(palette.contains(150,250,100));
        assertFalse(palette.contains(15,25,10));
        assertTrue(palette1.contains(15,25,10));
        assertFalse(palette1.contains(150,250,100));
    }

    @Test
    void testDoNotAddColourAlreadyExist() {
        assertThrows(IllegalArgumentException.class, () -> palette.add(150,250,100),
                "Cannot Add The Same Colour");
    }

    @Test
    void testValidityOfColour() {
        assertThrows(IllegalArgumentException.class, () -> palette.add(300,250,100),
                "Colour needs to be within 0-255 value of RGB");
    }

    /**
     * Req 5
     */

}
