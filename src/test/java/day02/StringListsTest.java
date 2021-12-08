package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringListsTest {
    @Test
    void shortListTest() {
        StringLists stringLists = new StringLists();
        assertEquals(List.of("aa","bb","dd"), stringLists.shortestWords(List.of("aaa", "aa", "bb", "cccc", "dd")));
    }
}