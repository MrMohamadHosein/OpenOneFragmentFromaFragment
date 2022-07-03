package ir.mrmohamadhosein.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ir.mrmohamadhosein.fragments.databinding.FragmentFirstBinding

class FragmentFirst :Fragment() {
    lateinit var binding :FragmentFirstBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnGoToSecond.setOnClickListener {

            // replace fragment -> fragment second :)
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.frame_main_container , FragmentSecond() )
            transaction.addToBackStack(null)
            transaction.commit()

        }


    }

}