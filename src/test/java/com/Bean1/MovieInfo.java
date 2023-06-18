package com.Bean1;

public class MovieInfo {

   public int t_id;
   private String t_name;
    private int  rating;

    public MovieInfo(int t_id, String t_name, int rating)
    {
       this. t_id=t_id;
        this.t_name=t_name;
        this.rating=rating;
    }

   /* public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getT_id() {
        return t_id;
    }

    public String getT_name() {
        return t_name;
    }

    public int getRating() {
        return rating;
    }*/

    public String toString(){
        return t_id+""+t_name+""+rating;
    }
}
