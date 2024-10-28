
var projectName = '田径运动会成绩管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '赛前通知',
	url: './pages/saiqiantongzhi/list.html'
}, 
{
	name: '比赛信息',
	url: './pages/bisaixinxi/list.html'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssm4o4c3/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"赛前通知","menuJump":"列表","tableName":"saiqiantongzhi"}],"menu":"赛前通知管理"},{"child":[{"buttons":["查看","删除"],"menu":"裁判员","menuJump":"列表","tableName":"caipanyuan"}],"menu":"裁判员管理"},{"child":[{"buttons":["查看","删除"],"menu":"队员","menuJump":"列表","tableName":"duiyuan"}],"menu":"队员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛信息","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"比赛项目","menuJump":"列表","tableName":"bisaixiangmu"}],"menu":"比赛项目管理"},{"child":[{"buttons":["查看","审核"],"menu":"比赛报名","menuJump":"列表","tableName":"bisaibaoming"}],"menu":"比赛报名管理"},{"child":[{"buttons":["查看","审核"],"menu":"弃权信息","menuJump":"列表","tableName":"qiquanxinxi"}],"menu":"弃权信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"特殊队员","menuJump":"列表","tableName":"teshuduiyuan"}],"menu":"特殊队员管理"},{"child":[{"buttons":["查看","删除"],"menu":"赛前编排","menuJump":"列表","tableName":"saiqianbianpai"}],"menu":"赛前编排管理"},{"child":[{"buttons":["查看","删除"],"menu":"赛中信息","menuJump":"列表","tableName":"saizhongxinxi"}],"menu":"赛中信息管理"},{"child":[{"buttons":["查看","打印","导出"],"menu":"赛事成绩","menuJump":"列表","tableName":"saishichengji"}],"menu":"赛事成绩管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"赛前通知列表","menuJump":"列表","tableName":"saiqiantongzhi"}],"menu":"赛前通知模块"},{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"队员","menuJump":"列表","tableName":"duiyuan"}],"menu":"队员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"赛前编排","menuJump":"列表","tableName":"saiqianbianpai"}],"menu":"赛前编排管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"赛中信息","menuJump":"列表","tableName":"saizhongxinxi"}],"menu":"赛中信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印","导出"],"menu":"赛事成绩","menuJump":"列表","tableName":"saishichengji"}],"menu":"赛事成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"赛前通知列表","menuJump":"列表","tableName":"saiqiantongzhi"}],"menu":"赛前通知模块"},{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"裁判员","tableName":"caipanyuan"},{"backMenu":[{"child":[{"buttons":["查看","修改","删除","弃权"],"menu":"比赛报名","menuJump":"列表","tableName":"bisaibaoming"}],"menu":"比赛报名管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"弃权信息","menuJump":"列表","tableName":"qiquanxinxi"}],"menu":"弃权信息管理"},{"child":[{"buttons":["查看"],"menu":"特殊队员","menuJump":"列表","tableName":"teshuduiyuan"}],"menu":"特殊队员管理"},{"child":[{"buttons":["查看"],"menu":"赛前编排","menuJump":"列表","tableName":"saiqianbianpai"}],"menu":"赛前编排管理"},{"child":[{"buttons":["查看"],"menu":"赛中信息","menuJump":"列表","tableName":"saizhongxinxi"}],"menu":"赛中信息管理"},{"child":[{"buttons":["查看"],"menu":"赛事成绩","menuJump":"列表","tableName":"saishichengji"}],"menu":"赛事成绩管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"赛前通知列表","menuJump":"列表","tableName":"saiqiantongzhi"}],"menu":"赛前通知模块"},{"child":[{"buttons":["查看","报名"],"menu":"比赛信息列表","menuJump":"列表","tableName":"bisaixinxi"}],"menu":"比赛信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"队员","tableName":"duiyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
