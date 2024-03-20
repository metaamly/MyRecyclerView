package layout

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridEnhypenAdapter (val listEnhypen: ArrayList<Enhypen>)
    : RecyclerView.Adapter<GridEnhypenAdapter.GridViewHolder>(){
    override fun onCreateViewHolder(pO: ViewGroup, p1: Int):
            GridViewHolder {
        TODO("Not implemented")
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listEnhypen[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)
    }

    override fun getItemCount(): Int {
        return listEnhypen.size
    }

    inner class GridViewHolder (itemView: View) :
            RecyclerView.ViewHolder(itemView) {
                var imgPhoto: ImgView =
                    itemView.findViewById(R.id.img_item_photo)
            }
}