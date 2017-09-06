/**
 * Created by xiaoJun on 2017/9/6.
 */

$(function () {
    $("#projectSearchInput").blur(function () {
        if($(this).val() == "" || $(this).val() == null){
            $(this).attr("placeholder","搜索");
            $(this).animate({width:"120px"});
            $(this).css("border-color","#999");
            $(".search-button").removeClass("green");
        }
    }).focus(function () {
        $(this).animate({width:"280px"});
        $(this).attr("placeholder","请输入资产包编号");
        $(this).css("border-color","#18ba60");
        $(".search-button").addClass("green");
    })
})