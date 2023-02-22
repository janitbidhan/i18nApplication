package com.gmuswe.classdemo.service;

import com.gmuswe.classdemo.model.LanguageData;

import java.util.List;

public interface I18NService {

    LanguageData getLanguageData(String id,String LanguageKey);

    List<LanguageData> getAllLanguageData(String LanguageKey);

    boolean insertLanguageData(LanguageData languagePairs);

    boolean updateLanguageData(LanguageData languagePairs);
}
