package com.techreturners.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TaskTest {


    @Test
    @DisplayName("Test task description GET")
    public void testTaskDescription() {
        Task t = new Task("abc123", "Some task description", false);

        assertEquals("Some task description", t.getDescription(), "Task description was incorrect");
    }
}
