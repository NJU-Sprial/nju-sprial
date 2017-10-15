package blTest;

import blservice.OnlineDesignService;
import enums.AssetType;
import enums.LoanType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vo.LoanVO;
import vo.PropertyPackageVO;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class OnlineDesignServiceImplTest {

    private static OnlineDesignService onlineDesignService;

    private static String username="yinywf",pname = "就是测试一下",loanCode = "不知道存什么";

    private static int testNumber = 0;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-context.xml");
        onlineDesignService = (OnlineDesignService) context.getBean("OnlineDesignService");
    }

    @Test
    public void testBrowseProject() throws Exception {
        System.out.println("testBrowseProject");
        List<LoanVO> loanPOS = onlineDesignService.browseProject(username, pname);
        System.out.println("loanPOS.size() = " + loanPOS.size());
        if (loanPOS.size() > 0) {
//            System.out.println("loanPOS.get(0).getLoanCode() = " + loanPOS.get(0).getLoanCode());
//            System.out.println("loanPOS.get(0).getRateType() = " + loanPOS.get(0).getRateType());
//            System.out.println("loanPOS.get(0).getRate() = " + loanPOS.get(0).getRate());
            printValues(new ArrayList<Object>(loanPOS));
        }
    }

    @Test
    public void testSearchLoan() throws Exception{
        System.out.println("testSearchLoan");
        LoanVO vo = onlineDesignService.searchLoan(username,loanCode);
        if (vo!=null){
            printValues(new ArrayList<Object>(){
                {
                    add(vo);
                }
            });
        }else{
            System.out.println("vo == null");
        }
    }

    @Test public void testAlterLoan1() throws Exception{
        System.out.println("testAlterLoan1");
        List<LoanVO> loanVOS = onlineDesignService.browseProject(username, pname);
        for (LoanVO o:loanVOS) {
            o.setRate(12);
        }
        printValues(new ArrayList<>());
        System.out.println("testAlterLoan1"+onlineDesignService.alterLoan(username,pname,loanVOS));
    }

    @Test public void testAlterLoan2() throws Exception{
        System.out.println("testAlterLoan2");
        List<LoanVO> loanVOS = new ArrayList<>();
        for (LoanVO o:loanVOS) {
            o.setRate(12);
        }
        printValues(new ArrayList<>());
        System.out.println("testAlterLoan2"+onlineDesignService.alterLoan(username,pname,loanVOS));
    }

    //测试修改不在数据库中的数据
//    @Test public void testAlterLoan3() throws Exception{
//        System.out.println("testAlterLoan3");
//        List<LoanVO> loanVOS = new ArrayList<>();
//        loanVOS.add(new LoanVO("100",100,100,LocalDateTime.now(),LocalDateTime.now(),"a","b"));
//        for (LoanVO o:loanVOS) {
//            o.setRate(12);
//        }
//        printValues(new ArrayList<>());
//        System.out.println(onlineDesignService.alterLoan(username,pname,loanVOS));
//    }


    @Test
    public void testDeleteLoan()throws Exception{
        System.out.println("=====delete=====");
        System.out.println("deleteLoan:"+onlineDesignService.deleteLoan(username,"a"));
    }

    @Test
    public void testClearProject() throws Exception{
        System.out.println("====delete project=====");
        System.out.println("deleteProject:"+onlineDesignService.clearProjectData("a","a"));
    }

    @Test
    public void testSearchPropertyPackage() throws Exception{
        System.out.println("====Test SearchPropertyPackage====");
        PropertyPackageVO vo = onlineDesignService.searchPropertyPackage(username,"1");
        printValues(new ArrayList<Object>(){
            {
                add(vo);
            }
        });
    }

    @Test
    public void testAlterPropertyPackage() throws Exception{
        System.out.println("====Test AlterPropertyPackage====");
        PropertyPackageVO vo = onlineDesignService.searchPropertyPackage(username,"1");
        System.out.println("vo.getPropertyPackageId() = " + vo.getPropertyPackageId());
        vo.setPropertyNum(10);
        System.out.println(onlineDesignService.alterPropertyPackage(username,vo));
        vo = onlineDesignService.searchPropertyPackage(username,"1");
        System.out.println("vo.getPropertyNum() = " + vo.getPropertyNum());
    }

    @Test
    public void testTestProject() throws Exception{
        System.out.println(onlineDesignService.testProject(username,pname));
        System.out.println(onlineDesignService.testProject("a",pname));
        System.out.println(onlineDesignService.testProject(username,"a"));
    }

    @Test
    public void testGetProjectNameList()throws Exception{
        List<String> names = onlineDesignService.getProjectNameList(username);
        for (String name:names) {
            System.out.println(name);
        }
    }
//    @Test
    private void printValues(List<Object> oList) throws Exception{
        System.out.println("-----------------Test " + (testNumber++) + "-----------------");
        int position = 0;
        for (Object o: oList) {
            System.out.println("------position " + position++ + "-------");
            Field[] fields = o.getClass().getDeclaredFields();

            for (Field f : fields) {
                f.setAccessible(true);
                String field = f.toString().substring(f.toString().lastIndexOf(".") + 1);         //取出属性名称
                System.out.println(o.getClass().getName() + "." + field + " --> " + f.get(o));
            }
        }
        return;
    }

    @Test
    public void testHandlePersonalConsumptionLoan() throws IOException {
        onlineDesignService.importBasicPropertyData(username, pname, AssetType.ConsumerFinance, LoanType.PersonalConsumption, new File("src/main/webapp/PersonalConsumption.xlsx"));
    }
}
