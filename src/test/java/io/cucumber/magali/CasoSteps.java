package io.cucumber.magali;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.magali.servicos.Configuracao;

public class CasoSteps {

   
    @Dado("que eu estou no site {string}")
    public void que_eu_estou_no_site(String string)  {
        Configuracao.abrir(string);
    }

    @Dado("preencho o formulario Enter Vehicle Data e pressiono next")
    public void preencho_o_formulario_Enter_Vehicle_Data() throws InterruptedException {
        Thread.sleep(1000);
        
        Configuracao.id("make").click();  
        Configuracao.cssSelector(".field option[value='BMW']").click();
        Configuracao.id("model").click();  
        Configuracao.cssSelector(".field option[value='Motorcycle']").click();
        Configuracao.id("cylindercapacity").sendKeys("1");
        Configuracao.id("engineperformance").sendKeys("100");
        Configuracao.id("dateofmanufacture").sendKeys("03/01/2021");
        Configuracao.id("numberofseats").click();   
        Configuracao.cssSelector(".field option[value='5']").click();
        Configuracao.xpath("//label[text()='No']").click();
        Configuracao.id("numberofseatsmotorcycle").click();
        Configuracao.cssSelector("select[name='Number of Seats Motorcycle'] option[value='1']").click();
        Configuracao.id("fuel").click();   
        Configuracao.cssSelector(".field option[value='Petrol']").click();
        Configuracao.id("payload").sendKeys("100");
        Configuracao.id("totalweight").sendKeys("100");        
        Configuracao.id("listprice").sendKeys("500");
        Configuracao.id("licenseplatenumber").sendKeys("00");
        Configuracao.id("annualmileage").sendKeys("100");

        Configuracao.id("nextenterinsurantdata").click();
    }

    @Dado("preencho o formulario Enter Insurant Data e pressiono next")
    public void preencho_o_formulario_Enter_Insurant_Data() {
        Configuracao.id("firstname").sendKeys("Magali");
        Configuracao.id("lastname").sendKeys("Silva");
        Configuracao.id("birthdate").sendKeys("12/04/1994");
        Configuracao.xpath("//label[text()='Female']").click();
        Configuracao.id("streetaddress").sendKeys("Rua Qualquer");
        Configuracao.id("country").click();   
        Configuracao.cssSelector(".field option[value='Brazil']").click();
        Configuracao.id("zipcode").sendKeys("00000000");
        Configuracao.id("city").sendKeys("Estrela");
        Configuracao.id("occupation").click();   
        Configuracao.cssSelector(".field option[value='Unemployed']").click();
        Configuracao.xpath("//label[text()=' Other']").click();
        Configuracao.id("website").sendKeys("https://github.com/dsmag");
        
        Configuracao.id("nextenterproductdata").click();
    }


    @Dado("preencho o formulario Enter Product Data e pressiono next")
    public void preencho_o_formulario_Enter_Product_Data() {
        Configuracao.id("startdate").sendKeys("06/30/2021");
        Configuracao.id("insurancesum").click();   
        Configuracao.cssSelector(".field option[value='3000000']").click();
        Configuracao.id("meritrating").click();   
        Configuracao.cssSelector(".field option[value='Bonus 1']").click();
        Configuracao.id("damageinsurance").click();   
        Configuracao.cssSelector(".field option[value='Full Coverage']").click();
        Configuracao.xpath("//label[text()='Euro Protection']").click();
        Configuracao.id("courtesycar").click();   
        Configuracao.cssSelector(".field option[value='No']").click();

        Configuracao.id("nextselectpriceoption").click();
    }


    @Dado("preencho o formulario Select Price Option e pressiono next")
    public void preencho_o_formulario_Select_Price_Option() throws InterruptedException {
        Configuracao.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)").click();
        Thread.sleep(1000);

        Configuracao.id("nextsendquote").click();
    }

    @Dado("preencho o formulario Send Quote e pressiono send")
    public void preencho_o_formulario_Send_Quote() {
        Configuracao.id("email").sendKeys("usuario@gmail.com");
        Configuracao.id("username").sendKeys("usuario");
        Configuracao.id("password").sendKeys("Usuario1");
        Configuracao.id("confirmpassword").sendKeys("Usuario1");

        Configuracao.id("sendemail").click();
    }

    @Entao("devo ver a mensagem {string}")
    public void devo_ver_a_mensagem(String string) throws InterruptedException {
        Thread.sleep(10000);
        assertEquals(string, Configuracao.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2").getText());
        Configuracao.cssSelector(".confirm").click();

        Thread.sleep(1000);
        Configuracao.fechar();
    } 
}