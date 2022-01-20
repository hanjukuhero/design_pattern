# 简单工厂：两数计算器

## Operation 运算类 父类
    1. 定义两个数值变量
    2. 定义返回计算结果 getResult() 方法

## 具体运算操作类 子类
    1. 继承 Operation
    2. 重写 getResult() 方法
    
## 简单运算工厂类 OperationFactory
    1. 定义静态工厂方法 createOperate
    2. 声明父类引用
    3. 根据客户端传入的参数判断要实例化哪个运算操作子类
    4. 返回子类实例

## 客户端
    1. 传入运算符调用静态工厂方法获取 Opertion 实例
    2. 赋值 Operation 类的两个数值变量
    3. 获取计算结果