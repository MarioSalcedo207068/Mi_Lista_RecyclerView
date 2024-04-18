package salcedo.mario.mi_lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Cambiar el drawable
        val peliculas = listOf(
            Pelicula.(R.drawable.duna,"Duna","Descripción de Dune"),
            Pelicula.(R.drawable.godzila,"Godzila","Descripción de Godzila"),
            Pelicula.(R.drawable.inception,"Inception","Descripción de Inception")
        )

        val recycler_peliculas = findViewById<RecyclerView>(R.id.lista_view)
        recycler_peliculas.layoutManager = LinearLayoutManager(this)
    }
}