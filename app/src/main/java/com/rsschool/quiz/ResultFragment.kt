package com.rsschool.quiz

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rsschool.quiz.data.QuizGame
import com.rsschool.quiz.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!

    private var listener: Navigator? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.result.text = "Your result: ${QuizGame.calcResult()}%"

        binding.share.setOnClickListener {
            listener?.sendResult()
        }

        binding.restart.setOnClickListener {
            listener?.startQuiz()
        }

        binding.close.setOnClickListener {
            listener?.closeQuiz()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? Navigator
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    companion object {
        fun newInstance() = ResultFragment()
    }
}