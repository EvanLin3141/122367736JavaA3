package test;

import org.example.ColourPalette;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ColourPaletteTest {
    @Test
    void testIfColourPaletteExists() {
        ColourPalette palette = new ColourPalette();
        assertNotNull(palette, "ColourPalette should be instantiated successfully");
    }
}
