package com.example.quizflags

class adaptor { var flag  data:ArrayList<Question>
                    var flag adaptor : FlagAdaptor

     class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.text_view)

    }
    override fun onCreateViewHolder()
    override fun onBindViewHolder()
    override fun getItemCount()

}