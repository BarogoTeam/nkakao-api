package com.barogo.nkakao.util;

import java.util.Random;

public class IdGenerator {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IdGenerator() {
        this.id = getRandomHexString(20);
    }

    private String getRandomHexString(int numchars){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }
        return sb.toString().substring(0, numchars);
    }

    @Override
    public String toString() {
        return id;
    }
}
