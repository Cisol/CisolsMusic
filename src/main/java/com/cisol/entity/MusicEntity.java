package com.cisol.entity;

import java.io.Serializable;

/**
 * Created by Cisol on 2017/5/13 0013.
 * 音乐实体类
 */
public class MusicEntity implements Serializable{
    private static final long SerialVersionUID = 1L;

    /**
     * 音乐ID
     */
    private Long musicId;
    /**
     * 音乐名称
     */
    private String musicName;
    /**
     * 歌手ID
     */
    private Long mSingerId;
    /**
     * 唱片ID
     */
    private Long mAlbumId;
    /**
     * 音乐存放路径
     */
    private String mUrl;

    public Long getMusicId() {
        return musicId;
    }

    public void setMusicId(Long musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public Long getmSingerId() {
        return mSingerId;
    }

    public void setmSingerId(Long mSingerId) {
        this.mSingerId = mSingerId;
    }

    public Long getmAlbumId() {
        return mAlbumId;
    }

    public void setmAlbumId(Long mAlbumId) {
        this.mAlbumId = mAlbumId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    @Override
    public String toString() {
        return "MusicEntity{" +
                "musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", mSingerId=" + mSingerId +
                ", mAlbumId=" + mAlbumId +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
