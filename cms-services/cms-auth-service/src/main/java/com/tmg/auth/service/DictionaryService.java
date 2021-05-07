package com.tmg.auth.service;


import com.tmg.model.auth.Dictionary;

import java.util.List;

public interface DictionaryService {

    List<Dictionary> queryForTypeId(int typeId);
}
