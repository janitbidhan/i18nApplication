package com.gmuswe.classdemo.repository;

import com.gmuswe.classdemo.model.LanguageData;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("I18NRepository")
public interface I18NRepository extends CrudRepository<LanguageData, String> {
}
