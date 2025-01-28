package com.camilo.salasdecine.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    public int idCliente;

    @Column(name = "tipo_identificacion")
    public String tipoIdentificacion;

    @Column(name = "identificacion")
    public int identificacion;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "apellido")
    public String apellido;

    @Column(name = "direccion")
    public String direccion;

    @Column(name = "ciudad")
    public String ciudad;

    @Column(name = "departamento")
    public String departamento;

    @Column(name = "pais")
    public String pais;

    @Column(name = "acumula_puntos")
    public String acumulaPuntos;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAcumulaPuntos() {
        return acumulaPuntos;
    }

    public void setAcumulaPuntos(String acumulaPuntos) {
        this.acumulaPuntos = acumulaPuntos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
