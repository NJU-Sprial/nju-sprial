package bl;

import blservice.PublishCooperationService;
import org.springframework.stereotype.Service;
import vo.ProjectCooperationVO;

import java.io.File;
import java.util.List;

/**
 * TODO
 * Created by Water on 2017/9/7.
 */
@Service
public class PublishCooperationServiceImpl implements PublishCooperationService {


    /**
     * 获取用户所有的项目
     *
     * @param username
     * @return 项目列表
     */
    @Override
    public List<ProjectCooperationVO> getCooperationProjectList(String username) {
        return null;
    }

    /**
     * 获取项目的文件
     *
     * @param projectID
     * @return 返回项目文件
     */
    @Override
    public File getProjectFile(String projectID) {
        return null;
    }

    /**
     * 上传项目文件
     *
     * @param projectID
     * @param file
     * @return 上传是否成功
     */
    @Override
    public boolean uploadProjectFile(String projectID, File file) {
        return false;
    }
}
