package com.cisol.entity;

/**
 * Created by Cisol on 2017/5/13 0013.
 * 歌手实体类
 */
public class SingerEntity {
    /**
     * 歌手ID
     */
    private Long singerId;
    /**
     * 歌手名称
     */
    private String singerName;

    public Long getSingerId() {
        return singerId;
    }

    public void setSingerId(Long singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    @Override
    public String toString() {
        return "SingerEntity{" +
                "singerId=" + singerId +
                ", singerName='" + singerName + '\'' +
                '}';
    }
}
