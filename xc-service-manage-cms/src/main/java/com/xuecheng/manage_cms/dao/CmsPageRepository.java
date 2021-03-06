package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by 16114 on 2019/6/1.
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    //根据页面名称查询
    CmsPage findByPageName(String pageName);
    //根据页面名称、站点id、页面路径查询findByPageNameAndSiteIdAndPageWebPath
    CmsPage findByPageNameAndSiteIdAndPageWebPath(String pageName, String siteId, String pageWebPath);
}
