package tiendas;

import java.util.List;

import carritocompras.Horario;
import carritocompras.Producto;

public class Tienda {
	private String nombre;
	private String pasillo;
	private Horario horario;
	private List<Producto> productos;
	
	public Tienda(String nombre, String pasillo, Horario horario, List<Producto> productos) {
		super();
		this.nombre = nombre;
		this.pasillo = pasillo;
		this.horario = horario;
		this.productos = productos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPasillo() {
		return pasillo;
	}

	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

    public void agregarProducto(Producto item) {
        productos.add(item);
    }

    public void eliminarProducto(Producto item) {
        productos.remove(item);
    }

	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", pasillo=" + pasillo + ", horario=" + horario + ", productos=" + productos
				+ "]";
	}
	
    
}
