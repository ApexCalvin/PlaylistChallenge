package io.zipcoder;

public class Music {
    private String[] playList;
    public Music(String[] playList){

        this.playList = playList;
    }
    public Integer selection(Integer startIndex, String selection){
        int songIndex = 0;
        for(int i = startIndex+1; i < playList.length; i++) {
            if(playList[i].equals(selection)) songIndex = i;
        }
        int forward = Math.abs(songIndex - startIndex);
        int backward = Math.abs((startIndex + playList.length) - songIndex);
        return Math.min(forward, backward);
    }
}
