package blservice;

import vo.ProjectInfoVO;

import java.util.List;

/**
 * Created by 铠联 on 2017/9/2.
 */
public interface OnlineDesignService {

    /**
     * 导入基础资产数据,按照《消费金融资产池管理》中模板批量导入数据。提供下载数据模板，供券商填写后自动导入
     * @param pname 项目名称
     * @param ptype 基础资产类型——目前只有“消费金融”一类
     * @param pway 消费用途，有三类，分为：第一类：个人消费贷款、信用卡分期付款、国家助学贷款；第二类：个人汽车贷款；第三类：
     *             个人住房贷款（包含装修、租借、购买）
     * @return
     */
    public boolean importBasicPropertyData(String pname,String ptype,String pway);

    /**
     * 浏览某项目的贷款信息，一个项目包含至少一笔贷款
     * @param pname
     * @return
     */
    public List<ProjectInfoVO> browseProject(String pname);

    /**
     * 根据贷款合同编号搜索该贷款信息
     * @param loanCode
     * @return
     */
    public ProjectInfoVO searchLoan(String loanCode);

    /**
     * 修改一笔贷款信息
     * @param projectInfoVO
     * @return
     */
    public boolean alterLoan(ProjectInfoVO projectInfoVO);

    /**
     * 删除一笔贷款信息
     * @param loanCode
     * @return
     */
    public boolean deleteLoan(String loanCode);


}
