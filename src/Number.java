public class Number {
    public void setNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    double number;
    public int sum(){
        double n1=(int)number/1;
        double n2=(int)((number-(int)number)*10);
        double n3=((int)((number-(int)number)*100))%10;
        if(n3<5){
            n3+=1;
        }
        int sum1= (int) (n1+n2+n3);
        return sum1;
    }
}

