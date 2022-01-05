/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.java.a.java.activity.one;

import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author andri
 */
class process {
    public String getName(HttpServletRequest data) {
      String thisisname = data.getParameter("name");
      return thisisname;
    }
    public String getQty(HttpServletRequest data){
      String thisisquantity = data.getParameter("quantity");
      return thisisquantity;
    }
    public Double dataQty(String inputquantity){
      Double input_quantity = Double.valueOf(inputquantity);
      return input_quantity;
    }
    public String getPrice(HttpServletRequest data){
      String thisisprice = data.getParameter("price");
      return thisisprice;
    }
    public Double dataPrice(String inputprice){
      Double input_price = Double.valueOf(inputprice);
      return input_price;
    }
    public String getMoney(HttpServletRequest data)
    {
        String thisismoney = data.getParameter("money");
        return thisismoney;
    }
     public Double dataMoney (String money){
         Double itsmoney = Double.valueOf(money);
         return itsmoney;
     }
    public Double getPriceTotal(Double input_price, Double input_quantity){
        Double PriceTotal = input_price * input_quantity;
        return PriceTotal;
    }
    public String getDiscount(Double PriceTotal){
      String DisplayDiscount = "";
        if (PriceTotal < 16000)
        {
            return DisplayDiscount = ("You don't get any discounts...");
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            return DisplayDiscount = ("Yeay! You got 10% discount!");
        }
        else if (PriceTotal > 25000)
        {
            return DisplayDiscount = ("Yeay! You got 15% discount!");
        }
        return DisplayDiscount;
    }
    public Double getTotalDiscount(Double PriceTotal){
        
        Double getTotalDisc = null;
      
        if (PriceTotal < 16000)
        {
            getTotalDisc = 0 * PriceTotal/100;
            return getTotalDisc;
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            getTotalDisc = 10 * PriceTotal/100;
            return getTotalDisc;
        }
        else if (PriceTotal > 25000)
        {
            getTotalDisc = 15 * PriceTotal/100;
            return getTotalDisc;
        }
        return getTotalDisc;
    }
    public Double getFinal(Double PriceTotal, Double getTotalDisc){
        Double getFinalPrice = null;
        if (PriceTotal < 16000)
        {
            getFinalPrice = PriceTotal - getTotalDisc;
            return getFinalPrice;
        }
        else if (PriceTotal >= 16000 && PriceTotal < 25000)
        {
            getFinalPrice = PriceTotal - getTotalDisc;
            return getFinalPrice;
        }
        else if (PriceTotal >= 25000)
        {
            getFinalPrice = PriceTotal - getTotalDisc;
            return getFinalPrice;
        }
        return getFinalPrice;
    }
    public Double getReturn (Double itsreturn, Double money, Double getFinalPrice)
    {
        itsreturn = money - getFinalPrice;
        return itsreturn;
    }      
}
