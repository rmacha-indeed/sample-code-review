package com.tweet.dashboard;

import java.util.List;

public class Tweet {

    String handle;
    String name;

    String tweetText;
    boolean isFavourite;
    long tweetedTime;
    List<Follower> followers; // List of followers this handle has

    static class Follower {
        String handle;
        String name;
        long followingSince;
        String profileDescription;
        List<String> interests;
    }

}
