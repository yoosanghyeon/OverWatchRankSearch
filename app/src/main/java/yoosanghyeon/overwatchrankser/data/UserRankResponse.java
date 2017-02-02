package yoosanghyeon.overwatchrankser.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Arous on 2017-01-23.
 */

public class UserRankResponse {

    @SerializedName("kr")
    public Kr kr;

    @SerializedName("eu")
    public Eu eu;

    @SerializedName("us")
    public Us us;

    @SerializedName("any")
    public Any any;

    @Override
    public String toString() {
        return "UserResponse{" +
                "eu=" + eu +
                ", kr=" + kr +
                ", us=" + us +
                ", any=" + any +
                '}';
    }
}
