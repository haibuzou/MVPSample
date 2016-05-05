# MVPSample
一点点MVP的个人心得
博客介绍: http://blog.csdn.net/dantestones/article/details/50899235

## MVC VS MVP
同样的功能使用MVC和MVP2种实现方式，比较才能更好的理解

![](http://img.blog.csdn.net/20160317163144720)


##MVC架构
- M : 业务层和模型层，相当与javabean和我们的业务请求代码
- V  : 视图层，对应Android的layout.xml布局文件
- C  : 控制层，对应于Activity中对于UI 的各种操作

##MVP架构
- M : 还是业务层和模型层
- V  : 视图层的责任由Activity来担当
- P : 新成员Prensenter 用来代理 C(control) 控制层

