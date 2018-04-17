//index.js
//获取应用实例
let timer;
let numAi = 0;
Page({

  /**
   * 页面的初始数据
   */
  data: {
    imgUrls: [
      //图片来自于小程序API
      'http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg',
      'http://img06.tooopen.com/images/20160818/tooopen_sy_175866434296.jpg',
      'http://img06.tooopen.com/images/20160818/tooopen_sy_175833047715.jpg'
    ],
    indicatorDots: false,
    autoplay: true,//自动播放
    interval: 5000,
    duration: 1000,
    movie:null//初始化json变量movie
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.loadMovie();
  },
  loadMovie(){
    wx.showToast({
      title: '正在加载',
      icon: 'loading',
      duration: 2000
    })
    let thispage=this;
  wx.request({
    url: 'http://api.douban.com/v2/movie/subject/1764796',//豆瓣域名api.douban.com已经停了小程序入口
    method:"GET",
    header:{
      'content-type':'application/json'//请求头的格式为json/或者application格式
      },
    success:function(res){
      console.log(res);
      let subject=res.data.subjects
      thispage.setdata({movie:subject})//movie为json格式
      wx.hideToast();
    }
  })
  }
})


