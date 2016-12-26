package extensibleXMLAuthoring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by dongye on 12/25/16.
 */
public class DateTimeBeanDefinitionParserHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
