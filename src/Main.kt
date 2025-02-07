fun main() {
    val cafetera1 = Cafetera("Sala")
    val cafetera2 = Cafetera("Cocina", 750)
    val cafetera3 = Cafetera("Oficina", 500, 200)

    val capacidadesTazas = listOf(50, 75, 100)
    val colores = Color.values()
    val tazas = List(20) {
        Taza(colores.random(), capacidadesTazas.random())
    }

    println("**********************************************")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    tazas.forEach { println(it) }

    println("**********************************************")
    println("Llenar la cafetera1 de café...")
    cafetera1.llenar()
    println("Vaciar la cafetera2...")
    cafetera2.vaciar()
    println("Agregar café a la cafetera2 a la mitad de su capacidad...")
    cafetera2.agregarCafe(cafetera2.capacidad / 2)
    println("Agregar 400 c.c. de café a la cafetera3...")
    cafetera3.agregarCafe(400)

    println("**********************************************")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)

    println("**********************************************")
    println("Servir café en las tazas...")
    tazas.forEach { taza ->
        when {
            cafetera1.cantidad > 0 -> cafetera1.servirTaza(taza)
            cafetera2.cantidad > 0 -> cafetera2.servirTaza(taza)
            cafetera3.cantidad > 0 -> cafetera3.servirTaza(taza)
        }
    }

    println("**********************************************")
    println(cafetera1)
    println(cafetera2)
    println(cafetera3)
    tazas.forEach { println(it) }
}