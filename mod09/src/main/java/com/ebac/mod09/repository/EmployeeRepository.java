package com.ebac.mod09.repository;

import com.ebac.mod09.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.time.LocalDateTime;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Query("SELECT e, COUNT(a) FROM Employee e LEFT JOIN e.rescuedAnimals a " +
            "WHERE (a.rescueDate IS NULL OR a.rescueDate BETWEEN :startDate AND :endDate) " +
            "GROUP BY e")
    List<Object[]> findRescueCountByEmployeeAndDateRange(
            @Param("startDate") LocalDateTime startDate,
            @Param("endDate") LocalDateTime endDate);
}
