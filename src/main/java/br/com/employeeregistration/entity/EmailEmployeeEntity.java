package br.com.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column(name = "ID_EMPLOYEE")
    private EmployeeRegistrationEntity employeeRegistrationEntity;

    @JoinColumn(name = "EMAIL_ANDRESS")
    private String emailAndress;
}
