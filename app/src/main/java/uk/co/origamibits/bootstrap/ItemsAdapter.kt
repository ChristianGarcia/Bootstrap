package uk.co.origamibits.bootstrap

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uk.co.origamibits.bootstrap.databinding.ItemItemBinding
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item

class ItemsAdapter : ListAdapter<Feature1Item, ItemsAdapter.ItemViewHolder>(DiffCallback) {
    object DiffCallback : DiffUtil.ItemCallback<Feature1Item>() {
        override fun areItemsTheSame(oldItem: Feature1Item, newItem: Feature1Item): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Feature1Item, newItem: Feature1Item): Boolean =
            oldItem == newItem

    }

    class ItemViewHolder(private val binding: ItemItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Feature1Item) {
            binding.item = item
            binding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder =
        ItemViewHolder(ItemItemBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}
