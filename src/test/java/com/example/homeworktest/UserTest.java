package com.example.homeworktest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    User user1 = new User("local@lo.com", "local");

    @Test
    @DisplayName("тестирование создания объекта")
    public void objectCreationTest() {
        assertEquals(user1.getMail(), "local@lo.com", "Майл не установился");
        assertEquals(user1.getLogin(), "local", "Логин не установился");

    }

    @Test
    @DisplayName("тестирование создания объекта без передачи параметров")
    public void nullLoginMailTest() {
        assertNotNull(user1.getLogin());
        assertNotNull(user1.getMail());
    }

    @Test
    @DisplayName("тест на корректный Email адрес в поле email в классе ")
    public void correctMail() {
        assertEquals(user1.getMail().contains("@"), true);
        assertEquals(user1.getMail().contains("."), true);
    }

    @Test
    @DisplayName("Тест равны ли login и email")
    public void loginMailEquals() {
        assertNotEquals(user1.getMail(), user1.getLogin());
    }

}
