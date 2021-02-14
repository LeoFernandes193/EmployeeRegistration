package br.com.employeeregistration.Repository;

import br.com.employeeregistration.entity.EmployeeRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistrationEntity,Integer> {
}
