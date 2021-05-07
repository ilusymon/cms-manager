package com.tmg.auth.service.impl;


import com.tmg.auth.mapper.DictionaryMapper;
import com.tmg.auth.service.DictionaryService;
import com.tmg.model.auth.Dictionary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Resource
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> queryForTypeId(int typeId) {
        return dictionaryMapper.queryForTypeId(typeId);
    }
}
