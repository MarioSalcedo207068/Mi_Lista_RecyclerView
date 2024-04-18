package salcedo.mario.mi_lista

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptadorPeliculas(val peliculas_list: List<Pelicula>): RecyclerView.Adapter<AdaptadorPeliculas.PeliculasViewHolder>() {

    class PeliculasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imagen_pelicula: ImageView = itemView.findViewById(R.id.imagen1)
        var titulo: TextView = itemView.findViewById(R.id.titulo_pelicula)
        var desc: TextView = itemView.findViewById(R.id.desc_pelicula)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.lista_item, parent, false)
        return PeliculasViewHolder(itemView)
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int) {
        val pelicula: Pelicula = peliculas_list[position]
            holder.imagen_pelicula.setImageResource(pelicula.imagen)
            holder.titulo.text = pelicula.titulo
            holder.desc.text = pelicula.desc
    }
}