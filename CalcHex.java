public class CalcHex extends CalcEngine
{
    
    
  public CalcHex (){
    super();
    }
    
    public void numberPressed(int number) {
        if (!isHexadecimal) {
            super.numberPressed(number);
        } else {
            if(buildingDisplayValue) {
                displayValue = displayValue*16 + number;
            }
            else {
                displayValue = number;
                buildingDisplayValue = true;
            }
        }
    }

}
