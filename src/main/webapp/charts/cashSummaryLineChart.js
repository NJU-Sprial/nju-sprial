/**
 * Created by xiaoJun on 2017/9/7.
 */

$(function () {
    var chart = echarts.init(document.getElementById("cashSummaryChartContainer"));

    option = {
        legend: {
            data:['各期现金流']
        },
        // toolbox: {
        //     show : true,
        //     feature : {
        //         mark : {show: true},
        //         dataView : {show: true, readOnly: false},
        //         magicType : {show: true, type: ['line', 'bar']},
        //         restore : {show: true},
        //         saveAsImage : {show: true}
        //     }
        // },
        calculable : true,
        xAxis : [
            {
                type : 'category',
                boundaryGap : false,
                data : ['周一','周二','周三','周四','周五','周六','周日']
            }
        ],
        yAxis : [
            {
                type : 'value',
                axisLabel : {
                    formatter: '{value}万元'
                }
            }
        ],
        series : [
            {
                name:'各期现金流',
                type:'line',
                data:[210, 210, 210, 210, 210, 210, 0],
                markPoint : {
                    data : [
                        {type : 'max', name: '最大值'},
                        {type : 'min', name: '最小值'}
                    ]
                },
                markLine : {
                    data : [
                        {type : 'average', name: '平均值'}
                    ]
                }
            },
            // {
            //     name:'最低气温',
            //     type:'line',
            //     data:[1, -2, 2, 5, 3, 2, 0],
            //     markPoint : {
            //         data : [
            //             {name : '周最低', value : -2, xAxis: 1, yAxis: -1.5}
            //         ]
            //     },
            //     markLine : {
            //         data : [
            //             {type : 'average', name : '平均值'}
            //         ]
            //     }
            // }
        ]
    };

    chart.setOption(option);
})
