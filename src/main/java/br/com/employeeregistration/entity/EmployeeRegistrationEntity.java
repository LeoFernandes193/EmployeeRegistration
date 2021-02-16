package br.com.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TB_EMPLOYEE_REGISTRATION")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRegistrationEntity {

    @Id
    @Column(name = "ID_EMPLOYEE")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idEmployee;

    @Column(name = "NAME_EMPLOYEE", length = 255)
    private String nameEmployee;

    @Column(name = "CPF", unique = true)
    private String registrationPhysicalPerson;

    @Column(name = "DATE_INSERT")
    private ZonedDateTime dateInsert;
}
