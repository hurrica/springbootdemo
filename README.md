# wallet server

## 功能说明
    现阶段，此项目用于分离原wallet项目的mq消费功能，后续将会把wallet的其他相关功能迁移到该项目中

## 模块约定
    
    1、start项目启动入口
    2、api采用restfull风格，用于对外提供接口服务。该模块依赖于service、model、common几个模块
    3、service用于业务逻辑处理，该模块依赖于dao、model、common
    4、dao模块用于数据处理，用来操作数据库和缓存
    5、model模块存放项目中用到的实体pojo、vo、dto等
    6、common模块，项目中用到的所有常量、枚举类、工具类都应该抽象到该模块进行统一管理
    7、mybatisgenerator只用于生成数据实体，解放实体创建的繁琐过程，不允许在该模块有任何业务代码和其他代码
    
注意：理论上，严格禁止跨层次的模块调用以及反向调用，如api依赖dao、service调用api、service处理缓存等等，这些操作都应该严格禁止
