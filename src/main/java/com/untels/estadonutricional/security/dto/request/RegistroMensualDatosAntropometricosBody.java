
package com.untels.estadonutricional.security.dto.request;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class RegistroMensualDatosAntropometricosBody {
    
    @Min(0)
    private float estatura;

    @Min(0)
    private float peso;

    @Min(0)
    private float contornoCintura;

    @Min(0)
    private float contornoCadera;

    @Min(0)
    private float nivelEstres;

    @Min(0)
    private float actividadFisica;

    @NotBlank
    private String rendimientoAcademico;

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getContornoCintura() {
        return contornoCintura;
    }

    public void setContornoCintura(float contornoCintura) {
        this.contornoCintura = contornoCintura;
    }

    public float getContornoCadera() {
        return contornoCadera;
    }

    public void setContornoCadera(float contornoCadera) {
        this.contornoCadera = contornoCadera;
    }

    public float getNivelEstres() {
        return nivelEstres;
    }

    public void setNivelEstres(float nivelEstres) {
        this.nivelEstres = nivelEstres;
    }

    public float getActividadFisica() {
        return actividadFisica;
    }

    public void setActividadFisica(float actividadFisica) {
        this.actividadFisica = actividadFisica;
    }

    public String getRendimientoAcademico() {
        return rendimientoAcademico;
    }

    public void setRendimientoAcademico(String rendimientoAcademico) {
        this.rendimientoAcademico = rendimientoAcademico;
    }
    
    
    
}