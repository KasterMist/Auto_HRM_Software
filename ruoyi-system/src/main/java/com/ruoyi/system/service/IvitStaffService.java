package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.vitStaff;

/**
 * vitStaffService接口
 * 
 * @author ruoyi
 * @date 2021-12-04
 */
public interface IvitStaffService 
{
    /**
     * 查询vitStaff
     * 
     * @param staffId vitStaffID
     * @return vitStaff
     */
    public vitStaff selectvitStaffById(Long staffId);

    /**
     * 查询vitStaff列表
     * 
     * @param vitStaff vitStaff
     * @return vitStaff集合
     */
    public List<vitStaff> selectvitStaffList(vitStaff vitStaff);

    /**
     * 新增vitStaff
     * 
     * @param vitStaff vitStaff
     * @return 结果
     */
    public int insertvitStaff(vitStaff vitStaff);

    /**
     * 修改vitStaff
     * 
     * @param vitStaff vitStaff
     * @return 结果
     */
    public int updatevitStaff(vitStaff vitStaff);

    /**
     * 批量删除vitStaff
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletevitStaffByIds(String ids);

    /**
     * 删除vitStaff信息
     * 
     * @param staffId vitStaffID
     * @return 结果
     */
    public int deletevitStaffById(Long staffId);

    public List<vitStaff> getvitStaffListAll();

}
