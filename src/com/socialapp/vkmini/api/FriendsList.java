package com.socialapp.vkmini.api;

import org.json.JSONException;
import org.json.JSONObject;

public class FriendsList {

    public int lid;
    public String name;

    public static FriendsList parse(JSONObject o) throws JSONException {
        FriendsList fl = new FriendsList();
        fl.lid = o.getInt("lid");
        fl.name = o.getString("name");
        return fl;
    }
}
