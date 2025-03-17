# Bridge (브릿지 패턴)
> [!NOTE]
> 브릿지 패턴은 추상화와 구현을 분리해서 이 둘을 독립적으로 다양화할 수 있도록 하는 패턴입니다.
> 구현 클래스와 추상화 클래스로 나누어지며 추상화 클래스는 구현 클래스에 의존적입니다.

- Example
  - Device
    - Implementation Class: `Device`(`TV`, `Radio`)
    - Abstract Class: `Remote`(`BasicRemote`, `AdvancedRemote`)
  - Message
    - Implementation Class: `Sender`(`EmailSender`, `SMSSender`)
    - Abstract Class: `Message`(`TextMessage`, `EncryptedMessage`)