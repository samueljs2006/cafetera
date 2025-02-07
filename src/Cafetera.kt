class Cafetera {
    val ubicacion: String
    val capacidad: Int
    var cantidad: Int

    constructor(ubicacion: String) {
        this.ubicacion = ubicacion
        this.capacidad = 1000
        this.cantidad = 0
    }

    constructor(ubicacion: String, capacidad: Int) {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = capacidad
    }

    constructor(ubicacion: String, capacidad: Int, cantidad: Int) {
        this.ubicacion = ubicacion
        this.capacidad = capacidad
        this.cantidad = if (cantidad > capacidad) capacidad else cantidad
    }

    fun llenar() {
        cantidad = capacidad
    }

    fun servirTaza(taza: Taza) {
        val servirCantidad = if (cantidad >= taza.capacidad) taza.capacidad else cantidad
        taza.llenar(servirCantidad)
        cantidad -= servirCantidad
    }

    fun vaciar() {
        cantidad = 0
    }

    fun agregarCafe(cantidad: Int = 200) {
        this.cantidad = (this.cantidad + cantidad).coerceAtMost(capacidad)
    }

    override fun toString(): String {
        return "Cafetera(ubicación = $ubicacion, capacidad = ${capacidad}c.c., cantidad = ${cantidad}c.c.)"
    }
}
