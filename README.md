# LoginMvpDemo
# MVP简易框架搭建
主要初始接口在mvplibrary中，在main中通过衔接mvplibrary中的接口进行实现
每个activity有三个基本的类或接口

## m model     用于网络处理或者耗时操作
## v view      用于界面的显示或者操作（button按钮，EditText输入框，TextView、ImageView、Fragment媒体显示）
## p presenter 用于衔接view和model，view操作反馈给presenter，presenter调用model中耗时或者网络操作，得到的结果返回给presenter，presenter再调用view中的方法显示在view的界面或其它操作
