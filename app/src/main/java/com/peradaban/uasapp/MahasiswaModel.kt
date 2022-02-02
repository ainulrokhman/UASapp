package com.peradaban.uasapp

import android.os.Parcel
import android.os.Parcelable

class MahasiswaModel(
    var foto: Int,
    var nama: String?,
    var nim: String?,
    var prodi: String?,
    var tentang: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(foto)
        parcel.writeString(nama)
        parcel.writeString(nim)
        parcel.writeString(prodi)
        parcel.writeString(tentang)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MahasiswaModel> {
        override fun createFromParcel(parcel: Parcel): MahasiswaModel {
            return MahasiswaModel(parcel)
        }

        override fun newArray(size: Int): Array<MahasiswaModel?> {
            return arrayOfNulls(size)
        }
    }
}