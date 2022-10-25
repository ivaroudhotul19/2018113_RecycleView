package com.example.a2018113_recylceview.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Plant implements Parcelable {
    public String name;
    public String species;
    public int image;
    public String description;

//    public Plant(String name, String species, int image) {
//        this.name = name;
//        this.species = species;
//        this.image = image;
//    }

    public Plant(String name, String species, int image, String description) {
        this.name = name;
        this.species = species;
        this.image = image;
        this.description = description;
    }

    protected Plant(Parcel in) {
        name = in.readString();
        species = in.readString();
        image = in.readInt();
        description = in.readString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(species);
        dest.writeInt(image);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Plant> CREATOR = new Creator<Plant>() {
        @Override
        public Plant createFromParcel(Parcel in) {
            return new Plant(in);
        }

        @Override
        public Plant[] newArray(int size) {
            return new Plant[size];
        }
    };
}
