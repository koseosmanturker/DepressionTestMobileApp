package com.example.depressiontest.Entity;

public class Result {

    private int id;
    private String result;

    public Result(int id, String result) {
        this.id = id;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }


}
