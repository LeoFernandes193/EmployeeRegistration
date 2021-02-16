package br.com.employeeregistration.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SECTOR_EMPLOYEE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SectorEmployeeEntity {

    @JoinColumn(name = "ID_EMPLOYEE")
    private Integer idEmployee;

    @JoinColumn(name = "ID_SECTOR")
    private Integer idSector;
}
