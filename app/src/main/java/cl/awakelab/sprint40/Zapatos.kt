package cl.awakelab.sprint40


data class Zapato(val nombre: String, val precio: Double, val imgUrl: String)

class Zapatos {
    companion object {
        val zapatos = mutableListOf<Zapato>().apply {
            add(Zapato("Lippi Outdoor", 46.403, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dwadfda27c/images/imagenes-productos/667/261048-0001-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Power Baxter", 199.989, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-paris-marketplace/default/dw35b4b7b0/images/imagenes-productos/800/MKU1/MKU1SS7RXV-0200-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Crestwood Mid Waterp", 74.863, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-paris-marketplace/default/dwa2c2a8e0/images/imagenes-productos/800/MKMW/MKMWH8GVJF-0200-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Haka Honu Pampa", 121.079, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dw17c6c856/images/imagenes-productos/683/247022-0300-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Adidas Tracerocker 2", 337.489, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dw3184fa81/images/imagenes-productos/667/142354-0001-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Salomon Wander Gtx", 184.350, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-paris-marketplace/default/dw18085135/images/imagenes-productos/800/MKJ0/MKJ011X0WU-0300-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Adidas Terrex", 218.757, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dw658ee89a/images/imagenes-productos/667/142383-0800-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Nalca Outdoor", 52.503, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dw397544a5/images/imagenes-productos/683/868332-0021-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Salomon Hypulse", 30.260, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-paris-marketplace/default/dw5580d7e6/images/imagenes-productos/800/MKQO/MKQO41327B-0001-001.jpg?sw=1480&sh=2000&sm=fit"))
            add(Zapato("Spalding sprint40", 34.264, "https://www.paris.cl/dw/image/v2/BCHW_PRD/on/demandware.static/-/Sites-cencosud-master-catalog/default/dw8620b7df/images/imagenes-productos/667/985869-0200-001.jpg?sw=1480&sh=2000&sm=fit"))
        }
    }
}