package extensibleXMLAuthoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import util.Client;

/**
 * Created by dongye on 12/25/16.
 */
@Controller(value="/myns")
public class SimpleController {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    Client client;

    @RequestMapping(value="/dateformat")
    public String getDateFormat(){
        System.out.println(ctx.getBean("defaultDateFormat").getClass());
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat)ctx.getBean("defaultDateFormat");
        System.out.println(simpleDateFormat.format(new Date()));
        System.out.println(client.getPersistenceContextType()+":"+client.getIsolation()+":"+ Connection.TRANSACTION_SERIALIZABLE);
        System.out.println(ctx.getBean("level"));
        System.out.println(ctx.getBean("aproperty"));
        return "submitEmployee";
    }
}
