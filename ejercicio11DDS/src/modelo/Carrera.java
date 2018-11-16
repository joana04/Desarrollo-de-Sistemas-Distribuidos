package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity /*----------- IMPORTANTE-------*/
@Table(name = "carrera") /*----------- IMPORTANTE-------*/
@NamedQueries({
    @NamedQuery(name = "Carrera.findAll", query = "SELECT c FROM Carrera c")
    , @NamedQuery(name = "Carrera.findByIdCarrera", query = "SELECT c FROM Carrera c WHERE c.idCarrera = :idCarrera")
    , @NamedQuery(name = "Carrera.findByNombreCarrera", query = "SELECT c FROM Carrera c WHERE c.nombreCarrera = :nombreCarrera")
    , @NamedQuery(name = "Carrera.findByDescripcionCarrera", query = "SELECT c FROM Carrera c WHERE c.descripcionCarrera = :descripcionCarrera")})
public class Carrera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id /*--------------IMPORTANTE--------------------*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*----------- IMPORTANTE-------*/
    @Basic(optional = false) // IONDICA QUE LOS ATRIBUTOS SON OBLIGATORIOS, NOT NULL EN LA TABLA
    @Column(name = "idCarrera")
    private Integer idCarrera; // SI ESTOS SON IGUALES A LOS NOMBRES EN LA BASE, LAS DEMAS ANOTACIONES NO SON NECESARIAS /@basic y @Column)
    @Basic(optional = false)
    @Column(name = "nombreCarrera")
    private String nombreCarrera;
    @Basic(optional = false)
    @Column(name = "descripcionCarrera")
    private String descripcionCarrera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCarrera")
    private Collection<Alumno> alumnoCollection; // DICE QUE CARREERA TIENE ASOCIADO UN CONJUNTO DE ALUMNOS 

    public Carrera() {
    }

    public Carrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public Carrera(Integer idCarrera, String nombreCarrera, String descripcionCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
        this.descripcionCarrera = descripcionCarrera;
    }

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getDescripcionCarrera() {
        return descripcionCarrera;
    }

    public void setDescripcionCarrera(String descripcionCarrera) {
        this.descripcionCarrera = descripcionCarrera;
    }

    public Collection<Alumno> getAlumnoCollection() {
        return alumnoCollection;
    }

    public void setAlumnoCollection(Collection<Alumno> alumnoCollection) {
        this.alumnoCollection = alumnoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCarrera != null ? idCarrera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Carrera)) {
            return false;
        }
        Carrera other = (Carrera) object;
        if ((this.idCarrera == null && other.idCarrera != null) || (this.idCarrera != null && !this.idCarrera.equals(other.idCarrera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Carrera[ idCarrera=" + idCarrera + " ]";
    }
    
}
