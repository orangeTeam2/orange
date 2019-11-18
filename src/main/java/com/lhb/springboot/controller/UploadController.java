package com.lhb.springboot.controller;

import com.lhb.springboot.entity.Images;
import com.lhb.springboot.mapper.ImageMapper;
import com.lhb.springboot.utils.FileUtils;
import net.coobird.thumbnailator.Thumbnails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 07:57 2019/11/13
 */
@Controller
public class UploadController {

    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    ImageMapper imageMapper;

    @PostMapping("/up")
    public String upload(@RequestParam("file") MultipartFile file, Map<String, Object> map,Images images){


        // 要上传的目标文件存放路径
        String localPath = "E:/Develop/Files/Photos";
        String compressPath = "E:/Develop/Files/comp";
        // 上传成功或者失败的提示
        String msg = "";
        File file11 = new File(compressPath);
        if (!file11.exists()) {
            file11.mkdirs();
        }

        File file1 = new File(localPath);
        if (!file1.exists()) {
            file1.mkdirs();
        }
        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
            // 上传成功，给出页面提示
            msg = "上传成功！";
        }else {
            msg = "上传失败！";

        }

        try {
            FileUtils.saveImg(file,localPath);
            logger.info("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thumbnails.of(localPath+"/"+file.getOriginalFilename())
                    .scale(0.25f)
                    .toFile(compressPath+"/"+file.getOriginalFilename().split(".")[0]+"_25%.jpg");
            FileUtils.saveImg(file,compressPath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        images.setImg_name(file.getOriginalFilename());
        images.setImg_uuid(UUID.randomUUID().toString());
        images.setImg_url(localPath);
        images.setImg_zipurl(compressPath);
        imageMapper.uploadImage(images);
        // 显示图片
        map.put("msg", msg);
        map.put("fileName", file.getOriginalFilename());

        map.put("images",images);
        return "main/index";
    }
    @GetMapping("/toUpload")
    public String toUpload(){
        return "main/upload";
    }

    @GetMapping("/list")
    public String list(Map<String,Object> map,Images images){

        List<Images> allImages = imageMapper.getAllImages(images);
        map.put("all",allImages);
        return "main/display";
    }
}
