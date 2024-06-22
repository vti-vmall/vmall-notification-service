package vn.edu.vti.vmall.notification.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import vn.edu.vti.vmall.common.queue.config.EnableCommonQueueConsumer;
import vn.edu.vti.vmall.security.config.EnableSecurityCommon;

@SpringBootApplication
@EnableCommonQueueConsumer
@EnableSecurityCommon
public class VmallNotificationServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(VmallNotificationServiceApplication.class, args);
  }

}
