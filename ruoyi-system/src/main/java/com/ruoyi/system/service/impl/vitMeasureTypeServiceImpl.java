package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitMeasureTypeMapper;
import com.ruoyi.system.domain.vitMeasureType;
import com.ruoyi.system.service.IvitMeasureTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitMeasureTypeService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
@Service
public class vitMeasureTypeServiceImpl implements IvitMeasureTypeService 
{
    @Autowired
    private vitMeasureTypeMapper vitMeasureTypeMapper;

    /**
     * 查询vitMeasureType
     * 
     * @param measureTypeId vitMeasureTypeID
     * @return vitMeasureType
     */
    @Override
    public vitMeasureType selectvitMeasureTypeById(Long measureTypeId)
    {
        return vitMeasureTypeMapper.selectvitMeasureTypeById(measureTypeId);
    }

    /**
     * 查询vitMeasureType列表
     * 
     * @param vitMeasureType vitMeasureType
     * @return vitMeasureType
     */
    @Override
    public List<vitMeasureType> selectvitMeasureTypeList(vitMeasureType vitMeasureType)
    {
        return vitMeasureTypeMapper.selectvitMeasureTypeList(vitMeasureType);
    }

    /**
     * 新增vitMeasureType
     * 
     * @param vitMeasureType vitMeasureType
     * @return 结果
     */
    @Override
    public int insertvitMeasureType(vitMeasureType vitMeasureType)
    {
        return vitMeasureTypeMapper.insertvitMeasureType(vitMeasureType);
    }

    /**
     * 修改vitMeasureType
     * 
     * @param vitMeasureType vitMeasureType
     * @return 结果
     */
    @Override
    public int updatevitMeasureType(vitMeasureType vitMeasureType)
    {
        return vitMeasureTypeMapper.updatevitMeasureType(vitMeasureType);
    }

    /**
     * 删除vitMeasureType对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitMeasureTypeByIds(String ids)
    {
        return vitMeasureTypeMapper.deletevitMeasureTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitMeasureType信息
     * 
     * @param measureTypeId vitMeasureTypeID
     * @return 结果
     */
    @Override
    public int deletevitMeasureTypeById(Long measureTypeId)
    {
        return vitMeasureTypeMapper.deletevitMeasureTypeById(measureTypeId);
    }

    @Autowired
    public List<vitMeasureType> selectvitMeasureTypeAll(){
        return vitMeasureTypeMapper.selectvitMeasureTypeAll();
    }

}
