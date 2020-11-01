package com.shy.dao;

import com.shy.entity.Picture;
import jdk.internal.dynalink.linker.LinkerServices;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2020/10/30/11:35
 * @Description:
 */
@Mapper
@Repository
public interface PictureDao {
    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

    //编辑修改相册
    int updatePicture(Picture picture);

    //删除照片
    void deletePicture(Long id);
}
