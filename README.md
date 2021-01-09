# 工程简介
Axon Framework 简单示例
<br>
参考Axon核心开发者的示例项目[bike-rental-extended](https://github.com/abuijze/bike-rental-extended)
<br>
工程结构上采用的是COLA

## 代码结构
COLA架构图
![COLA架构图](https://camo.githubusercontent.com/745a8c740aaa41b9e367d185a3b107a18a0d71e5d85a5721ee3f3ffc6212bb81/68747470733a2f2f696d672d626c6f672e6373646e696d672e636e2f32303230313230393139323235383834302e706e67)

1. axonsimple-infrastructure 基础实施层:数据库的CRUD,RPC,MQ,OSS等外部系统的交互处理以及作为领域防腐的功能
2. axonsimple-domain 领域层:承载领域服务和领域对象的层次,不依赖其他层,设计上做到领域层自洽
3. axonsimple-app 应用层:通过领域层将领域服务和领域对象串联起来实现具体的业务处理
4. axonsimple-client 对外通过SDK(可以作为feign client)
5. axonsimple-controller 对外提供的http访问接口

## 涉及技术
1. 构建工具Maven,后面会转成gradle
2. JDK1.8
3. MySql
4. docker
5. SpringBoot
6. AxonFramework
7. cola 4.0
8. mongo

## 启动/测试

### test需要单独作为一个模块

# 延伸阅读
[AxonFramework](https://github.com/AxonFramework/AxonFramework)

[COLA](https://github.com/alibaba/COLA)

