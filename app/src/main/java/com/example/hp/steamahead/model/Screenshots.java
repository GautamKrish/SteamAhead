package com.example.hp.steamahead.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/*
 ** Created by Gautam Krishnan {@link https://github.com/GautiKrish}
 */public class Screenshots implements Parcelable {

    @SerializedName("path_thumbnail") String path_thumbnail;

    public String getPath_thumbnail() {
        return path_thumbnail;
    }

    public void setPath_thumbnail(String path_thumbnail) {
        this.path_thumbnail = path_thumbnail;
    }

    public Screenshots(String path_thumbnail) {

        this.path_thumbnail = path_thumbnail;
    }

    public Screenshots() {

    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.path_thumbnail);
    }

    protected Screenshots(Parcel in) {
        this.path_thumbnail = in.readString();
    }

    public static final Creator<Screenshots> CREATOR = new Creator<Screenshots>() {
        @Override
        public Screenshots createFromParcel(Parcel source) {
            return new Screenshots(source);
        }

        @Override
        public Screenshots[] newArray(int size) {
            return new Screenshots[size];
        }
    };
}
