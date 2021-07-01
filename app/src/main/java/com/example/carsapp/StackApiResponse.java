package com.example.carsapp;

import java.util.List;

public class StackApiResponse {
    public List<Item> items;
    public boolean has_more;
    public int quota_max;
    public int quota_remaining;
}

class Car {
    public int id;
    public String brand;
    public String constructionYear;
    public boolean isUsed;
    public String imageUrl;
}

class Item {
    public Car car;
//    public boolean is_accepted;
//    public int score;
//    public long last_activity_date;
//    public long creation_date;
//    public long answer_id;
//    public long question_id;
}

