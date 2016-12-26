package extensibleXMLAuthoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dongye on 12/25/16.
 */
@Controller(value="/myns")
public class SimpleController {

    @Autowired
    ApplicationContext ctx;

    @RequestMapping(value="/dateformat")
    public String getDateFormat(){
        System.out.println(ctx.getBean("defaultDateFormat").getClass());
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat)ctx.getBean("defaultDateFormat");
        System.out.println(simpleDateFormat.format(new Date()));
        return "submitEmployee";
    }
}
