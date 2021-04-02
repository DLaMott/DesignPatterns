final class Product {

    private String startUpMessage;
    private String bodyType;
    private int noOfWheels;
    private int noOfHeadLights;
    private String endOperationsMessage;

    public Product(final String startUpMessage, String bodyType, int noOfWheels, int noOfHeadLights, String endOperationsMessage){

        this.startUpMessage = startUpMessage;
        this.bodyType = bodyType;
        this.noOfWheels = noOfWheels;
        this.noOfHeadLights = noOfHeadLights;
        this.endOperationsMessage = endOperationsMessage;
    }
    /*
    Setter methods not used to promote immutability.
     */
    @Override
    public String toString(){
        return "Product Completed as:\n startUpMessage=" + startUpMessage + "\n bodyType="
                + bodyType + "\n noOfWheels=" + noOfWheels + "\n noOfHeadLights" + noOfHeadLights
                + "\n endOperationsMessage=" + endOperationsMessage;
    }
}
