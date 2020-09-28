package cn.bdqn.service.impl;

import base.impl.BaseServiceImpl;
import cn.bdqn.domain.Manage;
import cn.bdqn.mapper.BaseMapper;
import cn.bdqn.mapper.ManageMapper;
import cn.bdqn.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageServiceImpl extends BaseServiceImpl<Manage> implements ManageService {
    @Autowired
    private ManageMapper manageMapper;

    public BaseMapper<Manage> getBaseMapper() {
        return manageMapper;
    }


}
