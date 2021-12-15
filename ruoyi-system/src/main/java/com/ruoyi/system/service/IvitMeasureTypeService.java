package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitMeasureType;

/**
 * vitMeasureTypeService接口
 * 
 * @author ruoyi
 * @date 2021-12-14
 */
public interface IvitMeasureTypeService 
{
    /**
     * 查询vitMeasureType
     * 
     * @param measureTypeId vitMeasureTypeID
     * @return vitMeasureType
     */
    public vitMeasureType selectvitMeasureTypeById(Long measureTypeId);

    /**
     * 查询vitMeasureType列表
     * 
     * @param vitMeasureType vitMeasureType
     * @return vitMeasureType集合
     */
    public List<vitMeasureType> selectvitMeasureTypeList(vitMeasureType vitMeasureType);

    /**
     * 新增vitMeasureType
     * 
     * @param vitMeasureType vitMeasureType
     * @return 结果
     */
    public int insertvitMeasureType(vitMeasureType vitMeasureType);

    /**
     * 修改vitMeasureType
     * 
     * @param vitMeasureType vitMeasureType
     * @return 结果
     */
    public int updatevitMeasureType(vitMeasureType vitMeasureType);

    /**
     * 批量删除vitMeasureType
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitMeasureTypeByIds(String ids);

    /**
     * 删除vitMeasureType信息
     * 
     * @param measureTypeId vitMeasureTypeID
     * @return 结果
     */
    public int deletevitMeasureTypeById(Long measureTypeId);

    public List<vitMeasureType> selectvitMeasureTypeAll();
}
