package com.example.iasachat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class ChatData{
    private String nick;
    private String msg;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public ChatData(String nick, String msg) {
        this.nick=nick;
        this.msg=msg;

    }
    public ChatData() {
        this.nick="홍길동";
        this.msg="안녕하세용";

    }
}
