package com.binfoo.www.improve;

/**
 * Created by binfoo on 2017/9/3.
 */
public class ListTest {
    private final static String[] sbglist = new String[]{
            "富瀚微",
            "全志科技",
            "先导智能",
            "联得装备",
            "苏州科达",
            "广信材料",
            "北部湾旅",
            "康尼机电",
            "三环集团",
            "科森科技",
            "熙菱信息",
            "东方网力",
            "浙江鼎力",
            "华正新材",
            "桃李面包",
            "视源股份",
            "欧普康视",
            "岭南园林",
            "荣泰健康",
            "春秋航空",
            "杰克股份",
            "耐威科技",
            "强力新材",
            "航新科技",
            "长川科技",
            "拓斯达",
            "德尔股份",
            "晨曦航空",
            "博世科",
            "平治信息",
            "艾华集团",
            "三棵树",
            "联明股份",
            "星云股份",
            "安图生物",
            "晨光文具",
            "克来机电",
            "精测电子",
            "东方时尚",
            "凯普生物",
            "中来股份",
            "龙马环卫",
            "益丰药房",
            "海兴电力",
            "宁波高发",
            "弘亚数控",
            "贵阳银行",
            "延江股份",
            "拓普集团",
            "全信股份",
            "瑞特股份",
            "星网宇达",
            "润达医疗",
            "腾龙股份",
            "歌力思",
            "塞力斯",
            "莱克电气",
            "兆易创新",
            "好莱客",
            "高能环境",
            "宣亚国际",
            "立昂技术",
            "中文在线",
            "创新股份",
            "新宝股份",
            "普利制药",
            "恒华科技",
            "欧普照明",
            "索菱股份",
            "唐德影视",
            "苏试试验",
            "星源材质",
            "欧派家居",
            "曲美家居",
            "华懋科技",
            "柳州医药",
            "地尔汉宇",
            "扬杰科技",
            "尚品宅配",
            "飞科电器",
            "蓝思科技",
            "胜宏科技",
            "山河药辅",
            "开润股份",
            "迈克生物",
            "凯莱英",
            "老百姓",
            "新泉股份",
            "飞荣达",
            "博思软件",
            "绝味食品",
            "道氏技术",
            "新城控股",
            "康弘药业",
            "裕同科技",
            "景旺电子",
            "华友钴业",
            "艾比森",
            "口子窖",
            "金牌厨柜",
            "顾家家居",
            "爱司凯",
            "科达利",
            "天成自控",
            "新经典",
            "富煌钢构",
            "昆仑万维",
            "新坐标"
    };

    private final static String[] grps = new String[] {
            "世联行",
            "京能置业",
            "中远海控",
            "大秦铁路",
            "铁龙物流",
            "天成自控",
            "先导智能",
            "杭氧股份",
            "南京新百",
            "辅仁药业",
            "智飞生物",
            "恒瑞医药",
            "永安药业",
            "亿帆医药",
            "一汽富维",
            "鸿特精密",
            "潍柴动力",
            "山西汾酒",
            "水井坊",
            "沱牌舍得",
            "贵州茅台",
            "五粮液",
            "泸州老窖",
            "中炬高新",
            "涪陵榨菜",
            "牧原股份",
            "恒通科技",
            "三圣股份",
            "北新建材",
            "华新水泥",
            "塔牌集团",
            "闰土股份",
            "海达股份",
            "新安股份",
            "鲁西化工",
            "红太阳",
            "滨化股份",
            "三友化工",
            "万华化学",
            "兴发集团",
            "雅化集团",
            "天原集团",
            "中泰化学",
            "黑猫股份",
            "江山化工",
            "山东海化",
            "洛阳钼业",
            "华友钴业",
            "盛和资源",
            "鄂尔多斯",
            "北方稀土",
            "天齐锂业",
            "赣锋锂业",
            "中国铝业",
            "云铝股份",
            "新钢股份",
            "杭萧钢构",
            "东方铁塔",
            "北讯集团",
            "韶钢松山",
            "方大特钢",
            "太钢不锈",
            "柳钢股份",
            "马钢股份",
            "安阳钢铁",
            "南钢股份",
            "凌钢股份",
            "宝钢股份",
            "包钢股份",
            "鞍钢股份",
            "山西焦化",
            "潞安环能",
            "平煤股份",
            "陕西煤业",
            "恒源煤电",
            "山煤国际",
            "上海能源",
            "露天煤业",
            "蓝焰控股",
            "神火股份",
            "北纬科技",
            "南极电商",
            "科大讯飞",
            "法拉电子",
            "蓝思科技",
            "长盈精密",
            "长信科技",
            "江粉磁材",
            "立讯精密",
            "欧菲光",
            "歌尔股份",
            "合力泰",
            "三安光电",
            "华灿光电",
            "国星光电",
            "中电广通",
            "亨通光电",
            "凯乐科技",
            "信维通信",
            "东山精密",
            "中兴通讯",
            "安洁科技",
            "中国太保",
            "中国平安",
            "招商银行",
            "安通控股",
            "联美控股",
            "中国联通",
            "汇川技术",
            "海康威视",
            "大华股份",
            "大族激光",
            "三一重工",
            "摩恩电气",
            "首旅酒店",
            "威华股份",
            "浙江美大",
            "山鹰纸业",
            "华泰股份",
            "太阳纸业",
            "晨鸣纸业",
    };


    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for(int i = 0 ; i <sbglist.length;i++ ){

            for(int j=0;j<grps.length;j++){
                if(sbglist[i].equals(grps[j])){
                    System.out.println(sbglist[i]);
                }
            }

        }

        long stop = System.currentTimeMillis();

        System.out.println(stop-start);
    }


}