package ejercicio4;
/*Clase categoria para crear el objeto categoria y poder accesar a este por medio de la clase y sus metodos.*/
public class Categoria {
    private int idCategoria;
    private String Nombre;
    private String Descripcion;

    public Categoria() {
    }
    /*Obtención de IdCategoria*/
    public int getIdCategoria() {
        return idCategoria;
    }
     /*Asignación de IdCategoria*/
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
     /*Obtención del nombre de la categoria*/
    public String getNombre() {
        return Nombre;
    }
     /*Asignación del nombre a una categoria*/
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
     /*Obtención de la descripcion de la categoria*/
    public String getDescripcion() {
        return Descripcion;
    }
     /*Asignación de la descripcion a una categoria*/
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public String toString(){
            StringBuilder sb = new StringBuilder();
            sb.append("ID").append(getIdCategoria()).append("\n");
            sb.append("Nombre").append(getNombre()).append("\n");
            sb.append("Descripción").append(getDescripcion()).append("\n");
            return sb.toString();
    }
}
