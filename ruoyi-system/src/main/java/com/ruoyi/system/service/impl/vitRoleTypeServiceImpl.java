package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitRoleTypeMapper;
import com.ruoyi.system.domain.vitRoleType;
import com.ruoyi.system.service.IvitRoleTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitRoleTypeService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-10
 */
@Service
public class vitRoleTypeServiceImpl implements IvitRoleTypeService 
{
    @Autowired
    private vitRoleTypeMapper vitRoleTypeMapper;

    /**
     * 查询vitRoleType
     * 
     * @param roleTypeCode vitRoleTypeID
     * @return vitRoleType
     */
    @Override
    public vitRoleType selectvitRoleTypeById(Long roleTypeCode)
    {
        return vitRoleTypeMapper.selectvitRoleTypeById(roleTypeCode);
    }

    /**
     * 查询vitRoleType列表
     * 
     * @param vitRoleType vitRoleType
     * @return vitRoleType
     */
    @Override
    public List<vitRoleType> selectvitRoleTypeList(vitRoleType vitRoleType)
    {
        return vitRoleTypeMapper.selectvitRoleTypeList(vitRoleType);
    }

    /**
     * 新增vitRoleType
     * 
     * @param vitRoleType vitRoleType
     * @return 结果
     */
    @Override
    public int insertvitRoleType(vitRoleType vitRoleType)
    {
        return vitRoleTypeMapper.insertvitRoleType(vitRoleType);
    }

    /**
     * 修改vitRoleType
     * 
     * @param vitRoleType vitRoleType
     * @return 结果
     */
    @Override
    public int updatevitRoleType(vitRoleType vitRoleType)
    {
        return vitRoleTypeMapper.updatevitRoleType(vitRoleType);
    }

    /**
     * 删除vitRoleType对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitRoleTypeByIds(String ids)
    {
        return vitRoleTypeMapper.deletevitRoleTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitRoleType信息
     * 
     * @param roleTypeCode vitRoleTypeID
     * @return 结果
     */
    @Override
    public int deletevitRoleTypeById(Long roleTypeCode)
    {
        return vitRoleTypeMapper.deletevitRoleTypeById(roleTypeCode);
    }
}
