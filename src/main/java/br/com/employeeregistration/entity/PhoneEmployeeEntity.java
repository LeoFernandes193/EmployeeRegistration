package br.com.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TB_PHONE_EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhoneEmployeeEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ID_PHONE_EMPLOYEE")
    private Integer idPhoneEmployee;

    @JoinColumn(name = "ID_EMPLOYEE")
    private EmployeeRegistrationEntity employeeRegistrationEntity;

    @Column(name = "PHONE_EMPLOYEE")
    private String phoneEmployee;

    @Column(name = "DATE_INSERT")
    private ZonedDateTime dateInsert;
}
