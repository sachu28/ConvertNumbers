
import org.junit.*;


public class test {

     ConvertNumberstoWord convernum = new ConvertNumberstoWord();
 
   
    @Test
    public void UnitToUnits() {
      
        Assert.assertEquals( "5" , "five" , convernum.convert(5));
        
    }

    @Test
    public void TenToTens() {
      
        Assert.assertEquals( "29" , "Twentynine" , convernum.convert(29));
        
    }

    @Test
    public void HundredToHundreds() {
      
        Assert.assertEquals( "870" , "Eight Hundred Seventy" , convernum.convert(870));
        
    }

    @Test
public void Invalid() {
    
    Assert.assertEquals( "1000" , "Invalid" , convernum.convert(1000));
    
}

}

