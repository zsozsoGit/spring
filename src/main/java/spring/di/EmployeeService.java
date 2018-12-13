package spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDao employeeDao;
    private MailService mailService;
    private ApplicationEventPublisher applicationEventPublisher;

    public EmployeeService(@Simple EmployeeDao employeeDao) {
        System.out.println("EmployeeService constr with: " + employeeDao.toString());
        this.employeeDao = employeeDao;
    }

    public void saveEmployee(String name) {
        //Business Logic
        String trimmedName = name.trim();
        if (mailService != null) mailService.sendMail();
        if (applicationEventPublisher != null) {
            EmployeeHasCreatedEvent event = new EmployeeHasCreatedEvent(this, name);
            applicationEventPublisher.publishEvent(event);
        }
        employeeDao.saveEmployee(trimmedName);
    }

    public List<String> listEmployees() {
        return employeeDao.listEmployees();
    }

    @Autowired(required = false)
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    @Autowired(required = false)
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
