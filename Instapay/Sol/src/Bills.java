public abstract class Bills {
    private int price = 0;
    Bills(int price){this.price = price;}
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return this.price;
    }

    public void creatBill(){}
    public void deductingBill(){}
}
