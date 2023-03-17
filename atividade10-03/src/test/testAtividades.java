package test;

import org.junit.Assert;
import org.junit.Test;
import ex02.*;

public class testAtividades {

    @Test
    public void circulo() {
        Circulo circulo1 = new Circulo(32);
        Circulo circulo2 = new Circulo(44);
        Circulo circulo3 = new Circulo(17);
        
        double area = circulo1.area();

        Assert.assertEquals("",3216.896, area, 0);
    }
}
