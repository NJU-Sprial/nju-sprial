/**
 * Created by xiaoJun on 2017/9/8.
 */

function packageAnalysisPieChart(chart) {

    option = {
        title : {
            text: '资产池五级分类',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            bottom: 0,
            left: 'center',
            data: ['正常','关注','次级','可疑','损失']
        },
        grid:{
            top: '5%',
            left: '8%',
            right: '8%',
            height: '80%'
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '50%'],
                data:[
                    {value:335, name:'正常'},
                    {value:310, name:'关注'},
                    {value:234, name:'次级'},
                    {value:135, name:'可疑'},
                    {value:1548, name:'损失'}
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    chart.setOption(option);
}