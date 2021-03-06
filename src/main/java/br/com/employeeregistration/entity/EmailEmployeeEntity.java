package br.com.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "TB_EMAIL_EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmailEmployeeEntity {

    @Id
    @Column(name = "ID_EMAIL")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idEmail;

    @JoinColumn(name = "ID_EMPLOYEE")
    private EmployeeRegistrationEntity employeeRegistrationEntity;

    @Column(name = "EMAIL_ANDRESS", length = 60)
    private String emailAndress;

    @Column(name = "DATE_INSERT")
    private ZonedDateTime dateInsert;
}
