class Nano extends  BasicCar {
    public int basePrice = 100000;

    public Nano(String m){
        modelName = m;
    }
// Each subclass must contain cloning process
    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        // Return this.clone
        return (Nano)super.clone();
    }

}
