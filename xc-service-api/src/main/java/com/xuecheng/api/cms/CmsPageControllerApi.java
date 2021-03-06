package com.xuecheng.api.cms;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * Created by 16114 on 2019/6/1.
 */
@Api(value="cms页面管理接口",description = "cms页面管理接口，提供页面的增、删、改、查")
public interface CmsPageControllerApi {
    //页面查询

    /**
     *
     * @param page  当前页码
     * @param size 每页显示记录数
     * @param queryPageRequest 模型类
     * @return
     */
    @ApiOperation("分页查询页面列表")
    @ApiImplicitParams({
        @ApiImplicitParam(name="page",value = "页码",required=true,paramType="path",dataType="int"),
        @ApiImplicitParam(name="size",value = "每页记录数",required=true,paramType="path",dataType="int")
     })
    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest) ;


    @ApiOperation("新增页面")
    public CmsPageResult add(CmsPage cmsPage);
    @ApiOperation("通过ID查询页面")
    public CmsPage findById(String id);
    @ApiOperation("修改页面")
    public CmsPageResult edit(String id,CmsPage cmsPage);
    @ApiOperation("删除页面")
    public ResponseResult delete(String id);
}
