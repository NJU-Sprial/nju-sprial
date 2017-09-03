package blservice;

import vo.ProjectCooperationVO;

import java.io.File;
import java.util.List;

/**
 * Created by xiaoJun on 2017/9/3.
 * 券商 发行协作服务
 */
public interface PublishCooperationService {

    /**
     * 获取用户所有的项目
     * @return 项目列表
     */
    public List<ProjectCooperationVO> getCooperationProjectList();


    /**
     * 获取项目的文件
     * @return 返回项目文件
     */
    public File getProjectFile(String projectID);

    /**
     * 上传项目文件
     * @return 上传是否成功
     */
    public boolean uploadProjectFile(File file);

}
