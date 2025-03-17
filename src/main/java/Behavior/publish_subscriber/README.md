# Publisher-Subscriber Pattern(발행 구독 패턴)
> [!NOTE]
> 발행 구독 패턴은 복잡한 분산 시스템에서 컴포넌트 간의 느슨한 결합을 유지하면서 효율적인 비동기 통신과 확장성을 제공하여 유연합니다.

- 관찰자 패턴과 유사
  - Publisher - Subject
  - Subscriber - Observer
  - Broker 추가

- Publisher - Broker - Subscriber
  - Publisher가 Broker에게 메세지를 보내고 Broker가 이를 Publisher들에게 전달하는 형태

- Broker를 두는 장점
  - Publisher와 Subscriber를 완전히 분리하여 서로에 대한 의존성을 줄임
  - 비동기적인 작업 처리에 보다 유리

