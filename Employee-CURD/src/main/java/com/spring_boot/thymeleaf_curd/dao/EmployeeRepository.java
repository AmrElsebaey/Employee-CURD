    package com.spring_boot.thymeleaf_curd.dao;

    import com.spring_boot.thymeleaf_curd.entity.Employee;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.List;

    public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

        public List<Employee> findAllByOrderByLastNameAsc();
    }
