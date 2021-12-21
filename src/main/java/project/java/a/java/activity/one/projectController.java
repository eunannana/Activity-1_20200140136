/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.java.a.java.activity.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

/**
 *
 * @author andri
 */
@Controller
public class projectController {
    
    @RequestMapping("/input")
    public String getData(HttpServletRequest data, Model discountprocess){
        
        String inputname = data.getParameter("var_name");
        
        String inputprice = data.getParameter("var_price");
        
        String inputquantity = data.getParameter("var_quantity");
        
        String displaytotal = data.getParameter("var_pricetotal");
        
        String displaydiscount = data.getParameter("discount");
        
        Double iPrice = Double.valueOf(inputprice);
        Double iTotal = Double.valueOf(inputquantity);
        Double PriceTotal = iPrice * iTotal;
        Double pay = null;
        
        if (PriceTotal < 16000)
        {
            displaydiscount = ("You don't get any discounts...");
            pay = PriceTotal - (0 * PriceTotal/100);
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            displaydiscount = ("Yeay! You got 10% discount!");
            pay = PriceTotal - (10 * PriceTotal/100);
        }
        else if (PriceTotal > 25000)
        {
            displaydiscount = ("Yeay! You got 15% discount!");
            pay = PriceTotal - (15 * PriceTotal/100);
        }
        
        discountprocess.addAttribute("name", inputname);
        discountprocess.addAttribute("price", inputprice);
        discountprocess.addAttribute("quantity", inputquantity);
        discountprocess.addAttribute("total", PriceTotal);
        discountprocess.addAttribute("discount", displaydiscount);
        discountprocess.addAttribute("pay", pay);
        
        return "AnnisaDivayuAndriyani";
    }

}

