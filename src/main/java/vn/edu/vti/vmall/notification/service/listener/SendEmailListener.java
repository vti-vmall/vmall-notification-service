package vn.edu.vti.vmall.notification.service.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import vn.edu.vti.vmall.api.common.payload.service.notification.request.SendEmailRequest;

@Component
@Slf4j
@RequiredArgsConstructor
public class SendEmailListener {
  @RabbitListener(
      queues = "#{queueConfigProperties.getSendEmail().getQueueName()}"
  )
  public void listenSendEmailRequest(
      SendEmailRequest sendEmailRequest
  ){
    log.info("(listenSendEmailRequest)target: [{}] with content: [{}]",
        sendEmailRequest.getTarget(),
        sendEmailRequest.getContent());
  }
}
