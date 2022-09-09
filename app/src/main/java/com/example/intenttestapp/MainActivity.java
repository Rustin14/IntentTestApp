package com.example.intenttestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.example.intenttestapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding.submitButton.setOnClickListener(v -> openDetailActivity());
    }

    public Persona savePerson() {
        String name = binding.nameTextField.getEditText().getText().toString();
        String lastName = binding.lastNameTextField.getEditText().getText().toString();
        String email = binding.emailTextField.getEditText().getText().toString();
        String phoneNumber = binding.phoneTextField.getEditText().getText().toString();
        int age = Integer.getInteger(binding.ageTextField.getEditText().getText().toString());
        Persona person = new Persona(name, lastName, email, phoneNumber, age);
        return person;
    }

    private void openDetailActivity() {
        Persona intentPerson = savePerson();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.PERSON_KEY, intentPerson);
        startActivity(intent);
    }





}