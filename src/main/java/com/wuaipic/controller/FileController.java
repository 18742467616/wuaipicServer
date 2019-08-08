package com.wuaipic.controller;

import com.wuaipic.result.ResultEntity;
import com.wuaipic.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileController {
        @CrossOrigin
        @RequestMapping(value = "file",method = RequestMethod.POST,headers = "Accept=application/json")
        public ResultEntity Fileupload(MultipartFile file,HttpServletRequest request){
            Map map = new HashMap();
            FileUtil.FileUpload(file);
            map.put("src","http://pic41.nipic.com/20140508/18609517_112216473140_2.jpg");
            map.put("title","aaaaaa");
            ResultEntity resultEntity =ResultEntity.createBySuccessData(map);

            return resultEntity;

    }

}
