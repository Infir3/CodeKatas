package com.sb.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramCheckerTest {

    private AnagramChecker cut;

    @BeforeEach
    void setUp() {
        this.cut = new AnagramChecker();
    }

    @Test
    void givenAnagram_shouldReturnTrue() {
        assertTrue(this.cut.check("Lagerregal", "Regallager"));
    }

    @Test
    void givenIdenticalWords_shouldReturnFalse() {
        assertFalse(this.cut.check("test", "test"));
    }

    @Test
    void givenCompletelyDifferentWords_shouldReturnFalse() {
        assertFalse(this.cut.check("Foo", "Bar"));
    }

    @Test
    void givenWordsWithTheSameCharsButDifferentLength_shouldReturnFalse() {
        assertFalse(this.cut.check("aabb", "aab"));
    }
}
