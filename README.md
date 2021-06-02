# bulider-pattern
建造者模式
建造者模式
定义
将一个复杂对象的构建与表示分离，使得同样的构建过程可以创建不同的表示。

结构
抽象建造者类（builder）：为创建product对象而指定各个组件的抽象接口

具体建造类（concreteBuilder）：实现builder接口，重写方法构建不同的表示

产品类（product）：具体的产品

指挥者类（director）：构建一个使用builder接口的对象
