package com.example.intenttestapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Persona implements Parcelable {

    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private int age;

    public Persona() {}

    public Persona(String name, String lastName, String email,
                   String phoneNumber, int age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    protected Persona(Parcel in) {
        name = in.readString();
        lastName = in.readString();
        email = in.readString();
        phoneNumber = in.readString();
        age = in.readInt();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int size) {
            return new Persona[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(lastName);
        parcel.writeString(email);
        parcel.writeString(phoneNumber);
        parcel.writeInt(age);
    }
}
