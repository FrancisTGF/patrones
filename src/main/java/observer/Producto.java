package observer;

import java.math.BigDecimal;
import java.util.Observable;

public class Producto {

	    /**
	     * Clase que contiene el evento que se enviara a los observadores.
	     */
	    public class PrecioEvent {
	        private Producto producto;
	        private BigDecimal precioAntiguo;
	        private BigDecimal precioNuevo;
	        public PrecioEvent(Producto producto, BigDecimal precioAntiguo, BigDecimal precioNuevo) {
	            this.producto = producto;
	            this.precioAntiguo = precioAntiguo;
	            this.precioNuevo = precioNuevo;
	        }
	        public Producto getProducto() {
	            return producto;
	        }
	        public BigDecimal getPrecioAntiguo() {
	            return precioAntiguo;
	        }
	        public BigDecimal getPrecioNuevo() {
	            return precioNuevo;
	        }
	
	        

}
	    // Declaramos el objeto observado
	    private static ProductoObservable OBSERVABLE;
	    private String nombre;
	    private BigDecimal precio;
	    // Iniciamos el objeto observado
	    static {
	        OBSERVABLE = new ProductoObservable();
	    }
	    // Devolvemos el objeto observado
	    public static Observable getObservable() {
	        return OBSERVABLE;
	    }
	    public Producto(String nombre, BigDecimal precio) {
	        this.nombre = nombre;
	        this.precio = precio;
	    }
	    public String getNombre() {
	        return nombre;
	    }
	    public BigDecimal getPrecio() {
	        return precio;
	    }
	    // Modificamos el precio y disparamos la notificiacion.
	    public void setPrecio(BigDecimal precio) {
	        PrecioEvent event = new PrecioEvent(this, this.precio, precio);
	        this.precio = precio;
	        synchronized (OBSERVABLE) {
	            OBSERVABLE.setChanged();
	            OBSERVABLE.notifyObservers(event);
	        }
	    }
	    /**
	     * Observable, define el objeto que será observado.
	     */
	    private static class ProductoObservable extends Observable {
	        @Override
	        public synchronized void setChanged() {
	            super.setChanged();
	        }
	    }
	}