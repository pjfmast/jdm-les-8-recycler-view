package avd.jdm.les2recyclerview.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import avd.jdm.les2recyclerview.R
import coil.load
class CoilImageLoader (private val context: Context): ImageLoader {
    override fun loadImage(imageUrl: String, imageView: ImageView) {
        val circularProgressDrawable = CircularProgressDrawable(context)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()

        imageView.load(imageUrl) {
            crossfade(true)
            placeholder(circularProgressDrawable)
            error(R.drawable.ic_broken_image)
        }
    }
}