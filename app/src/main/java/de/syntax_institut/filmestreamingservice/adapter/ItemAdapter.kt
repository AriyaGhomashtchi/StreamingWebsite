package de.syntax_institut.filmestreamingservice.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.syntax_institut.filmestreamingservice.R
import de.syntax_institut.filmestreamingservice.data.model.MovieTitle

/**
 * Der Item Adapter weist den views im ViewHolder den Inhalt zu
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<MovieTitle>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * der ViewHolder umfasst die View uns stellt einen Listeneintrag dar
     */
    inner class ItemViewHolder(itemView: View, view: Any) : RecyclerView.ViewHolder(itemView) {
        // TODO Schreibe hier deinen Code
        val flixme = itemView.findViewById<TextView>(R.id.flixme)
        val funtext = itemView.findViewById<TextView>(R.id.flixme)
    }

    /**
     * hier werden neue ViewHolder erstellt
     */
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        // das itemLayout wird zur ItemView aufgeblasen
        // TODO Schreibe hier deinen Code
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)

                return ItemViewHolder(adapterLayout,viewType)

        // und in einem ViewHolder zurückgegeben
    }

    /**
     * hier findet der Recyclingprozess statt
     * die vom ViewHolder bereitgestellten Parameter erhalten die Information des Listeneintrags
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // Hole das movieTitle Objekt für die enthaltenen Informationen
        // TODO Schreibe hier deinen Code
        val titel = dataset[position]

        holder.funtext.text = context.getString(titel.stringResource)

    }

    /**
     * damit der LayoutManager weiß, wie lang die Liste ist
     */
    override fun getItemCount(): Int {
        return dataset.size
    }
}

private fun <T> Any.findViewById(flixme: Int) {
}
