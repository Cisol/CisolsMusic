package com.cisol.controller;

import com.cisol.entity.MusicEntity;
import com.cisol.dao.mappers.MusicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Cisol on 2017/6/6.
 */
@Controller
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicMapper musicMapper;

    /**
     * 跳转到添加音乐页面
     * @return
     */
    @RequestMapping("/addMusic")
    public String addMusic() {
        return "add";
    }

    /**
     * 添加音乐接口
     * @param musicName
     * @param mSingerId
     * @param mAlbumId
     * @param mUrl
     * @return
     */
    @PostMapping("/add")
    public String addMusic(
            @RequestParam String musicName,
            @RequestParam String mSingerId,
            @RequestParam String mAlbumId,
            @RequestParam String mUrl) {
        MusicEntity newMusic = new MusicEntity();
        newMusic.setMusicName(musicName);
        newMusic.setmSingerId(Long.valueOf(mSingerId));
        newMusic.setmAlbumId(Long.valueOf(mAlbumId));
        newMusic.setmUrl(mUrl);
        musicMapper.add(newMusic);
        return "musicList";
    }

    /**
     * 获取音乐详细信息
     * @param musicId
     * @return
     */
    @GetMapping("/{id}")
    @ResponseBody
    public MusicEntity getMusicInfo(
            @PathVariable("id")
                    Long musicId) {
        return musicMapper.select(musicId);
    }

    /**
     * 获取音乐列表接口
     * @param modelMap
     * @return
     */
    @GetMapping("/getMusicList")
    @ResponseBody
    public List<MusicEntity> getMusicList(ModelMap modelMap) {
        return musicMapper.list();
    }

    /**
     * 返回音乐列表页面
     * @param modelMap
     * @return
     */
    @GetMapping("/list")
    public String list(ModelMap modelMap) {
        return "musicList";
    }

    /**
     * 修改音乐信息
     * @param musicId
     * @param newMusic
     * @return
     */
    @PutMapping("/{id}")
    @ResponseBody
    public MusicEntity updateMusicInfo(
            @PathVariable("id")
                    Long musicId,
            @RequestBody
                    MusicEntity newMusic) {
        MusicEntity musicEntity = musicMapper.select(musicId);
        if (musicEntity == null) {
            return null;
        }
        musicEntity.setMusicName(newMusic.getMusicName());
        musicEntity.setmSingerId(newMusic.getmSingerId());
        musicMapper.update(musicEntity);
        return musicEntity;
    }
}
