package com.daivers.submission;

import android.os.Parcel;
import android.os.Parcelable;

public class Klub implements Parcelable {
    private String nama;
    private String detail;
    private int photo;

    public static final Creator<Klub> CREATOR = new Creator<Klub>() {
        @Override
        public Klub createFromParcel(Parcel in) {
            return new Klub(in);
        }

        @Override
        public Klub[] newArray(int size) {
            return new Klub[size];
        }
    };

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.photo);
        parcel.writeString(this.nama);
        parcel.writeString(this.detail);
    }

    public Klub(){
    }

    protected Klub(Parcel in){

        nama = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }



}
