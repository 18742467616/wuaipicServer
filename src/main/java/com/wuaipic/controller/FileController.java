package com.wuaipic.controller;

import com.wuaipic.result.ResultEntity;
import com.wuaipic.utils.FileUtil;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
@RestController
public class FileController {
        @CrossOrigin
        @RequestMapping(value = "file",method = RequestMethod.POST,headers = "Accept=application/json")
        public ResultEntity Fileupload(MultipartFile file,HttpServletRequest request){
            ResultEntity resultEntity =ResultEntity.createBySuccessData(FileUtil.FileUpload(file));
            return resultEntity;

    }

}
