@ahthor zhangh 
@date 2018-04-26 10:23:23
1.本项目是基本maven管理的一个纯接口项目 
	版本信息:springBoot(1.4.0)+MyBatis(1.3.1)  jdk(1.8+) 单数据源(多数据源的后续完善)
2.数据库是Mysql
3.sql支持注解和xml文件配置
4.目前已经完美的的集成了pageHelper分页插件
5.本项目已经封装了一套公用的流程 已经为您省去写Controller dao service 以及实现层的繁琐代码 您只需要写自己的sql即可
6.定义接口的统一返回类ResultInfo<T>
7.加入了自定义Aop功能，比如一些日志或者是权限验证，参数验证等均可实现。
8.日志打印设置：目前仅打印启动日志和sql 如不满足个人爱好请自行设置
9.封装了统一异常处理，service实现层的异常不需要捕获 全部抛到controller即可




本例中的数据库脚本：
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) 