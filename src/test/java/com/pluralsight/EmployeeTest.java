package com.pluralsight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void Employee_should_work_40_hr_per_week(){
        Employee employee = new Employee("shashwot","software",20,40);

        assertEquals(40,employee.getHoursWork());
    }
}

