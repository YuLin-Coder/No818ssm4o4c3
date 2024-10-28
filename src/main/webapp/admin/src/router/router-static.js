import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import bisaixinxi from '@/views/modules/bisaixinxi/list'
    import bisaixiangmu from '@/views/modules/bisaixiangmu/list'
    import saiqiantongzhi from '@/views/modules/saiqiantongzhi/list'
    import teshuduiyuan from '@/views/modules/teshuduiyuan/list'
    import duiyuan from '@/views/modules/duiyuan/list'
    import saizhongxinxi from '@/views/modules/saizhongxinxi/list'
    import qiquanxinxi from '@/views/modules/qiquanxinxi/list'
    import saiqianbianpai from '@/views/modules/saiqianbianpai/list'
    import caipanyuan from '@/views/modules/caipanyuan/list'
    import bisaibaoming from '@/views/modules/bisaibaoming/list'
    import saishichengji from '@/views/modules/saishichengji/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '新闻资讯',
        component: news
      }
          ,{
	path: '/bisaixinxi',
        name: '比赛信息',
        component: bisaixinxi
      }
          ,{
	path: '/bisaixiangmu',
        name: '比赛项目',
        component: bisaixiangmu
      }
          ,{
	path: '/saiqiantongzhi',
        name: '赛前通知',
        component: saiqiantongzhi
      }
          ,{
	path: '/teshuduiyuan',
        name: '特殊队员',
        component: teshuduiyuan
      }
          ,{
	path: '/duiyuan',
        name: '队员',
        component: duiyuan
      }
          ,{
	path: '/saizhongxinxi',
        name: '赛中信息',
        component: saizhongxinxi
      }
          ,{
	path: '/qiquanxinxi',
        name: '弃权信息',
        component: qiquanxinxi
      }
          ,{
	path: '/saiqianbianpai',
        name: '赛前编排',
        component: saiqianbianpai
      }
          ,{
	path: '/caipanyuan',
        name: '裁判员',
        component: caipanyuan
      }
          ,{
	path: '/bisaibaoming',
        name: '比赛报名',
        component: bisaibaoming
      }
          ,{
	path: '/saishichengji',
        name: '赛事成绩',
        component: saishichengji
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
