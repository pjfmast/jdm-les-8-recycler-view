package avd.jdm.les2recyclerview.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import avd.jdm.les2recyclerview.databinding.ItemMovieBinding
import avd.jdm.les2recyclerview.model.MovieUiModel
import avd.jdm.les2recyclerview.util.ImageLoader

class MovieAdapter(
    private val imageLoader: ImageLoader
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    lateinit var itemMovieBinding: ItemMovieBinding

    companion object {
        private val TAG = MovieAdapter::class.qualifiedName
        private var onCreateNr = 0
        private var onBindNr = 0
    }

    inner class MovieViewHolder(container: View) : RecyclerView.ViewHolder(container) {
        private val movieTitle = itemMovieBinding.itemMovieTitle
        private val movieType = itemMovieBinding.itemMovieType
        private val moviePoster = itemMovieBinding.itemMovieImage

        // bindData is called whenever new data is bound
        fun bindData(movieData: MovieUiModel) {
            movieTitle.text = "${movieData.title} (${movieData.year})"
            movieType.text = movieData.type
            imageLoader.loadImage(movieData.poster, moviePoster)
        }

    }

    private val movieData = mutableListOf<MovieUiModel>()

    fun setData(movieData: List<MovieUiModel>) {
        this.movieData.clear()
        this.movieData.addAll(movieData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        Log.i(TAG, "onCreateViewHolder: called ${++onCreateNr}")
        itemMovieBinding = ItemMovieBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MovieViewHolder(itemMovieBinding.root)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        Log.i(TAG, "onBindViewHolder: called ${++onBindNr}")

        holder.bindData(movieData[position])
    }

    override fun getItemCount(): Int = movieData.size
}