# Dekoder

### 这是什么
这是一个音乐播放器。<br/>
使用Material Design的规范进行UI设计。

### 语言
+ [English](./README.md)

![0](./art/01.jpg)

### 进度
+ [X] 读取元数据
+ [X] GUI
+ [X] 播放与暂停
+ [ ] 进度条
+ [ ] 识别音频
+ [ ] 用于音频格式的DSL

### 外部库
+ [JFoenix](https://github.com/jfoenixadmin/JFoenix)

### 说明
有两个artifact，一个是纯Kotlin的CUI版，一个是GUI版，GUI是基于JavaFX的。<br/>
这也是我仍然在此项目中使用Java的原因，不过Java在本项目中仅仅是作为一个UI与业务逻辑的接口。<br/>
GUI比较强大，选择文件打开即可。