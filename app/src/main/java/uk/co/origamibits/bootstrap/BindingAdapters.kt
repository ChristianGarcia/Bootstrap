package uk.co.origamibits.bootstrap

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item

@BindingAdapter(value = ["items"])
fun items(recyclerView: RecyclerView, items: List<Feature1Item>?) {
    (recyclerView.adapter as ItemsAdapter?)?.submitList(items.orEmpty())
}