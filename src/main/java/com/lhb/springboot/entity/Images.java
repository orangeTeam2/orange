package com.lhb.springboot.entity;

import java.util.UUID;

/**
 * @Author: yaya
 * @Description:
 * @Date: Create in 下午 08:44 2019/11/13
 */
public class Images {
    private String img_uuid;
    private String img_name;
    private String img_url;
    private String img_zipurl;
    private String user_uuid;
    private String disease_uuid;

    @Override
    public String toString() {
        return "Images{" +
                "img_uuid='" + img_uuid + '\'' +
                ", img_name='" + img_name + '\'' +
                ", img_url='" + img_url + '\'' +
                ", img_zipurl='" + img_zipurl + '\'' +
                ", user_uuid='" + user_uuid + '\'' +
                ", disease_uuid='" + disease_uuid + '\'' +
                '}';
    }

    public Images(String img_uuid, String img_name, String img_url,
                  String img_zipurl, String user_uuid, String disease_uuid) {
        this.img_uuid = img_uuid;
        this.img_name = img_name;
        this.img_url = img_url;
        this.img_zipurl = img_zipurl;
        this.user_uuid = user_uuid;
        this.disease_uuid = disease_uuid;
    }

    public String getImg_uuid() {
        return img_uuid;
    }

    public void setImg_uuid(String img_uuid) {
        this.img_uuid = img_uuid;
    }

    public String getImg_name() {
        return img_name;
    }

    public void setImg_name(String img_name) {
        this.img_name = img_name;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getImg_zipurl() {
        return img_zipurl;
    }

    public void setImg_zipurl(String img_zipurl) {
        this.img_zipurl = img_zipurl;
    }

    public String getUser_uuid() {
        return user_uuid;
    }

    public void setUser_uuid(String user_uuid) {
        this.user_uuid = user_uuid;
    }

    public String getDisease_uuid() {
        return disease_uuid;
    }

    public void setDisease_uuid(String disease_uuid) {
        this.disease_uuid = disease_uuid;
    }
}
