package com.example.client;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class ClientLogin extends StringRequest {

    final static private String URL = "http://118.67.128.105/phpmyadmin/ClientLogin.php";
    private Map<String, String> map;

    public ClientLogin(String userID, String userPassword, Response.Listener<String> listener)
    {
        super(Method.POST, URL, listener,null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}