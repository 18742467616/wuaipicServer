package com.wuaipic.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public class FileUtil {

    public static String FileUpload(MultipartFile file){
//        String path="/usr/local/apache2/htdocs/aimImages/";
        String path="D://hello//";
        String fileName = file.getOriginalFilename();//获取到上传文件的名字
        String suffix = fileName.substring(fileName.lastIndexOf('.'));//获取文件后缀
        String newfileName = UUIDUtil.getOneUUID()+suffix;//随机生成文件名
        System.out.println(newfileName);
        File dir = new File(path,newfileName);//在目录中创建文件目录
        if(!dir.getParentFile().exists()){
            dir.getParentFile().mkdirs();//创建文件
        }
        try {
            file.transferTo(dir);//转换文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newfileName;
    }
}
