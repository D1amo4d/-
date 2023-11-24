package com.example.adiletrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.adiletrecyclerview.databinding.ItemFioBinding
import com.example.adiletrecyclerview.model.Fio

class FioAdapter() : Adapter<FioAdapter.FioViewHolder>() {
    private val listFio = arrayListOf<Fio>(
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Алмаз","Чоробеков"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Адилет","Замирбекович"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Бека","Курманалиев"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Нооруз","Исмаилов"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Айжан","Смиранов"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Малик","Михаилов"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Бфй-мурат","Прохоров"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Азамат","Оторбаев"),
        Fio("https://w7.pngwing.com/pngs/895/199/png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png","Жоодар","Кистаубаев"),
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FioViewHolder {
        return FioViewHolder(
            ItemFioBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = listFio.size


    override fun onBindViewHolder(holder: FioViewHolder, position: Int) {
        holder.bind(listFio[position])
    }

    inner class FioViewHolder(private val binding: ItemFioBinding) : ViewHolder(binding.root) {
        fun bind(fio: Fio) {
            binding.apply {
                Glide.with(binding.root.context).load(fio.imgPoster).into(imgPoster)
                tvTitle.text = fio.title
                tvDescription.text = fio.description

            }
        }
    }
}
