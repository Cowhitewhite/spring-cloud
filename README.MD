## 注释
| 服务名 | 注册中心 | 说明 |
| --- | --- | --- | 
|cloud-commons|  |公共依赖包 |
|cloud-eureka |  |eureka注册中心,集群模式|
|cloud-eureka2 |  |eureka注册中心,集群模式|
|cloud-provider |eureka| 服务提供者,集群模式|
|cloud-provider2 |eureka | 服务提供者,集群模式|
|cloud-consumer | eureka |服务消费者,restTemplate调用|
|cloud-consumer-feign | eureka |服务消费者,openFeign调用|
|cloud-provider-hystrix-payment | eureka |包含服务熔断的服务提供者|
|cloud-consumer-feign-hystrix-order | eureka |包含服务熔断的服务消费者|
|cloud-hystrix-dashboard | |hystrix服务监控仪表盘|
|cloud-gatway |eureka | 服务网关|
|cloud-config-center |eureka |读取git上配置文件的配置服务中心|
|cloud-config-center2 |eureka | 读取配置服务中心服务|
|cloud-config-3366 |eureka | 读取配置服务中心服务|
|cloud-stream-rabbitmq-provider8801 | eureka | 整合rabbitmq消息的中间件,发送消息|
|cloud-stream-rabbitmq-client8802 | eureka | 整合rabbitmq消息的中间件,接收消息|
|cloud-stream-rabbitmq-client8803 | eureka | 整合rabbitmq消息的中间件,接收消息|
|cloud-provider-zk-8004 | zookeeper | 服务提供者|
|cloud-consumer | zookeeper | 服务消费者|
|cloudalibaba-provider-payment9001 | nacos | 服务提供者|
|cloudalibaba-provider-payment9002 | nacos | 服务提供者|
|cloudalibaba-client-order83 | nacos | 服务消费者|
|cloudalibaba-config-nacos-client3377 | nacos | 服务配置|
|cloudalibaba-sentinel-service8401 | nacos |nacos服务降级、限流、熔断处理|
|seata-order-service | nacos | 分布式事务@GlobalTransactional实现|
|seata-storage-service | nacos | 分布式事务@GlobalTransactional实现|
|seata-account-service | nacos | 分布式事务@GlobalTransactional实现|

