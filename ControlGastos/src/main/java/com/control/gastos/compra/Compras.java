package com.control.gastos.compra;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Compras {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String compra;
    private String establecimiento;
    private String tarjeta;
    private String fecha;
    private String persona;
    private double monto;

}
