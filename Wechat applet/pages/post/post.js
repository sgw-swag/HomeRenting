// pages/post/post.js

const app = getApp()
var that
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },

  getData() {
    wx.request({
      url: '你的服务器链接',
      success(res) {
        console.log(res.data)
        var temp = res.data
        for (var i = 0; i < temp.length; i++)
          if (temp[i].text.length > 200)
            temp[i].text = temp[i].text.substring(0, 201) + '...';
        that.setData({
          posts: temp,

        })
        wx.hideLoading({})
        wx.stopPullDownRefresh({})
      }
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    that = this
    wx.showLoading({
      title: '加载中',
    })
    that.getData()
  },

  onItemClick: function (e) {
    wx.navigateTo({
      url: '../../pages/post_detail/post_detail?id=' + e.currentTarget.dataset.id,
    })
  },

  onPullDownRefresh: function () {
    wx.showNavigationBarLoading(); //在标题栏中显示加载
    that.getData();
    wx.hideNavigationBarLoading();
  },

  onPublishClick: function () {
    wx.navigateTo({
      url: '../publish/publish',
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  }
})