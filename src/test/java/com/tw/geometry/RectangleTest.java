package com.tw.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    @Test
    void shouldAreaBe12WhenLengthIs3andBreadthIs4() {
        Rectangle rectangle = new Rectangle();
        int actualArea = rectangle.area(3, 4);
        assertEquals(12, actualArea);
    }

    @Test
    void shouldAreaBe20WhenLengthIs5andBreadthIs4() {
        Rectangle rectangle = new Rectangle();
        int actualArea = rectangle.area(5, 4);
        assertEquals(20, actualArea);
    }
    @Test
    void shouldPerimeterBe2WhenLengthIs1andBreadthIs1() {
        Rectangle rectangle = new Rectangle();
        int actualPerimeter = rectangle.perimeter(1, 1);
        assertEquals(2, actualPerimeter);
    }

    @Test
    void shouldPerimeterBe60WhenLengthIs20andBreadthIs10() {
        Rectangle rectangle = new Rectangle();
        int actualPerimeter = rectangle.perimeter(20, 10);
        assertEquals(60, actualPerimeter);
    }
}