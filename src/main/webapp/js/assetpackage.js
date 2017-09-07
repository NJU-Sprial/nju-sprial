/**
 * Created by xiaoJun on 2017/9/6.
 */

$(function () {

    //资产包管理浏览维护搜索框动画
    $("#projectSearchInput").blur(function () {
        if($(this).val() == "" || $(this).val() == null){
            $(this).attr("placeholder","搜索");
            $(this).animate({width:"120px"});
            $(this).css("border-color","#999");
            $(this).css("box-shadow","0px 0px 0px #18ba60");
            $(".search-button").removeClass("green");
        }
    }).focus(function () {
        $(this).animate({width:"280px"});
        $(this).attr("placeholder","请输入资产包编号");
        $(this).css("border-color","#18ba60");
        $(this).css("box-shadow","0px 0px 2px #18ba60");
        $(".search-button").addClass("green");
    });

    //资产包管理现金流测算按钮切换
    $("#cashSummaryButton").click(function () {
        $(this).addClass("cashClickButton");
        $("#cashDetailButton").removeClass("cashClickButton");
        $("#cashSummary").removeClass("displayNone");
        $("#cashDetail").addClass("displayNone");
    });
    $("#cashDetailButton").click(function () {
        $(this).addClass("cashClickButton");
        $("#cashSummaryButton").removeClass("cashClickButton");
        $("#cashSummary").addClass("displayNone");
        $("#cashDetail").removeClass("displayNone");
    })
})