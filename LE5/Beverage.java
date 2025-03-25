abstract class Beverage{
    private void pourBeverage(int qty){
        System.out.println("Pour "+qty+" ml of beverage into the glass");
    }
    protected abstract void addCondiments();
    protected void Stir(){}
    private void Serve(){
        System.out.println("Serve Through the waiter");
    }
    public void templateMethod(int qty){
        pourBeverage(qty);
        addCondiments();
        Stir();
        Serve();
    }
}