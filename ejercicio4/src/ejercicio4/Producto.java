package ejercicio4;

import java.io.Serializable;
// clase producto, para crear el objeto producto
public class Producto implements Serializable{
    // elementos que conforman un rpoducto
	private int idProducto;
	private String nombre;
	private double precio;
	private Categoria idCategoria;
	public Producto(){}
        // asignacion del idProducto a un producto
	public void setIdProducto(int idProd){
		this.idProducto=idProd;
	}
        // asignacion del nombre a un producto
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        // asignacion del precio a un producto
        public void setPrecio(double precio) {
            this.precio = precio;
        }
        // asignacion de la categoria a un producto
        public void setIdCategoria(Categoria idCategoria) {
            this.idCategoria = idCategoria;
        }
        // obtencion del id de un producto
        public int getIdProducto() {
            return idProducto;
        }
        // obtencion del nombre del producto 
        public String getNombre() {
            return nombre;
        }
        // obtencion del precio del producto 
        public double getPrecio() {
            return precio;
        }
        // obtencion de la categoria del producto 
        public Categoria getIdCategoria() {
            return idCategoria;
        }
	
        @Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ID").append(getIdProducto()).append("\n");
		sb.append("Nombre").append(getNombre()).append("\n");
		sb.append("Precio").append(getPrecio()).append("\n");
		sb.append("Categoria").append(getIdCategoria().getIdCategoria()).append("\n");
		sb.append("Nombre Categoria").append(getIdCategoria().getNombre()).append("\n");
		return sb.toString();
	}
}