package categoria;

import java.util.*;

import carritocompras.Producto;
import tiendas.Tienda;


public class Categoria {
	private int id;
	private String nombre;
	private String descripcion;
	
    private ArrayList<Tienda> tiendas;

	public Categoria(int id, String nombre, String descripcion, ArrayList<Tienda> tiendas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiendas = tiendas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ArrayList<Tienda> getTiendas() {
		return tiendas;
	}

	public void setTiendas(ArrayList<Tienda> tiendas) {
		this.tiendas = tiendas;
	}

	public void agregarTienda(Tienda tienda) {
		this.tiendas.add(tienda);
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", tiendas=" + tiendas
				+ "]";
	}
}

	

