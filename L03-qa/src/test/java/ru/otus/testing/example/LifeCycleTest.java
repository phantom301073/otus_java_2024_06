package ru.otus.testing.example;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"java:S2699"})
class LifeCycleTest {
    private static final Logger logger = LoggerFactory.getLogger(LifeCycleTest.class);

    // Подготовительные мероприятия. Метод выполнится один раз, перед всеми тестами
    @BeforeAll
    public static void globalSetUp() {
        logger.info("@BeforeAll");
    }

    // Подготовительные мероприятия. Метод выполнится перед каждым тестом
    @BeforeEach
    public void setUp() {
        logger.info("@BeforeEach. ");
        getHashAndLog();
    }

    // Сам тест
    @Test
    void anyTest1() {
        logger.info("@Test: anyTest1. ");
        getHashAndLog();
    }

    // Еще тест
    @Test
    void anyTest2() {
        logger.info("@Test: anyTest2. ");
        getHashAndLog();
    }
    // Завершающие мероприятия. Метод выполнится после каждого теста
    @AfterEach
    public void tearDown() {
        logger.info("@AfterEach. ");
        getHashAndLog();
    }
    // Завершающие мероприятия. Метод выполнится один раз, после всех тестов
    @AfterAll
    public static void globalTearDown() {
        logger.info("@AfterAll");
    }

    private void getHashAndLog() {
        logger.info("Экземпляр тестового класса: {}", Integer.toHexString(hashCode()));
    }
}
