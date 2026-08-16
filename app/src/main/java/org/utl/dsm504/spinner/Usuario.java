package org.utl.dsm504.spinner;

public class Usuario {
    private Integer id;
    private String nombre;
    private String apellidoM;
    private String apellidoP;
private String usuarioCustom;
    public Usuario(Integer id, String nombre, String apellidoM, String apellidoP) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    @Override
    public String toString() {
    this.usuarioCustom = this.usuarioCustom = id +" "+nombre+" "+apellidoP+" "+apellidoM;
    return  usuarioCustom;
    }
}
