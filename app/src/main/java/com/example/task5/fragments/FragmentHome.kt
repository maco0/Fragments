package com.example.task5.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.task5.R

class FragmentHome:Fragment(R.layout.fragment_home) {
    private lateinit var button:Button
    private lateinit var nameEditText: EditText
    private lateinit var SurnameEditText:EditText
    private lateinit var GenderEditText:EditText
    private lateinit var AgeEditText:EditText
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
         button = view.findViewById(R.id.Submit)
        nameEditText = view.findViewById(R.id.PersonName)
        SurnameEditText = view.findViewById(R.id.PersonSurname)
        GenderEditText = view.findViewById(R.id.PersonGender)
        AgeEditText = view.findViewById(R.id.PersonAge)
        button.setOnClickListener {
            val name:String =  nameEditText.text.trim().toString()
            val surname: String = SurnameEditText.text.trim().toString()
            val gender: String = GenderEditText.text.trim().toString()
            val age: String = AgeEditText.text.trim().toString()

      val action = FragmentHomeDirections.actionFragmentHomeToFragmentInformation(name,surname,gender,age.toInt())
      navController.navigate(action)
        }
    }
}