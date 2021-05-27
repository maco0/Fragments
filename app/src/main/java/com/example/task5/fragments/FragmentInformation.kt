package com.example.task5.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.task5.R
import org.w3c.dom.Text

class FragmentInformation:Fragment(R.layout.fragment_information) {
    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

   view.findViewById<TextView>(R.id.PersonNameText).text ="Name: " + FragmentInformationArgs.fromBundle(requireArguments()).name
        view.findViewById<TextView>(R.id.PersonSurnameText).text = "Surname: " + FragmentInformationArgs.fromBundle(requireArguments()).surname
        view.findViewById<TextView>(R.id.PersonGenderText).text = "Gender: " + FragmentInformationArgs.fromBundle(requireArguments()).gender
        view.findViewById<TextView>(R.id.PersonAgeText).text = "Age: " + FragmentInformationArgs.fromBundle(requireArguments()).age.toString()
    }
}