/**
 * Created by 铠联 on 2017/10/7.
 */

var remainPieChart = echarts.init(document.getElementById("remainPieContainer"));
var contractPieChart = echarts.init(document.getElementById("contractPieContainer"));
var ratePieChart = echarts.init(document.getElementById("ratePieContainer"));
var regionPieChart = echarts.init(document.getElementById("regionPieContainer"));
var industryPieChart = echarts.init(document.getElementById("industryPieContainer"));
var scalePieChart = echarts.init(document.getElementById("scalePieContainer"));
var agePieChart = echarts.init(document.getElementById("agePieContainer"));

var remainName = ['0-0.5(含)','0.5-1.0(含)', '1.0-2.0(含)', '2.0-3.0(含)', '3.0-4.0(含)','4.0-5.0(含)','>5.0'];
var contractName = ['0-30', '3-5', '5-10', '>10'];
var rateName = ['4-4.5', '4.5-5', '5-5.5', '5.5-6', '6-6.5', '6.5-7'];
var regionName = ['河南省', '辽宁省', '河北省', '江苏省', '安徽省', '山东省', '广东省', '湖南省', '吉林省', '其他'];
var industryName = ['电力、热力生产和供应业', '煤炭开采和洗选业', '黑色金属冶炼和压延加工业', '道路运输业', '铁路运输业', '化学原料和化学制品制造业',
    '石油加工、炼焦和核燃料加工业', '食品制造业', '房屋建筑业', '其它'];
var scaleName = ['<0.5(含)','0.5-1.0(含)', '1.0-2.0(含)', '2.0-3.0(含)', '3.0-5.0(含)', '>5.0'];
var ageName = ['0-0.5(含)','0.5-1.0(含)', '1.0-2.0(含)', '2.0-3.0(含)', '3.0-5.0(含)', '5.0-10.0(含)', '>10.0'];

var remainData = [21, 35, 37, 42, 61, 33, 16];
var contractData = [24,46,37,30];
var rateData = [21, 35, 37, 42, 61, 33];
var regionData = [21, 35, 37, 42, 61, 33, 16, 55, 26, 30];
var industryData = [21, 35, 33, 42, 21, 33, 50, 55, 26, 30];
var scaleData = [21, 35, 33, 42, 21, 33];
var ageData = [21, 35, 33, 42, 21, 33, 31];

$(function () {
    packageAnalysisPieChart(remainPieChart, '贷款剩余期限分布', remainName, remainData);
    packageAnalysisPieChart(contractPieChart, '贷款合同期限分布', contractName, contractData);
    packageAnalysisPieChart(ratePieChart, '贷款利率分布', rateName, rateData);
    packageAnalysisPieChart(regionPieChart, '入池资产地域分布', regionName, regionData);
    packageAnalysisPieChart(industryPieChart, '资产池前十大行业分布', industryName, industryData);
    packageAnalysisPieChart(scalePieChart, '贷款规模分布', scaleName, scaleData);
    packageAnalysisPieChart(agePieChart, '贷款账龄分布', ageName, ageData);

    //资产包管理统计分析按钮切换
    $("#assetsBasicsButton").click(function () {
        $(this).addClass("cashClickButton");
        $("#assetsCountButton").removeClass("cashClickButton");
        $("#assetsBasics").removeClass("displayNone");
        $("#assetsCount").addClass("displayNone");
    });
    $("#assetsCountButton").click(function () {
        $(this).addClass("cashClickButton");
        $("#assetsBasicsButton").removeClass("cashClickButton");
        $("#assetsBasics").addClass("displayNone");
        $("#assetsCount").removeClass("displayNone");
        fiveClassPieChart.resize();
        remainPieChart.resize();
        contractPieChart.resize();
        ratePieChart.resize();
        regionPieChart.resize();
        industryPieChart.resize();
        scalePieChart.resize();
        agePieChart.resize();
    });
})