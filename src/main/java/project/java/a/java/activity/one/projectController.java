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
    
    @RequestMapping("/fruits")
    public String getData(HttpServletRequest data, Model discountprocess){
        
        process thisisprocess = new process();
        
        String inputname = thisisprocess.getName(data);
        
        String inputprice = thisisprocess.getPrice(data);
        Double input_price = thisisprocess.dataPrice(inputprice);
        
        String inputquantity = thisisprocess.getQty(data);
        Double input_quantity = thisisprocess.dataQty(inputquantity);
        
        String inputmoney = thisisprocess.getMoney(data);
        Double thisismoney = thisisprocess.dataMoney(inputmoney);
        
        Double price_total = thisisprocess.getPriceTotal(input_price, input_quantity);
        
        String discount = thisisprocess.getDiscount(price_total);
        
        Double totalDiscount = thisisprocess.getTotalDiscount(price_total);
        
        Double finalPrice = thisisprocess.getFinal(price_total, totalDiscount);
        
        Double thisisreturn = thisisprocess.getReturn(finalPrice, thisismoney, finalPrice);

        discountprocess.addAttribute("name", inputname);
        discountprocess.addAttribute("price", inputprice);
        discountprocess.addAttribute("quantity", inputquantity);
        discountprocess.addAttribute("money", inputmoney);
        discountprocess.addAttribute("pricetotal",price_total);
        discountprocess.addAttribute("discount", discount);
        discountprocess.addAttribute("totalDiscount", totalDiscount);
        discountprocess.addAttribute("finalPrice", finalPrice);
        discountprocess.addAttribute("return", thisisreturn);
        
        return "AnnisaDivayuAndriyani";
    }

}

