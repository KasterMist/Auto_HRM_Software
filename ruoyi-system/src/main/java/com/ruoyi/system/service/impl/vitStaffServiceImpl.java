package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.vitStaffMapper;
import com.ruoyi.system.domain.vitStaff;
import com.ruoyi.system.service.IvitStaffService;
import com.ruoyi.common.core.text.Convert;

/**
 * vitStaffService业务层处理
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
@Service
public class vitStaffServiceImpl implements IvitStaffService 
{
    @Autowired
    private IvitStaffService vitStaffService;

    @Autowired
    private vitStaffMapper vitStaffMapper;

    /**
     * 查询vitStaff
     * 
     * @param staffId vitStaffID
     * @return vitStaff
     */
    @Override
    public vitStaff selectvitStaffById(Long staffId)
    {
        return vitStaffMapper.selectvitStaffById(staffId);
    }

    /**
     * 查询vitStaff列表
     * 
     * @param vitStaff vitStaff
     * @return vitStaff
     */
    @Override
    public List<vitStaff> selectvitStaffList(vitStaff vitStaff)
    {
        return vitStaffMapper.selectvitStaffList(vitStaff);
    }

    /**
     * 新增vitStaff
     * 
     * @param vitStaff vitStaff
     * @return 结果
     */
    @Override
    public int insertvitStaff(vitStaff vitStaff)
    {
        List<vitStaff> staffList = getvitStaffListAll();
        long largestID = 0;
        for (vitStaff staff : staffList){
            if(largestID < staff.getStaffId()){
                largestID = staff.getStaffId();

            }
        }
        largestID = largestID + 1;
        vitStaff.setCode("Dept " + largestID);
        return vitStaffMapper.insertvitStaff(vitStaff);
    }

    /**
     * 修改vitStaff
     * 
     * @param vitStaff vitStaff
     * @return 结果
     */
    @Override
    public int updatevitStaff(vitStaff vitStaff)
    {
        return vitStaffMapper.updatevitStaff(vitStaff);
    }

    /**
     * 删除vitStaff对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletevitStaffByIds(String ids)
    {
        return vitStaffMapper.deletevitStaffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除vitStaff信息
     * 
     * @param staffId vitStaffID
     * @return 结果
     */
    @Override
    public int deletevitStaffById(Long staffId)
    {
        return vitStaffMapper.deletevitStaffById(staffId);
    }


    @Override
    public List<vitStaff> getvitStaffListAll(){
        return vitStaffMapper.getvitStaffListAll();
    }

    @Override
    public vitStaff selectvitStaffByName(String name){
        return vitStaffMapper.selectvitStaffByName(name);
    }
}
