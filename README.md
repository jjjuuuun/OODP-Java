# SOLID Principle
- SOLID
  - 보다 효율적이고 견고하며, 유지보수가 용이한 프로그램을 만들기 위한 다섯 가지
  - **S**(Single Responsibility Principle)
  - **O**(Open/Closed Principle)
  - **L**(Liskov Substitution Principle)
  - **I**(Interface Segregation Principle)
  - **D**(Dependency Inversion Principle)
- 주의 사항
  - SOLID Principle을 지키는 것도 대부분의 경우에는 최적의 선택이 되지만 실무에서는 때때로 유연함을 발휘해야 할 때도 있음

## SRP(Single Responsibility Principle)
- **SRP**: 단일 책임 원칙
- 각 클래스는 하나의 책임(임무 & 목적)만 갖고 있어야 한다는 의미
- SRP를 지키지 않았을 때 생기는 문제
  - 각 클래스의 코드가 복잡해지고 이들의 역할을 직관적으로 이해하기 어려워짐
  - 각 클래스를 수정할 이유가 많아짐
    - 해당 클래스가 가진 책임의 개수만큼
    - 책임들 중 하나를 수정하는 일이 다른 책임에 의도시하는 영향을 끼칠 수 있음
  - 여러 책임이 한 곳에 얽혀 있기 때문에 test와 refactoring도 까다로워짐
  - 확장성과 유연성도 안좋아짐
  - 책임들이 한 곳에 묶여있다보니 필요한 것만 분리해서 가져다 사용할 수 없음
## OCP(Open/Closed Principle)
- **OCP**: 개방/폐쇄 원칙
- 각 클래스가 확장에는 열려 있어야 하고, 변경에는 닫혀 있어야 한다는 원칙
- 클래스를 수정은 하지 말고 확장을 해서 사용하라는 의미
- 기존의 코드를 수정하는 과정에서 발생할 수 있는 문제들로부터 자유로운 설계를 할 수 있음
- OCP를 지키지 않았을 때 생기는 문제
  - 기존의 코드를 수정하는 과정에서 실수로 기존 과정에 영향을 주게 될 수도 있고 기존의 코드를 이미 사용하던 곳들에 부작용이 생길 수 있음
## LSP(Liskov Substitution Principle)
- **LSP**: 리스코프 치환 원칙
- 자식 클래스는 언제나 부모 클래스를 대체할 수 있어야 한다.
  - 자식은 최소한 부모가 하는 일은 다 해야 한다는 뜻
- 부모 클래스의 객체가 들어가 있는 자리에 자식 클래스가 들어가도 기존에 하던 일에는 지장이 없어야 한다.
## ISP(Interface Segregation Principle)
- **ISP**: 인터페이스 분리 원칙
- 클래스는 자신이 사용하지 않을 메소드를 구현하도록 강요받지 말아야 한다.
## DIP(Dependency Inversion Principle)
- **DIP**: 의존성 역전 법칙
- 고수준 모듈이 저수준 모듈에 의존해서는 안된다는 원칙
- 고수준 모듈: 추상화된 로직을 제공하는 모듈(Ex. 리모콘)
- 저수준 모듈: 구체적인 동작을 직접 구현하는 모듈(Ex. TV, 에어컨 등 리모콘을 통해 동작을 직접 하는 객체)

# Behavioral Patterns
## 1. Chain Of Responsibility
## 2. Command
## 3. Interpreter
## 4. Iterator
## 5. Mediator
## 6. Memento
## 7. Observer
## 8. Publish Subscriber
## 9. Specification
## 10. State
## 11. Strategy
## 12. Template Method
## 13. Visitor

# Creational Patterns
## 1. Abstract Factory
## 2. Builder
## 3. Factory
## 4. Prototype
## 5. Singleton

# Structural Patterns
## 1. Adapter
## 2. Bridge
## 3. Composite
## 4. Decorator
## 5. Facade
## 6. Flyweight
## 7. Proxy