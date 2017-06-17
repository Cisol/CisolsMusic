package com.cisol.dao.mappers;

import com.cisol.entity.MusicEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Cisol on 2017/6/6.
 * 音乐数据操作接口
 */
@Mapper
public interface MusicMapper {
    MusicEntity select(
            @Param("id")
                    long id);
    void update(MusicEntity music);
    List<MusicEntity> list();
    void add(MusicEntity music);
}
