# Design Pattern (设计模式)

[![Java](https://img.shields.io/badge/Java-1.8-orange.svg)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.4.2-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

设计模式学习项目，包含 Java 常用设计模式的完整实现代码和示例。

## 项目简介

本项目包含 **19 种设计模式** 的实现代码，涵盖创建型、结构型、行为型和 J2EE 模式四大类。每个设计模式都有独立的示例代码和详细注释，适合学习设计模式的使用场景和实现方式。

## 目录结构

```
design-pattern/
├── factory-design/          # 创建型模式
│   └── src/main/java/com/iyang/factory/design/
│       ├── abst/            # 抽象工厂模式
│       ├── prototype/       # 原型模式
│       ├── simple/          # 简单工厂模式
│       └── singleton/       # 单例模式 (8种实现)
│
├── action-design/           # 行为型 & 结构型模式
│   └── src/main/java/com/iyang/action/design/
│       ├── adapters/        # 适配器模式
│       ├── chains/          # 责任链模式
│       ├── command/         # 命令模式
│       ├── interpreters/    # 解释器模式
│       ├── mediators/       # 中介者模式
│       ├── memento/         # 备忘录模式
│       ├── nullobject/      # 空对象模式
│       ├── proxys/          # 代理模式
│       ├── states/          # 状态模式
│       ├── strategys/       # 策略模式
│       ├── templates/       # 模板方法模式
│       └── visitors/        # 访问者模式
│
└── j2e-design/              # J2EE 模式
    └── src/main/java/com/iyang/design/
        ├── bdp/             # 业务委托模式
        ├── composite/entity/ # 组合实体模式
        ├── filters/         # 拦截过滤器模式
        └── mvc/             # MVC 模式
```

## 设计模式详解

### 一、创建型模式 (Creational Patterns)

#### 1. 简单工厂模式 (Simple Factory)
- **位置**: `factory-design/simple/`
- **说明**: 定义一个工厂类，根据传入的参数决定创建哪种产品实例
- **核心类**: `ShapeFactory` - 根据形状类型创建对应的形状对象

#### 2. 抽象工厂模式 (Abstract Factory)
- **位置**: `factory-design/abst/`
- **说明**: 提供一个创建一系列相关对象的接口，无需指定具体类
- **核心类**: `AbstractFactory`, `ColorFactory` - 工厂生产者模式

#### 3. 单例模式 (Singleton)
- **位置**: `factory-design/singleton/`
- **说明**: 确保一个类只有一个实例，提供全局访问点
- **实现方式**:
  | 实现方式 | 类名 | 线程安全 | 特点 |
  |---------|------|---------|------|
  | 饿汉式 | `SingleObject` | ✅ | 类加载时创建，无线程问题 |
  | 懒汉式(非线程安全) | `LazyNoSafeSingleton` | ❌ | 延迟加载，多线程不安全 |
  | 懒汉式(线程安全) | `LazySafeSingleton` | ✅ | 双重检查锁 |
  | 双重检查锁 | `DoubleCheckSingleton` | ✅ | volatile + 双重检查 |
  | 静态内部类 | `InnerStaticSingleton` | ✅ | 利用类加载机制保证线程安全 |
  | 枚举 | `EnumSingleton` | ✅ | 最佳实践，防止反射攻击 |
  | 序列化安全 | `SeriableSingleton` | ✅ | 防止反序列化破坏单例 |

#### 4. 原型模式 (Prototype)
- **位置**: `factory-design/prototype/`
- **说明**: 通过复制现有对象来创建新对象
- **核心类**: `PrototypeCache` - 原型缓存管理

---

### 二、行为型模式 (Behavioral Patterns)

#### 1. 策略模式 (Strategy)
- **位置**: `action-design/strategys/`
- **说明**: 定义一系列算法，把它们封装起来，并使它们可以相互替换
- **核心类**: `Strategy` (策略接口), `StrategyContext` (上下文)

#### 2. 模板方法模式 (Template Method)
- **位置**: `action-design/templates/`
- **说明**: 定义算法骨架，将某些步骤延迟到子类实现
- **核心类**: `Game` (抽象模板类), `Football`, `Cricket` (具体实现)

#### 3. 命令模式 (Command)
- **位置**: `action-design/command/`
- **说明**: 将请求封装为对象，支持撤销操作
- **核心类**: `Order` (命令接口), `Broker` (调用者), `Stock` (接收者)

#### 4. 责任链模式 (Chain of Responsibility)
- **位置**: `action-design/chains/`
- **说明**: 将请求沿着处理链传递，直到有对象处理它
- **核心类**: `AbstractLogger` - 日志处理链

#### 5. 状态模式 (State)
- **位置**: `action-design/states/`
- **说明**: 允许对象在内部状态改变时改变其行为
- **核心类**: `State` (状态接口), `Context` (上下文)

#### 6. 观察者模式与中介者模式 (Mediator)
- **位置**: `action-design/mediators/`
- **说明**: 用中介对象封装对象间的交互
- **核心类**: `ChatRoom` (中介者), `User` (同事类)

#### 7. 备忘录模式 (Memento)
- **位置**: `action-design/memento/`
- **说明**: 捕获对象内部状态，并在之后恢复
- **核心类**: `Memento`, `Originator`, `CareTaker`

#### 8. 解释器模式 (Interpreter)
- **位置**: `action-design/interpreters/`
- **说明**: 为语言创建解释器，解释语言中的句子
- **核心类**: `Expression` (表达式接口), `TerminalExpression`, `AndExpression`, `OrExpression`

#### 9. 空对象模式 (Null Object)
- **位置**: `action-design/nullobject/`
- **说明**: 用空对象代替 null，避免空指针检查
- **核心类**: `NullCustomer`, `RealCustomer`, `CustomerFactory`

#### 10. 访问者模式 (Visitor)
- **位置**: `action-design/visitors/`
- **说明**: 将数据结构与数据操作分离
- **核心类**: `ComputerPartVisitor`, `ComputerPartDisplayVisitor`

---

### 三、结构型模式 (Structural Patterns)

#### 1. 适配器模式 (Adapter)
- **位置**: `action-design/adapters/`
- **说明**: 将一个类的接口转换成客户期望的另一个接口
- **核心类**: `LoginAdapter`, `LoginForQqAdapter`, `LoginForSinaAdapter`, `LoginForTelAdapter`

#### 2. 代理模式 (Proxy)
- **位置**: `action-design/proxys/`
- **说明**: 为其他对象提供代理以控制对这个对象的访问
- **核心类**: `JdkDefaultProxy` (JDK动态代理), `OrderServiceStaticProxy` (静态代理)

---

### 四、J2EE 模式

#### 1. MVC 模式
- **位置**: `j2e-design/mvc/`
- **说明**: Model-View-Controller 分离关注点
- **核心类**: `Student` (Model), `StudentView` (View), `StudentController` (Controller)

#### 2. 业务委托模式 (Business Delegate)
- **位置**: `j2e-design/bdp/`
- **说明**: 为客户端提供统一的业务服务访问入口
- **核心类**: `BusinessDelegate`, `BusinessLookUp`

#### 3. 组合实体模式 (Composite Entity)
- **位置**: `j2e-design/composite/entity/`
- **说明**: 用于 EJB 持久化机制，管理粗粒度对象
- **核心类**: `CompositeEntity`, `CoarseGrainedObject`

#### 4. 拦截过滤器模式 (Intercepting Filter)
- **位置**: `j2e-design/filters/`
- **说明**: 对请求进行预处理和后处理
- **核心类**: `Filter`, `FilterChain`, `FilterManager`

## 快速开始

### 环境要求
- JDK 1.8+
- Maven 3.6+

### 构建项目
```bash
# 克隆项目
git clone https://github.com/yourusername/design-pattern.git

# 进入项目目录
cd design-pattern

# 编译项目
mvn clean compile

# 运行测试
mvn test
```

### 运行示例
每个设计模式都有对应的 Main 类或测试类，可以直接运行查看效果：

```bash
# 运行单例模式示例
cd factory-design
mvn exec:java -Dexec.mainClass="com.iyang.factory.design.singleton.SingleObject"

# 运行策略模式示例
cd action-design
mvn exec:java -Dexec.mainClass="com.iyang.action.design.strategys.StrategyContext"
```

## 设计原则

本项目遵循 SOLID 设计原则：

| 原则 | 名称 | 说明 |
|------|------|------|
| S | 单一职责原则 (SRP) | 一个类只负责一项职责 |
| O | 开闭原则 (OCP) | 对扩展开放，对修改关闭 |
| L | 里氏替换原则 (LSP) | 子类可以替换父类 |
| I | 接口隔离原则 (ISP) | 使用多个隔离的接口 |
| D | 依赖倒置原则 (DIP) | 依赖抽象而非具体实现 |

## 参考资料

- [Design Patterns - Gang of Four](https://en.wikipedia.org/wiki/Design_Patterns)
- [Refactoring Guru - Design Patterns](https://refactoring.guru/design-patterns)

## 许可证

本项目采用 [MIT License](LICENSE) 许可证。

## 贡献

欢迎提交 Issue 和 Pull Request！