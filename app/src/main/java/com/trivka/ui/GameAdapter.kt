package com.trivka.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.trivka.R
import com.trivka.databinding.ItemGameBinding
import com.trivka.repository.TrivkModel

class GameAdapter : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    var onClickItem: ((TrivkModel) -> Unit)? = null

    private var items: MutableList<TrivkModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                com.trivka.R.layout.item_game,
                parent,
                false
            )
        )
    }

    fun getViewTypeCount(): Int {
        return if (itemCount < 1) 1 else itemCount
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount() = items.size


    @SuppressLint("NotifyDataSetChanged")
    fun onSetData(values: MutableList<TrivkModel>?) {
        items.clear()
        items.addAll(values!!)
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //holder.binding.imageViewRowIncrease.setOnClickListener {}

        holder.binding.checkBoxAnswerOne.setOnClickListener {
            items[position].apply { answerUser = items[position].answer[0].option }
            onClickItem?.invoke(items[position])
            holder.binding.checkBoxAnswerOne.isChecked = true
            holder.binding.checkBoxAnswerTwo.isClickable = false
            holder.binding.checkBoxAnswerThree.isClickable = false
            holder.binding.checkBoxAnswerFour.isClickable = false
            holder.binding.constraintLayoutCheck.setBackgroundColor(
                ContextCompat.getColor(
                    holder.binding.root.context,
                    R.color.check_7B8DF1
                )
            )
        }

        holder.binding.checkBoxAnswerTwo.setOnClickListener {
            items[position].apply { answerUser = items[position].answer[1].option }
            onClickItem?.invoke(items[position])
            holder.binding.checkBoxAnswerOne.isClickable = false
            holder.binding.checkBoxAnswerTwo.isChecked = true
            holder.binding.checkBoxAnswerThree.isClickable = false
            holder.binding.checkBoxAnswerFour.isClickable = false
            holder.binding.constraintLayoutCheck.setBackgroundColor(
                ContextCompat.getColor(
                    holder.binding.root.context,
                    R.color.check_7B8DF1
                )
            )
        }

        holder.binding.checkBoxAnswerThree.setOnClickListener {
            items[position].apply { answerUser = items[position].answer[2].option }
            onClickItem?.invoke(items[position])
            holder.binding.checkBoxAnswerOne.isClickable = false
            holder.binding.checkBoxAnswerTwo.isClickable = false
            holder.binding.checkBoxAnswerThree.isChecked = true
            holder.binding.checkBoxAnswerFour.isClickable = false
            holder.binding.constraintLayoutCheck.setBackgroundColor(
                ContextCompat.getColor(
                    holder.binding.root.context,
                    R.color.check_7B8DF1
                )
            )
        }

        holder.binding.checkBoxAnswerFour.setOnClickListener {
            items[position].apply { answerUser = items[position].answer[3].option }
            onClickItem?.invoke(items[position])
            holder.binding.checkBoxAnswerOne.isClickable = false
            holder.binding.checkBoxAnswerTwo.isClickable = false
            holder.binding.checkBoxAnswerThree.isClickable = false
            holder.binding.checkBoxAnswerFour.isChecked = true
            holder.binding.constraintLayoutCheck.setBackgroundColor(
                ContextCompat.getColor(
                    holder.binding.root.context,
                    R.color.check_7B8DF1
                )
            )
        }

        holder.bind(items[position])
    }

    class ViewHolder(val binding: ItemGameBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: TrivkModel) {
            binding.textViewCategory.text = item.category
            binding.textViewQuestion.text = item.question
            binding.checkBoxAnswerOne.text = item.answer[0].option
            binding.checkBoxAnswerTwo.text = item.answer[1].option
            binding.checkBoxAnswerThree.text = item.answer[2].option
            binding.checkBoxAnswerFour.text = item.answer[3].option
        }
    }
}