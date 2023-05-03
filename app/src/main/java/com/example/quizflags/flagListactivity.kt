package com.example.quizflags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ActivityFlagListBinding {

}

class Flag_ListActivity : AppCompatActivity() {

    private var binding:ActivityFlagListBinding? = null
    private val binding get() = binding!!

    private lateint var flag adaptor : ArrayList<Questions>
    private lateint var flag adaptor : FlagAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlagListBinding.intlate(layoutInflater)
        setContentView(binding.root)

    }
}
class Flagviewholder(private val binding: flagItembingfind) :
    RecyclerView.viewholder(binding.root) {

    fun bind(queston: Question){
        binding_ivFlag.setImageRessource(Question.image)
        when(qustion.correctAnswer){
            1 -> {
                binding.tv
            }
        }
    }
}