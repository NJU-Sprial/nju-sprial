
$(document).ready(function () {
    //用户类型的中英文对应
    let nameMap={
        "券商":"SecuritiesTrader",
        "投资人":"Investor",
        "中介":"Intermediary",
    };

    //选项卡的点击监听，修改选项卡外观的同时将存储着用户类型的<input>标签的value改变
    $(".select-item").click(function(event){
        $(".select-item").removeClass("selected");
        $(this).addClass("selected");
        $(this).parent().parent().find("input").val(nameMap[$(this).text().trim()]);
    });
});