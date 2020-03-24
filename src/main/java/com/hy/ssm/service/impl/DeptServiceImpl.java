package com.hy.ssm.service.impl;

import com.hy.ssm.entity.Dept;
import com.hy.ssm.mapper.DeptMapper;
import com.hy.ssm.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangduo
 * @since 2020-03-24
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
