# Java design patterns

## proxy pattern

- JDK动态代理实现了代理对象的接口，Cglib继承了代理对象
- JDK和Cglib都在运行时生成字节码，而Cglib使用ASM框架编写Class字节码。
- Cglib代理类的效率不如JDK
- Cglib比JDK更高效
- Cglib无法代理最终修改的方法
- MethodInterceptor＃methodProxy.invokeSuper（proxy，objects）
- 增强器设置代理对象，设置代理逻辑，创建代理对象