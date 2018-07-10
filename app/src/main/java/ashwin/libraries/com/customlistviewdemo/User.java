package ashwin.libraries.com.customlistviewdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ashwin on 10/07/18.
 */

public class User implements Parcelable {

    public String name;
    public String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
