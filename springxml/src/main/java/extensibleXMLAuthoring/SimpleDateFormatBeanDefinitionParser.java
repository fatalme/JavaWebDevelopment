package extensibleXMLAuthoring;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import java.text.SimpleDateFormat;

/**
 * Created by dongye on 12/25/16.
 */
public class SimpleDateFormatBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element){
        return SimpleDateFormat.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean){

        String pattern = element.getAttribute("pattern");
        bean.addConstructorArgValue(pattern);

        String lenient = element.getAttribute("lenient");
        if(StringUtils.hasText(lenient)){
            bean.addPropertyValue("lenient", Boolean.valueOf(lenient));
        }

    }
}
