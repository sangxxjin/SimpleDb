package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class SimpleDbTest {

    private static SimpleDb simpleDb;

    @BeforeAll
    public static void beforeAll() {
        simpleDb = new SimpleDb("localhost", "root", "1234", "simpleDb__test");
    }
}