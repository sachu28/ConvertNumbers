
import org.junit.*;


public class test {

     ConvertNumberstoWord convernum = new ConvertNumberstoWord();
 
   
    @Test
    public void UnitToUnits() {
      
        Assert.assertEquals( "1" , "One" , convernum.convert(1));
        
    }

    @Test
    public void TenToTens() {
      
        Assert.assertEquals( "19" , "Nineteen" , convernum.convert(19));
        
    }

    @Test
    public void HundredToHundreds() {
      
        Assert.assertEquals( "878" , "Eight Hundred Seventy Eight" , convernum.convert(878));
        
    }

    @Test
public void Invalid() {
    
    Assert.assertEquals( "1000" , "Invalid" , convernum.convert(1000));
    
}

}

