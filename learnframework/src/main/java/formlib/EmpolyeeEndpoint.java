package formlib;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import javax.validation.Valid;

/**
 * Created by nm on 12/24/2016.
 */

@Controller
@RequestMapping(value = "formlib")
public class EmpolyeeEndpoint {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView getEmployeeInfo(){
        System.out.println("How are you!");
        Employee e = new Employee();
        e.setContactNumber(2177217714L);
        e.setId(24);
        e.setName("King");
        return new ModelAndView("submitEmployee", "employee", e);
        //return "WEB-INF/view/submitEmployee.html";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String registerEmployee(@ModelAttribute("employee") @Valid Employee employee, BindingResult result, ModelMap model){ //@ModelAttribute("employee")

        if(result.hasErrors())
            return "submitEmployee";
        model.addAttribute("id", employee.id);
        model.addAttribute("name", employee.name);
        model.addAttribute("contactNumber", employee.contactNumber);
        return "employeeView";
    }

}
