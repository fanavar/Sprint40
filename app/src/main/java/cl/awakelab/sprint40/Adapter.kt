package cl.awakelab.sprint40


import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.sprint40.databinding.ItemLayoutBinding
import coil.load


class Adapter : RecyclerView.Adapter <Adapter.ViewHolder> (){
    var zapatos = mutableListOf<Zapato>()
    var callback: ZapatoCallback? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,  false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = zapatos[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return zapatos.size
    }

    fun setData(listaZapatos: List<Zapato>) {
        this.zapatos = listaZapatos.toMutableList()
    }

    inner class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(zapato: Zapato) {
            val texto = "Nombre: ${zapato.nombre}, Precio: ${zapato.precio}"
            binding.textView.text = zapato.nombre
            binding.textView2.text = zapato.precio.toString()
            binding.imageView.load(zapato.imgUrl)

        }

    }
    fun setZapatoCallback(c: ZapatoCallback) {
        this.callback = c
    }
}
interface ZapatoCallback{
    fun showZapato(texto: String)
}