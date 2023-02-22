package com.gmuswe.classdemo.service;

import com.gmuswe.classdemo.model.LanguageData;
import com.gmuswe.classdemo.repository.I18NRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class I18NServiceImpl implements I18NService {
    @Autowired
    private I18NRepository repository;

    public LanguageData getEnglishPair(String id) {
        List<LanguageData> dataList = (List<LanguageData>) repository.findAll();
        for(LanguageData data : dataList){
            if (data.getLkey().equals(id) && data.getLang().equals("EN")){
                return data;
            }
        }
        return new LanguageData(-1,"NOT FOUND", "NOT FOUND", "EN");
    }
    public LanguageData getSpanishPair(String id) {
        List<LanguageData> dataList = (List<LanguageData>) repository.findAll();
        for(LanguageData data : dataList){
            if (data.getLkey().equals(id) && data.getLang().equals("ES")){
                return data;
            }
        }
        return new LanguageData(-1,"NOT FOUND", "NOT FOUND", "ES");
    }

    public LanguageData getLanguageData(String id, String LanguageKey) {
        if ( id != null && !"".equals(id) && LanguageKey != null && !"".equals(LanguageKey))
            if (LanguageKey.equals("EN"))
                return getEnglishPair(id);
            else
                return getSpanishPair(id);
        else {
            return new LanguageData();
        }
    }

    public List<LanguageData> getAllLanguageData(String LanguageKey) {
        List<LanguageData> dataList = (List<LanguageData>) repository.findAll();
        List<LanguageData> result=new ArrayList<>();
        for(LanguageData data : dataList){
            if (data.getLang().equals(LanguageKey)){
                 result.add(data);
            }
        }
        return result;
    }

    @Override
    public boolean insertLanguageData(LanguageData languagePairs) {
        return false;
    }

    @Override
    public boolean updateLanguageData(LanguageData languagePairs) {
        return false;
    }


}
