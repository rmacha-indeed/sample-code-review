package com.tweet.dashboard;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
        Builds tweets from favourite users SORTED by name

        << name -  handle - tweetBody     - timeStamp >>
        Alpha   -> @al    - tweet body A  - timeStamp_X
        Beta    -> @ta    - tweet body B  - timeStamp_Y
        Gamma   -> @gams  - tweet body C  - timeStamp_Z
        Raja    -> @macha -  tweet body D - timeStamp_P

 */
public class FavouritesTweetDashboard {

    /*
    Assume some front-end/middleware layer will invoke this and returns this response
     */
    public static List<Tweet> buildDashboard(List<Tweet> input) {
        List<Tweet> favouriteTweets = filterOutNonFavourites(input);
        sortData(favouriteTweets);
        return favouriteTweets;
    }

    private static List<Tweet> filterOutNonFavourites(List<Tweet> input) {
        final LinkedList<Tweet> filteredData = new LinkedList<>();
        for (Tweet tweet : input) {
            if (!tweet.isFavourite) {
                filteredData.add(tweet);
            }
        }
        return filteredData;
    }

    private static void sortData(List<Tweet> input) {
        input.sort(new Comparator<Tweet>() {
            public int compare(Tweet r1, Tweet r2) {
                return r1.handle.compareTo(r2.handle);
            }
        });
    }
}
